package sintaxe_variaveis_e_fluxo;

public class TestaConversao {

	public static void main(String[] args) {

		double salario = 1270.50;

		// casting para fazer o double caber no int(quando não é
		// possivel fazer de forma automática)
		int valor = (int) salario;
		System.out.println(salario);

		long numeroGrande = 37515615L;

		// double tem marge de erro.
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		// float não tem margem de
		// erro com ponto flutuante

		float valor3 = 0.2f;
		float valor4 = 0.1f;
		float total2 = valor3 + valor4;
		System.out.println(total2);

	}

}
