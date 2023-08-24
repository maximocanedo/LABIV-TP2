package ejercicio3;

public class Edif_Oficina implements Edificio {

	private int Cant_Oficinas;

	public Edif_Oficina() {
		this.Cant_Oficinas = 1;
	}
	
	public Edif_Oficina(int cantidad) {
		this.Cant_Oficinas = cantidad;
	}
	
	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getCant_Oficinas() {
		return Cant_Oficinas;
	}

	public void setCant_Oficinas(int cant_Oficinas) {
		Cant_Oficinas = cant_Oficinas;
	}

	@Override
	public String toString() {
		return "Este edificio posee "+ Cant_Oficinas + " Oficinas";
	}
	
}
