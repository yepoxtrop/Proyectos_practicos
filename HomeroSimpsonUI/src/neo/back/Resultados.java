package neo.back;

public class Resultados {

	public int[] arrayTemporadas;
	public int[] arrayDiasTrabajados;
	public String[] arrayTrabajos;
	
	public Resultados(int[] arrayTemporadas, int[] arrayDiasTrabajados, String[] arrayTrabajos) {
		this.arrayDiasTrabajados = arrayTemporadas;
		this.arrayTemporadas = arrayDiasTrabajados;
		this.arrayTrabajos = arrayTrabajos;
	}
	
}