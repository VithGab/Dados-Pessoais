package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

	System.out.print("Total de pessoas a serem adicionadas na lista? ");
	int n = sc.nextInt();
	sc.nextLine();

	String[] nome = new String[n];
	double[] altura = new double[n];
	int[] idade = new int[n];

	for(int i = 0;i<n;i++) {
		System.out.println("Dados da " + (i + 1) + " pessoa:");
		System.out.println("Nome:");
		nome[i] = sc.nextLine();
		System.out.println("Altura:");
		altura[i] = sc.nextDouble();
		System.out.println("Idade");
		idade[i] = sc.nextInt();
		sc.nextLine();
	}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
 
			double mediaDasAlturas = soma / n;
			sc.nextLine();
			System.out.printf("Altura média: %.2f%n", mediaDasAlturas);
		
		}
		int contagem = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16)
				;
			contagem = contagem + 1;
		}
		double porcentagem = contagem * 100.0;
		System.out.printf("Porcentagem de pessoas com menos de 16 é: %.1f%%%n", porcentagem);

		sc.close();
	}
}