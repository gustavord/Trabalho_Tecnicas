package tecnicas;

public class Moto extends Veiculo {
	protected int cil; //cilindradas
	protected String car; // carenagem (com ou sem)
	
	public Moto(String marca, String modelo, double km, int pot, int cil, String car) {
		super(marca, modelo, km, pot);
		
		this.cil = cil;
		this.car = car;
	}
	
	public void setCil(int cil) {
		this.cil = cil;
	}

	public void setCar(String car) {
		this.car = car;
	}
	// adicionado get e set car
	public int getCil() {
		return cil;
	}

	public int getCar() {
		return car;
	}
	
		public String toString() {
		return super.toString()+cil+" cilindradas \n"+car;
	}
}
