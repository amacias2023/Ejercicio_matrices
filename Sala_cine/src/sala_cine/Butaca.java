package sala_cine;

public class Butaca {
	private boolean butaca_libre;
	private boolean butaca_bloqueada;
	//private boolean butaca_ocupada;
	
	public Butaca() {
		butaca_libre = true;
		butaca_bloqueada = false;
	}
	
	public String toString() {
		if (butaca_bloqueada) return "#";
		else 
			if (butaca_libre) return "-";
			else return "X";
	}
	
	public void setButacaBloqueada() {
		butaca_bloqueada = true;
	}
}
