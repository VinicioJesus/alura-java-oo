package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {

	public static void main(String[] args) {
		// char guarda um unico caractere e se usa aspas simples
		char letra = 'a';
		System.out.println(letra);
		// esse char vem das tabelas tipo charcode
		char valor = 66;
		System.out.println(valor);

		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura chupa meu...";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
