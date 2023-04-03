package sintaxe_variaveis_e_fluxo;

public class TestaLacos {

	public static void main(String[] args) {
		
		int multiplicando = 1;
		int multiplicador = 0;
	
		//imprime o numero 1 dez vezes e depois soma o primeiro numeor
		while(multiplicando <=10 && multiplicador<=10) {
			
			multiplicador++;
			System.out.println(multiplicando + "X" + multiplicador + "=" +  multiplicando * multiplicador );
			if(multiplicador == 10) {
				multiplicando ++;
				multiplicador =0;
				System.out.println("-------------");
			}
		}

	}

}
