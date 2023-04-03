package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, "
						+ "pois está acompanhado");
			} else {
				System.out.println(" infelizmente você não pode entrar");
			}
			System.out.println("Infelizmente você não pode entrar");
		}

		// podemos fazer sem chaves quando for uma unica instrução (statment)
		// if (idade >= 18)
		// System.out.println("Você tem mais de 18 anos!");
		//

	}

}
