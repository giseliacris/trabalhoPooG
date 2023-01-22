package br.uern.di.poo.unidade1.construcao;

public class CalcularServico {
	public static double calculaPorta(Porta porta) {
		final double acressimoLuxo = 0.1;
		final double instalacao = 70.0;
		final double instalacaoPivotante= 250.0;
		double valorTotal;
		valorTotal =+ porta.getAltura() *  porta.getLargura() * instalacao;
		if(porta.getportaPivotanteSN()== "S") {
			valorTotal =+ instalacaoPivotante;
		}
		if(porta.getTipoPorta()==PortaEspecificarTipo.LUXO) {
			valorTotal =+ (acressimoLuxo*valorTotal) + valorTotal ;
			
		}
		if(porta.getTipoPorta()==PortaEspecificarTipo.LUXO && porta.getportaPivotanteSN()== "S") {
			valorTotal =+ (acressimoLuxo*valorTotal) + valorTotal + instalacaoPivotante;
			
		}
		
		return valorTotal;
	}
}
