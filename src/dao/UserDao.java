package dao;

import util.DbUtil;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;


public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
            		.prepareStatement("insert into usuarios(nome, email, senha, ddd, fone, tipo) values (?, ?, ?, ?, ?, ?);");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getSenha());
            preparedStatement.setString(4, user.getDdd());
            preparedStatement.setString(5, user.getFone());
            preparedStatement.setString(6, user.getTipo());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from usuarios where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update usuarios set nome=?, email=?, senha=?, ddd=?, fone=?, tipo=?" +
                            "where id=?"); 
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getSenha());
            preparedStatement.setString(4, user.getDdd());
            preparedStatement.setString(5, user.getFone());
            preparedStatement.setString(6, user.getTipo());
            preparedStatement.setInt(7, user.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getLista() {
    	
    		List<User> usuarios = new ArrayList<User>();
    		try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setSenha(rs.getString("senha"));
                user.setEmail(rs.getString("email"));
                user.setDdd(rs.getString("ddd"));
                user.setFone(rs.getString("fone"));
                user.setTipo(rs.getString("tipo"));
                //adicionando o objeto a lista
                usuarios.add(user);
            }
            rs.close();
			stmt.close();
            return usuarios;
        } catch (SQLException e) {
        	throw new	RuntimeException(e);
        }

        
    }
    public User getUserById(int id) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from usuarios where id=?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setSenha(rs.getString("senha"));
                user.setEmail(rs.getString("email"));
                user.setDdd(rs.getString("ddd"));
                user.setFone(rs.getString("fone"));
                user.setTipo(rs.getString("tipo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}