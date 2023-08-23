package ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=999;
	
	public Empleado() {
		this("sin nombre",99);
	}
	
	public Empleado(String nombre, int edad) {
		this.id=++cont;
		this.nombre=nombre;
		if(edad > 0) {
			this.edad=edad;				
		}
		else {
			System.out.println("La edad ingresada no es válida. Se pondrá un valor por defecto");
			this.edad=99;
		}				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad=edad;
		}else {
			System.out.println("Debe ingresar una edad válidad. Se pondrá un valor por defecto");
			this.edad=99;
		}
	}

	public int getId() {
		return id;
	}
	
	public static int devuelveProximoID() {
		return cont+1;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + ", Nombre: " + this.nombre + ", Edad: " + this.edad;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
}
