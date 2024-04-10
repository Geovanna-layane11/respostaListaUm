public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoDePublicacao;
	
public Livro (String t,String o,String e,int a) {
	this.titulo = t;
	this.autor = o;
	this.editora = e;
	this.anoDePublicacao = a;
}
	public String getTitulo () {
		return titulo;
	}
	public String getAutor () {
		return autor;
	}
	public String getEditora () {
		return editora;
	}	
	public int getAnoDePublicacao () {
		return anoDePublicacao;
	}	
	public void setTitulo (String t) {
		this.titulo = t;
	}
	public void setautor (String o) {
		this.autor= o;
	}
	public void setEditora (String e) {
		this.editora = e;
	}
	public void setanoDePublicacao (int a) {
		this.anoDePublicacao = a;
	}
	public String toString () {
		return "Titulo: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nAnoDePublicacao: " + anoDePublicacao;
	}
}
