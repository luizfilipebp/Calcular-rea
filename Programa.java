import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		// Solicita os valores de cada figura
		definirRetangulo();
		definirTriangulo();
		definirCirculo();
		definirTrapezio();
		definirLosango();
		definirQuadrado();

		// Calcula e imprimi os valores
		imprimir();

	}

	// Configura a leitura de dados
	static Scanner in = new Scanner(System.in);

	// Instancia as classes
	static Triangulo triangulo = new Triangulo();
	static Retangulo retangulo = new Retangulo();
	static Circulo circulo = new Circulo();
	static Trapezio trapezio = new Trapezio();
	static Losango losango = new Losango();
	static Quadrado quadrado = new Quadrado();

	// Metodo para imprimir os valores
	private static void imprimir() {
		// Adiciona as figuras geometricas em uma lista
		List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
		listaFigurasGeometricas.add(retangulo);
		listaFigurasGeometricas.add(triangulo);
		listaFigurasGeometricas.add(circulo);
		listaFigurasGeometricas.add(trapezio);
		listaFigurasGeometricas.add(losango);
		listaFigurasGeometricas.add(quadrado);

		// Mostra dados das figuras geometricas
		for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
			// Adicionei a linha de baixo para utilizar o atributo nome
			System.out.printf("\n****" + figuraGeometrica.getNome().toUpperCase() + "****");
			System.out.println("\n" + figuraGeometrica.getDescricao());
			System.out.printf("Área da figura: %.2f \n", figuraGeometrica.getArea());

		}

	}

	// Metodo para o Retangulo
	private static void definirRetangulo() {
		// Solicita os dados do RETANGULO
		System.out.println("----RETANGULO----");
		System.out.printf("Digite o valor da BASE: ");
		double retBase = in.nextDouble();
		System.out.printf("Digite o valor da ALTURA: ");
		double retAltura = in.nextDouble();

		// Envia os dados para a classe
		retangulo.setBase(retBase);
		retangulo.setAltura(retAltura);
		retangulo.setNome("Retangulo");
	}

	// Metodo para o Triangulo
	public static void definirTriangulo() {
		// Solicita os dados do TRIANGULO
		System.out.println("\n----TRIANGULO----");
		System.out.printf("Digite o valor da BASE: ");
		double triBase = in.nextDouble();
		System.out.printf("Digite o valor da ALTURA: ");
		double triAltura = in.nextDouble();

		// Envia os dados para a classe
		triangulo.setBase(triBase);
		triangulo.setAltura(triAltura);
		triangulo.setNome("Triangulo");

	}

	// Método para o Circulo
	public static void definirCirculo() {
		// Solicita os dados do CIRCULO
		System.out.println("\n----CIRCULO----");
		System.out.printf("Digite o valor do RAIO: ");
		double cirRaio = in.nextDouble();

		// Envia os dados para a classe
		circulo.setRaio(cirRaio);
		circulo.setNome("Circulo");
	}

	// Método para o Trapezio
	public static void definirTrapezio() {
		// Solicita os dados do Trapezio
		System.out.println("\n----Trapezio----");
		System.out.printf("Digite o valor da BASE MAIOR : ");
		double baseMaior = in.nextDouble();
		System.out.printf("Digite o valor da BASE MENOR : ");
		double baseMenor = in.nextDouble();
		System.out.printf("Digite o valor da ALTURA : ");
		double altura = in.nextDouble();

		// Envia os dados para a classe
		trapezio.setBaseMaior(baseMaior);
		trapezio.setBaseMenor(baseMenor);
		trapezio.setAltura(altura);
		trapezio.setNome("Trapezio");
	}

	// Método para o Losango
	public static void definirLosango() {
		// Solicita os dados do Losango
		System.out.println("\n----Losango----");
		System.out.printf("Digite o valor da DIAGONAL MAIOR : ");
		double diagMaior = in.nextDouble();
		System.out.printf("Digite o valor da DIAGONAL MENOR : ");
		double diagMenor = in.nextDouble();

		// Envia os dados para a classe
		losango.setDiagMaior(diagMaior);
		losango.setDiagMenor(diagMenor);
		losango.setNome("Losango");

	}

	// Método para o Quadrado
	public static void definirQuadrado() {
		// Solicita os dados do Losango
		System.out.println("\n----Quadrado----");
		System.out.printf("Digite o valor do LADO : ");
		double lado = in.nextDouble();

		// Envia os dados para a classe
		quadrado.setLado(lado);
		quadrado.setNome("Quadrado");

	}

}
