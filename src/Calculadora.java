import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		double valor1;
		double valor2;
		double soma;
		System.out.println("Porfavor, digite um valor:");
		
		valor1 = leitor.nextDouble();
		System.out.println("Por favor, digite mais um valor:");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		System.out.println("A soma dos dois valores informados é:");
		
		leitor.close();
		
	}

}
