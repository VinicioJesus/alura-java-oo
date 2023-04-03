package sintaxe_variaveis_e_fluxo;

import java.math.BigDecimal;

public class TestePontoFlutuante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 1250.70;;
		
		System.out.println("meu salário é " + salario);
		
		double idade = 37;
		
		double divisao = 3.14 /2 ;
		System.out.println("meu piru "+ divisao);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		//casting para fazer o double caber no int(quando não é 
		//possivel fazer de forma automática)
		int numeroInteiro = (int)salario ;
		
	}

}
