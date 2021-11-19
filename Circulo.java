//----------------------------------------
/*	Subclasse de FiguraGeometrica  */
//----------------------------------------

public class Circulo extends FiguraGeometrica{
	//Atributos
	private double raio;
	
	//M�todos que sobrep�em os m�todos da classe FiguraGeometrica
	@Override
	public double getArea() {
		return (3.14 * (Math.pow(raio,2)));
	}
	@Override
	public String getDescricao() {
		 return "Valor do RAIO: "+ this.raio;
	}
	
	
	//M�todo get/set
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}