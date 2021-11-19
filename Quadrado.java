//----------------------------------------
/*	Subclasse de FiguraGeometrica  */
//----------------------------------------
public class Quadrado extends FiguraGeometrica{
	//Atributos
	private double lado;
	
	//Métodos que sobrepõem os métodos da classe FiguraGeometrica
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2);
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Valor do LADO: " + this.lado;
	}
	
	//Metodo get/set
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	

}
