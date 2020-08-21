package tecnicas;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		catalogo.addV(new Moto("Honda", "XRE330", 25.5, 300, 600, "com carenagem"));
		catalogo.addV(new Carro("Fiat", "Uno", 10.7, 75, "Manual", "Dianteira" ));
		catalogo.addV(new Carro("Ferrari", "488", 8, 720, "Automatico", "Traseira"));
		catalogo.addV(new Caminhao("Volvo", "FH 400", 20, 150, 8, 800.5)); //eu nao sei as specs de um caminhao
		catalogo.addV(new Carro("Volkswagen", "Fuca", 8.4, 65, "Manual", "Dianteira"));
		
		//catalogo.mostraCat();
	}
}
