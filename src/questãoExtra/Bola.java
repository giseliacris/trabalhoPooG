package questãoExtra;


public class Bola {
	private ParOrdenado posCentro;
	private double veloVertical;
	private double veloHorizontal;
	final double raio= 2.5;

	public Bola(ParOrdenado posCentro, double veloVertical, double veloHorizontal) {
		super();
		this.posCentro = posCentro;
		this.veloVertical = veloVertical;
		this.veloHorizontal = veloHorizontal;
		
		
		
	}



	public double getVeloVertical() {
		return veloVertical;
	}



	public void setVeloVertical(double veloVertical) {
		this.veloVertical = veloVertical;
	}



	public double getVeloHorizontal() {
		return veloHorizontal;
	}



	public void setVeloHorizontal(double veloHorizontal) {
		this.veloHorizontal = veloHorizontal;
	}



	public ParOrdenado getPosCentro() {
		return posCentro;
	}
	public double getRaio() {
		return raio;
	}


	public void movimenta(){
		posCentro.setX(posCentro.getX() + veloHorizontal);
		posCentro.setY(posCentro.getY() + veloVertical);

	}
	@Override
	public String toString() {
	    return "A bola está na posição " +this.posCentro.toString()+ " se movendo a uma velocidade ("+(veloHorizontal)+","+(veloVertical)+") pixels por movimento";
	}

}
