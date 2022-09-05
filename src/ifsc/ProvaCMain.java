package ifsc;

import java.util.Scanner;

public class ProvaCMain {

	public static double soma(Double[] numerosReais) {
		double soma = 0;
		for (int i = 0; i < numerosReais.length; i++) {
			soma += numerosReais[i];
		}
		return soma;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Double[] numerosReais = new Double[3];
		String conversaoVariavel = "";
		Double inputDouble = 0.0;
//		Double somaDosInputs = 0.0;

		for (int i = 0; i < numerosReais.length; i++) {
			System.out.printf("\nLeitura de n�meros reais. Insira o n�mero %d\n", i + 1);
			conversaoVariavel = input.nextLine();
			inputDouble = Double.valueOf(conversaoVariavel);

			while (inputDouble <= 0.0) {
				System.out.println("\nN�mero inv�lido.\nFavor inserir um n�mero real positivo acima de zero.");
				conversaoVariavel = input.nextLine();
				inputDouble = Double.valueOf(conversaoVariavel);
				continue;
			}
			numerosReais[i] = inputDouble;
		}

		input.close();

		System.out.print("N�meros inseridos:\n[");
		for (int i = 0; i < numerosReais.length; i++) {

			System.out.printf(" %s ", numerosReais[i]);
		}
		System.out.println("]");
		
		if(soma(numerosReais)> 0) {
			System.out.printf("\nSoma dos valores inseridos: %s\n", soma(numerosReais));
		}

	}
}
