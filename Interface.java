package tecnicas;

import java.util.*;
public class Interface {
	public void startup() {
		System.out.println("\n Catalogo da concessionaria");
		System.out.println("\n Digite uma opcao");
		System.out.println("\n 1- Exibir catalogo de veiculos" //chama o metodo mostraCat()
						  +"\n 2- Exibir informacoes de um veiculo" //chama o metodo exibeInfo(int id) que recebe o numero ID como parametro
						  +"\n 3- Adicionar um veiculo"); //chama o metodo addV(Veiculo veiculo)
		
		//implementar interface para o usuario
	}
}
