//----------------------------------------
/*	Subclasse de FiguraGeometrica  */
//----------------------------------------

public class Circulo extends FiguraGeometrica{
	//Atributos
	private double raio;
	
	//Métodos que sobrepõem os métodos da classe FiguraGeometrica
	@Override
	public double getArea() {
		return (3.14 * (Math.pow(raio,2)));
	}
	@Override
	public String getDescricao() {
		 return "Valor do RAIO: "+ this.raio;
	}
	
	
	//Método get/set
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}