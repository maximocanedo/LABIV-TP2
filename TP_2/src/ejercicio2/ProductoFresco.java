package ejercicio2;

import java.util.*;

public class ProductoFresco extends Producto {
	private Date fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco(){
		this(null,"argentina");
	}
	public ProductoFresco(Date fecha,String pais){
		this.fechaEnvasado=fecha;
		this.paisOrigen=pais;
	}
}
