package sala_cine;

public class Sala {
	private Butaca asientos[][];
	private boolean modo_covid;
	private int num_filas;
	private int num_columnas;
	
	public Sala(int filas, int columnas) {
		num_filas = filas;
		num_columnas = columnas;
	}
	
	public void InicializaSala(boolean esCovid, int num_separacion) {
		modo_covid = esCovid;
		asientos = new Butaca[num_filas][num_columnas];
		int contador = 0;
		
		// modo_normal
		for (int i=0; i<num_filas; i++)
			for (int j=0; j<num_columnas; j++) {
				Butaca butaca = new Butaca();
				asientos[i][j] = butaca;

				if (modo_covid) {							
					if (contador<num_separacion) 
						contador++;
					else {
						butaca.setButacaBloqueada();
						contador = 0;
					}	
				}
			}
	}
	
	public String toString() {
		String str_devolver = "";
		Butaca butaca = new Butaca();
		
		for (int i=0;i<num_filas;i++) 
			for (int j=0; j<num_columnas; j++) {
				butaca = asientos[i][j];
				str_devolver += "FILA: "+ i + ", COLUMNA: "+j+", estado="+ butaca.toString()+"\n";
			}
		return str_devolver;
	}
	
}
