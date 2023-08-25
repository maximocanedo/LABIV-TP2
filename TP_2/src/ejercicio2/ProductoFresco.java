package ejercicio2;

import java.util.*;

public class ProductoFresco extends Producto {
	private Date fechaEnvasado;
	private String paisOrigen;
	
	
	public ProductoFresco(String po, Date fe, int lote, Date fv) {
		super(lote, fv);
		setPaisOrigen(po);
		setFechaEnvasado(fe);
	}
	public ProductoFresco(String po, Date fe, int lote, Calendar fv) {
		super(lote, fv);
		setPaisOrigen(po);
		setFechaEnvasado(fe);
	}
	public ProductoFresco(String po, Calendar fe, int lote, Date fv) {
		super(lote, fv);
		setPaisOrigen(po);
		setFechaEnvasado(fe.getTime());
	}
	public ProductoFresco(String po, Calendar fe, int lote, Calendar fv) {
		super(lote, fv);
		setPaisOrigen(po);
		setFechaEnvasado(fe.getTime());
	}
	public ProductoFresco(String po, Date fe, int lote) {
		super(lote);
		setPaisOrigen(po);
		setFechaEnvasado(fe);
	}
	public ProductoFresco(String po, Calendar fe, int lote) {
		super(lote);
		setPaisOrigen(po);
		setFechaEnvasado(fe.getTime());
	}
	public ProductoFresco(String po, Date fe) {
		super();
		setPaisOrigen(po);
		setFechaEnvasado(fe);
	}
	public ProductoFresco(String po, Calendar fe) {
		super();
		setPaisOrigen(po);
		setFechaEnvasado(fe.getTime());
	}
	public ProductoFresco(String po) {
		super();
		setPaisOrigen(po);
		Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, -1);
		setFechaEnvasado(fechaActual.getTime());
	}
	public ProductoFresco() {
		super();
		setPaisOrigen("AR");
		Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, -1);
		setFechaEnvasado(fechaActual.getTime());
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
	@Override
	public String toString() {
		return super.toString()+ " ProductoFresco | fecha Envasado: " + 
	fechaEnvasado + ", pais Origen: " + paisOrigen;
	}
	
	
}
