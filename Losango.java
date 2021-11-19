//----------------------------------------
/*	Subclasse de FiguraGeometrica  */
//----------------------------------------
public class Losango extends FiguraGeometrica{
	//Atributos
	private double diagMaior;
	private double diagMenor;
	
	//Métodos que sobrepõem os métodos da classe FiguraGeometrica
	@Override
	public double getArea() {		
		return (diagMaior*diagMenor)/2;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Valor da DIAGONAL MAIOR: "+ this.diagMaior + "\nValor da DIAGONAL MENOR: " + this.diagMenor;
	}
	
	//Metodo get/set
	public double getDiagMaior() {
		return diagMaior;
	}
	public void setDiagMaior(double diagMaior) {
		this.diagMaior = diagMaior;
	}
	public double getDiagMenor() {
		return diagMenor;
	}
	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}	
}
