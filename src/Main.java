import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String nome = "Tchelo";
		int idade = 33;
		double salario = 5000.0;
		
		System.out.printf(" %s tem de idade %d e recebe ao m�s o valor de %.2f%n ", nome, idade, salario);
		
 // Vamos formatar para a condi��o com ponto//
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%s tem de idade %d e recebe ao m�s o valor de %.2f%n ", nome, idade, salario);
		
		if (salario > idade) { 
			System.out.println("O valor do sal�rio � bom ");
		}
		
		else {
			System.out.println("O valor do sal�rio � ruim");
		}

	}
}
