package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{
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
		this("sin nombre",99,0,"ning�n cargo");
	}
	
	public Profesor(String nombre,int edad,int antiguedad,String cargo) {
		super(nombre,edad);
		this.cargo=cargo;
		if(antiguedad>=0) {
		this.antiguedadDocente=antiguedad;
		}
		else{
			System.out.println("La antiguedad no es v�lida. Se pondr� un valor por defecto");
			this.antiguedadDocente=0;
		}
	}
	@Override
	public String toString() {
		return super.toString() + ", Cargo: " + this.cargo +", Antiguedad Docente: " + this.antiguedadDocente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	@Override
	public int compareTo(Profesor o) {
		// TODO Auto-generated method stub
		//Ordenamiento por antiguedad mayor a menor
		if(o.antiguedadDocente == this.antiguedadDocente)
			return -1;
		if(o.antiguedadDocente<this.antiguedadDocente) 
		{
			return -1;
		}
		
		return 1;
	}
	
	
	
}
