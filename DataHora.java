public class DataHora {
	Data data;
	Hora hora;
	
	public DataHora (Data d, Hora h) {
		this.data = d;
		this.hora = h;
	}
	
	public Data getData () {
		return data;
		
	}
	
	public Hora getHora() {
		return hora;
		
	}
	
	public void setData(Data novaData) {
		this.data = novaData;
		
	}
	
	public void setHora (Hora novaHora) {
		this.hora = novaHora;
	}
	
	public String imprimirDataHora() {
		return "hora: " + hora.imprimirHora() + "\nData: " + data.imprimirData();
	}

}
