public class Carro {
	private String modelo;
	private String marca;
	private int ano;
	private String placa;

	public Carro (String o, String m, int a, String p) {
		this.modelo = o;
		this.marca = m;
		this.ano = a;
		this.placa = p;
		}
	
	public void setModelo (String o) {
		this.modelo = o;
	}
	public void setMarca (String m) {
		this.marca = m;
	}
	public void setANo (int a) {
		this.ano = a;
	}
	public void setPlaca (String p) {
		this.placa = p;
	}
	public String getModelo () {
		return modelo;
	}
	public String getMarca () {
		return marca;
	}
	public int getAno () {
		return ano;
	}
	public String getPlaca () {
		return placa;
	}
	public String toString() {
		return "Modelo:" + modelo + "\nMarca:" +marca + "\nAno" + ano +"\nPlaca" + placa;
	}

}
