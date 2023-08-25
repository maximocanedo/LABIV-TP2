package ejercicio2;

public class ProductoCongelado extends Producto {
	private double temperaturaRecomendada;
	
	@Override
	public String toString() {
		return super.toString() + "ProductoCongelado temperatura Recomendada: " +
	temperaturaRecomendada ;
	}
	public ProductoCongelado(){
		this(0);
	}
	public ProductoCongelado(int temp){
		if(temp>=0) {
		this.temperaturaRecomendada=temp;
	}
		else {
			System.out.println("La temperatura no es válida. Se pondrá un valor por defecto");
			this.temperaturaRecomendada=0;
		}
	}
	
	//GETTERS SETTERS
	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	
}
