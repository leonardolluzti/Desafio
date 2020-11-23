
package model;


public class User {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String ddd;
    private String fone;
    private String tipo;
    
   
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
    @Override
    public String toString() {
        return "User [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", ddd=" + ddd + ", fone=" + fone + ", tipo=" + tipo + "]";
    }


}