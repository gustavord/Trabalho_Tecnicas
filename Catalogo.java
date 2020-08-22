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
		System.out.println("Catalogo de veiculos:");
		for(int i=0; i<vCount; i++) {
			System.out.println("---------------");
			System.out.println("ID: "+i);
			System.out.println("Marca: "+v[i].getMarca());
			System.out.println("Modelo: "+v[i].getModelo());
			System.out.println("---------------");
		}
	}
	//coisa feia
	public void filtrarMarca(String m){
		boolean notFound = true;
		for(int i=0; i<vCount; i++) {
			if(m.equalsIgnoreCase(v[i].getMarca())){
				System.out.println("---------------");
				System.out.println("ID: "+i);
				System.out.println("Marca: "+v[i].getMarca());
				System.out.println("Modelo: "+v[i].getModelo());
				System.out.println("---------------");
				notFound = false;
			}
		}
		if(notFound){
			System.out.println("Nenhum veiculo do modelo "+m+" encontrado");
		}
	}
	public void filtrarModelo(String m){
		boolean notFound = true;
		for(int i=0; i<vCount; i++) {
			if(m.equalsIgnoreCase(v[i].getModelo())){
				System.out.println("---------------");
				System.out.println("ID: "+i);
				System.out.println("Marca: "+v[i].getMarca());
				System.out.println("Modelo: "+v[i].getModelo());
				System.out.println("---------------");
				notFound = false;
			}
		}
		if(notFound){
			System.out.println("Nenhum veiculo do modelo "+m+" encontrado");
		}
	}

	public Veiculo exibeInfo(int id) {
		return v[id];
	}
}