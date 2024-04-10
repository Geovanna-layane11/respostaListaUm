public class Gato {
	public String nome;
	public String raca;
	public int idade;
	public String cor;
	
	public Gato (String n,String r,int i, String c) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
		this.cor = c;	
	}
	
	public String getNome () {
		return nome;
	}
	public String getRaca () {
		return raca;
	}
	public int getIdade () {
		return idade;
	}
	public String getcor () {
		return cor;
	}
	public void setNome (String n) {
		this.nome = n;
	}
	public void setRaca (String r) {
		this.raca = r;
	}
	public void setIdade (int i) {
		this.idade = i;
	}
	public void setCor (String c) {
		this.cor = c;
	}
	
	public String miar () {
		return "miau miau";
	}
	
}	
	
	
	
