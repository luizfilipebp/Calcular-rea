//----------------------------------------
/*	Subclasse de FiguraGeometrica  */
//----------------------------------------

public class Retangulo extends FiguraGeometrica {
	//Atributos
	private double base;
	private double altura;
	
	//Métodos que sobrepõem os métodos da classe FiguraGeometrica
	@Override
	public double getArea() {
		return this.base * this.altura;
	}
	@Override
	public String getDescricao() {
		return "Valor da BASE: " + this.base + "\nValor da ALTURA: " + this.altura;
	}	
	
	//Método get/set
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return 0;
	}
	
}