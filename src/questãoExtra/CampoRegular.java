package questãoExtra;


public class CampoRegular {
	private ParOrdenado posicaoCanto;
	private double altura;
	private double comprimentoH;
	private Bola bolaM;
	public CampoRegular(ParOrdenado posicaoCanto, double altura, double comprimentoH, Bola bolaM) {
		super();
		this.posicaoCanto = posicaoCanto;
		this.altura = altura;
		this.comprimentoH = comprimentoH;
		this.bolaM = bolaM;
	}

	public ParOrdenado getPosicaoCanto() {
		return posicaoCanto;
	}

	public double getAltura() {
		return altura;
	}
	public double getComprimentoH() {
		return comprimentoH;
	}

	public Bola getBolaM() {
		return bolaM;
	}



	public boolean bolaTocaBordaSuperior() {
	    if(altura/2 <= bolaM.getPosCentro().getY()+ bolaM.getRaio())
	        return true;
	    return false;
	}
	public boolean bolaTocaBordaInferior() {
	    if(-altura/2 >= bolaM.getPosCentro().getY()+ bolaM.getRaio())
	        return true;
	    return false;
	}
	public boolean bolaTocaBordaEsquerda() {
	    if(-comprimentoH/2 >= bolaM.getPosCentro().getX()+ bolaM.getRaio())
	        return true;
	    return false;
	}
	public boolean bolaTocaBordaDireita() {
	    if(comprimentoH/2 <= bolaM.getPosCentro().getX()+ bolaM.getRaio())
	        return true;
	    return false;
	}
	public void movimentaBola() {
	    if(bolaTocaBordaSuperior()){
	        bolaM.setVeloVertical(-1 * bolaM.getVeloVertical());
	    }
	    else if(bolaTocaBordaInferior()){
	        bolaM.setVeloVertical(-1 * bolaM.getVeloVertical());
	    }
	    else if(bolaTocaBordaEsquerda()){
	        bolaM.setVeloHorizontal(-1 * bolaM.getVeloHorizontal());
	    }
	    else if(bolaTocaBordaDireita()){
	        bolaM.setVeloHorizontal(-1 * bolaM.getVeloHorizontal());
	    }
	    bolaM.movimenta();
	}

}
