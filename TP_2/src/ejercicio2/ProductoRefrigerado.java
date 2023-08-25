package ejercicio2;

//import java.util.Date;

public class ProductoRefrigerado extends Producto {
	private int codigoOrganismoSupervisionAlimentaria;
	
	@Override
	public String toString() {
		return  super.toString() +" | ProductoRefrigerado codigo de "
				+ "Organismo de Supervision de Alimentaria: " + 
				codigoOrganismoSupervisionAlimentaria;
	}
	public ProductoRefrigerado(){
		this(0);
	}
	public ProductoRefrigerado(int codigo){	
		if(codigo>=0) {
			this.codigoOrganismoSupervisionAlimentaria=codigo;
		}
			else {
				System.out.println("El codigo no es válido. Se pondrá un valor por defecto");
				this.codigoOrganismoSupervisionAlimentaria=0;
			}
	}
	
	
	//GETTERS SETTERS
	public int getCodigoOrganismoSupervisionAlimentaria() {
		return codigoOrganismoSupervisionAlimentaria;
	}
	public void setCodigoOrganismoSupervisionAlimentaria(int codigoOrganismoSupervisionAlimentaria) {
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}
	
	
}

