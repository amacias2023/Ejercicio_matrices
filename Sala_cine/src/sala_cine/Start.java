package sala_cine;

public class Start {

	public static void main(String[] args) {
		int n_filas = 5;
		int n_columnas = 5;
		boolean modo_covid = true;
		int n_separacion = 3;
		
		Sala sala_cine = new Sala(n_filas, n_columnas);
		
		sala_cine.InicializaSala(modo_covid, n_separacion);
		System.out.println(sala_cine.toString());
	}

}
