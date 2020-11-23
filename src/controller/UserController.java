package controller;


import dao.UserDao;
import model.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "Usuarios", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/user.jsp";
    private static String LIST_USER = "/listUser.jsp";
    private UserDao dao;

    public UserController() {
        super();
        dao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            dao.deleteUser(id);
            forward = LIST_USER;
            request.setAttribute("usuarios", dao.getLista());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int id = Integer.parseInt(request.getParameter("id"));
            User user = dao.getUserById(id);
            request.setAttribute("user", user);
        } else if (action.equalsIgnoreCase("insert")){
            forward = INSERT_OR_EDIT;
        } else if (action.equalsIgnoreCase("listUser")){
            forward = LIST_USER;
            request.setAttribute("usuarios", dao.getLista());
        } else {
        	forward = LIST_USER;
            request.setAttribute("usuarios", dao.getLista());
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setNome(request.getParameter("nome"));
        user.setEmail(request.getParameter("email"));
        user.setSenha(request.getParameter("senha"));
        user.setDdd(request.getParameter("ddd"));
        user.setFone(request.getParameter("fone"));
        user.setTipo(request.getParameter("tipo"));
        String id = request.getParameter("id");
        if(id == null || id.isEmpty())
        {
            dao.addUser(user);
        }
        else
        {
            user.setId(Integer.parseInt(id));
            dao.updateUser(user);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("usuarios", dao.getLista());
        view.forward(request, response);
    }
}