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
	public int getCil() {
		return cil;
	}
	//Implementar o resto dos getters e setters
	
	public String toString() {
		return super.toString()+cil+" cilindradas \n"+car;
	}
}
