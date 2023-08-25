package ejercicio2;

import java.util.*;

public class ProductoRefrigerado extends Producto {
	private int codigoOrganismoSupervisionAlimentaria;
	
	public ProductoRefrigerado(int codigo, int lote, Date fv) {
		super(lote, fv);
		setCodigoOrganismoSupervisionAlimentaria(codigo);
		
	}
	public ProductoRefrigerado(int codigo, int lote, Calendar fv) {
		super(lote, fv);
		setCodigoOrganismoSupervisionAlimentaria(codigo);
		
	}
	public ProductoRefrigerado(int codigo, int lote) {
		super(lote);
		setCodigoOrganismoSupervisionAlimentaria(codigo);
		
	}
	public ProductoRefrigerado(int codigo) {
		super();
		setCodigoOrganismoSupervisionAlimentaria(codigo);
	}
	public ProductoRefrigerado(){
		super();
		setCodigoOrganismoSupervisionAlimentaria(0);
	}
	
	
	//GETTERS SETTERS
	public int getCodigoOrganismoSupervisionAlimentaria() {
		return codigoOrganismoSupervisionAlimentaria;
	}
	public void setCodigoOrganismoSupervisionAlimentaria(int codigo) {
		this.codigoOrganismoSupervisionAlimentaria = codigo >= 0 ? codigo : 0;
	}
	
	
}

