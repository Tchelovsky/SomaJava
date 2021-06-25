import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Sexta-Feira Treino simples//

		String nome = "Tchelo";
		int idade = 33;
		double altura = 1.74;
		double renda = 5000.0;

		System.out.printf("%s tem de idade %d e altura %.2f recebe o valor ao mês %.2f %n", nome, idade, altura, renda);

		// Faltou colocar a altura //

		Locale.setDefault(Locale.US);

		System.out.printf("%s tem de idade %d e altura %.2f recebe o valor ao mês %.2f %n", nome, idade, altura, renda);

		if (idade < altura) {
			System.out.println("A idade é maior que a altura ");
		} else {
			System.out.println("A altura e maior que a idade ");
		}

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i = i + 1;
		}

		int a, b;
		a = 5;
		b = 5;
		System.out.println("O valor da conta é " + (a + b));

		// montando outra conta //

		int c, d, e, soma;

		c = 5;
		d = 5;
		e = 5;

		soma = a + b + c;

		System.out.println("O valor da conta é " + soma);

		int idade1 = 17;
		
		while (idade1 < 18) {
			System.out.println("Não pode entrar");
			
			idade1 = idade1 + 1;
		}
	}

}
