package patron.facade;

public class Usuario {
	private String usuario;
	private String pass;
	private Long id;
	
	
	public Usuario(String usuario, String pass, Long id) {
		this.usuario = usuario;
		this.pass = pass;
		this.id = id;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
