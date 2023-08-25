package ejercicio2;

import java.util.*;

public class ProductoFresco extends Producto {
	private Date fechaEnvasado;
	private String paisOrigen;
	
	
	@Override
	public String toString() {
		return super.toString()+ " ProductoFresco | fecha Envasado: " + 
	fechaEnvasado + ", pais Origen: " + paisOrigen;
	}
	public ProductoFresco(){
		this(null,"argentina");
	}
	public ProductoFresco(Date fecha,String pais){
		this.fechaEnvasado=fecha;
		this.paisOrigen=pais;
	}
	
	
	
	//GETTERS SETTERS
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
}
