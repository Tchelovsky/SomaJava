
public class Main {

	public static void main(String[] args) {

		// Fazendo apenas um teste de fixa��o//

		String nome = "Tchelo";
		int idade = 33;
		double renda = 5000.0;

		System.out.printf(" %s tem de idade %d e recebe o sal�rio de R$ %.2f ao m�s \n ", nome, idade, renda);

		int x, y;

		x = 10;
		y = 20;
		System.out.println("O valor da conta � = " + (x + y));

		// montando a conta de outra forma//

		int a, b, soma;
		a = 10;
		b = 20;

		soma = a + b;

		System.out.println(" O valor da conta � = " + soma);
		
		int idade1 = 17;
		
		if (idade1 < 17){
		System.out.println("Pode entrar");
		}
		else {
			System.out.println(" N�o pode entrar");
		}
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}

}
