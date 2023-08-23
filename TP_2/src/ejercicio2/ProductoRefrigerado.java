package ejercicio2;

import java.util.Date;

public class ProductoRefrigerado extends Producto {
	private int codigoOrganismoSupervisionAlimentaria;
	
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
}

