public class Professor {
	private String nome;
	private String departamento;
	private String titulaçao;
	
	
	public Professor(String nome, String departamento, String titulaçao) {
		this.nome = nome;
		this.departamento = departamento;
		this.titulaçao = titulaçao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getTitulaçao() {
		return titulaçao;
	}


	public void setTitulaçao(String titulaçao) {
		this.titulaçao = titulaçao;
	}
	
	

}
