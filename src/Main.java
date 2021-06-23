import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String  nome =  "Tchelo";
		int idade = 15;
		double altura = 1.74;
		double salario = 5000.0;
		
		System.out.printf("%s tem de idade %d e de altura %.2f recebe o valor de R$ %.2f %n", nome, idade, altura, salario);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%s tem de idade %d e de altura %.2f recebe o valor de R$ %.2f %n", nome, idade, altura, salario);
		
		if (idade < 18) {
			System.out.println("Não pode entrar");
		}
		
		else {
			
			System.out.println("Pode entrar");
		}
		
		while (idade < 18) {
			System.out.println (idade);
			idade = idade + 1;
		}
		
		int a, b, c, soma;
		
		a = 10;
		b = 20;
		c = 30;
		
		soma = a * b / c;
		
		System.out.println("O valor da soma é = " + soma);
		
		while (a < b) {
			System.out.println(a);
			a = a + 0;
		}
		
		
		
		}
	}

