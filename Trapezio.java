//----------------------------------------
/*	Subclasse de FiguraGeometrica  */
//----------------------------------------
public class Trapezio extends FiguraGeometrica{
	//Atributos
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	//Métodos que sobrepõem os métodos da classe FiguraGeometrica
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((baseMaior+baseMenor)*altura)/2;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Valor da BASE MENOR: "+this.baseMaior+"\nValor da BASE MENOR: "+this.baseMenor+"\nValor da ALTURA: "+this.altura;
	}

	//Metodo set/get
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}