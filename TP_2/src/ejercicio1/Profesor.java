package ejercicio1;

public class Profesor extends Empleado{
	private String cargo;
	private int antiguedadDocente;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public Profesor() {
		this("sin nombre",99,0,"ningún cargo");
	}
	
	public Profesor(String nombre,int edad,int antiguedad,String cargo) {
		super(nombre,edad);
		this.cargo=cargo;
		if(antiguedad>=0) {
		this.antiguedadDocente=antiguedad;
		}
		else{
			System.out.println("La antiguedad no es válida. Se pondrá un valor por defecto");
			this.antiguedadDocente=0;
		}
	}
	@Override
	public String toString() {
		return super.toString() + ", Cargo: " + this.cargo +", Antiguedad Docente: " + this.antiguedadDocente;
	}
	
	
}
