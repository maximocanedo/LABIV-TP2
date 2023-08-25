package ejercicio2;
import java.util.*;
public class ProductoCongelado extends Producto {
	private double temperaturaRecomendada;
	
	public ProductoCongelado(int temp, int lote, Date fv) {
		super(lote, fv);
		setTemperaturaRecomendada(temp);
	}
	public ProductoCongelado(int temp, int lote, Calendar fv) {
		super(lote, fv);
		setTemperaturaRecomendada(temp);
	}
	public ProductoCongelado(int temp, int lote) {
		super(lote);
		setTemperaturaRecomendada(temp);
	}
	public ProductoCongelado(int temp) {
		super();
		setTemperaturaRecomendada(temp);
	}
	public ProductoCongelado() {
		super();
		setTemperaturaRecomendada(0);
	}
	
	//GETTERS SETTERS
	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada >= 0 ? temperaturaRecomendada : 0;
	}
	@Override
	public String toString() {
		return super.toString() + " ProductoCongelado temperatura Recomendada: " +
	temperaturaRecomendada ;
	}
	
}
