public abstract class FiguraGeometrica{
	//Atributos
	private String nome;
	
	//M�todos
	public abstract double getArea();
	public abstract String getDescricao();

	//M�todo get/set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}		
}