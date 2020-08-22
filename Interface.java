package tecnicas;

import java.util.*;
public class Interface {
	Scanner scan = new Scanner(System.in);
	public void startup() {
		Catalogo catalogo = new Catalogo();
		catalogo.addV(new Moto("Honda", "XRE330", 25.5, 300, 600, "com carenagem"));
		catalogo.addV(new Carro("Fiat", "Uno", 10.7, 75, "Manual", "Dianteira" ));
		catalogo.addV(new Carro("Ferrari", "488", 8, 720, "Automatico", "Traseira"));
		catalogo.addV(new Caminhao("Volvo", "FH 400", 20, 150, 8, 800.5)); //eu nao sei as specs de um caminhao
		catalogo.addV(new Carro("Volkswagen", "Fuca", 8.4, 65, "Manual", "Dianteira"));
		menu(scan,catalogo);
	}

	public static void menu(Scanner scan,Catalogo catalogo){
		System.out.println("\n Catalogo da concessionaria");
		System.out.println("\n Digite uma opcao");
		System.out.println("\n 1- Exibir catalogo completo de veiculos" //chama o metodo mostraCat()
						  +"\n 2- Filtrar por marca"
						  +"\n 3- Filtrar por modelo"
						  +"\n 0- Sair");
		switch (scan.nextInt()) {
			case 1:
			catalogo.mostraCat();
			menu2(scan, catalogo);
				break;
			case 2:
			System.out.println("Insira marca do veiculo");
			catalogo.filtrarMarca(scan.next());
			menu2(scan, catalogo);
				break;
			case 3:
			System.out.println("Insira modelo do veiculo");
			catalogo.filtrarModelo(scan.next());
			menu2(scan, catalogo);
				break;
			default:
				break;
		}
	}
	
	public static void menu2(Scanner scan,Catalogo catalogo){
		System.out.println("\n 1- Mostrar veiculo"
						  +"\n 2- Menu principal");
		switch (scan.nextInt()){
			case 1:
			System.out.println("Insira id do veiculo");
			System.out.println(catalogo.exibeInfo(scan.nextInt()));
			menu2(scan, catalogo);
				break;
			case 2:
			menu(scan,catalogo);
				break;
			default:
				break;
		}
	}
}
