public abstract class FiguraGeometrica{
	//Atributos
	private String nome;
	
	//Métodos
	public abstract double getArea();
	public abstract String getDescricao();

	//Método get/set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}		
}