package tecnicas;

public class Catalogo {
	Veiculo v[] = new Veiculo[30];
	int vCount = 0;
	
	public void addV(Veiculo veiculo) { //Para adicionar um veiculo ja criado
		v[vCount] = veiculo;
		vCount++;
	}
	
	public void mostraCat() { //Exibe o catalogo com todos os veiculos e seu respectivo
							 // numero de identificacao (posicao no vetor)
		System.out.println("\n Catalogo de veiculos:");
		for(int i=0; i<vCount; i++) {
			System.out.println("\n ID: "+i);
			System.out.println(v[i].getMarca());
			//System.out.println(v[i].getModelo());
			System.out.println("\n --------------- \n");
		}
		
	}
	public String exibeInfo(int id) {
		return v[id].toString();
	}
}