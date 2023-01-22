package br.uern.di.poo.unidade1.construcao;

public class PrincipalUern {
	public static void custoDaPorta (Porta porta) {
		double in = CalcularServico.calculaPorta(porta);
		System.out.println("custo da porta " +Math.round(porta.calculaPreco()));
		System.out.println("Custo instalação "+ String.valueOf(in));
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Porta portaUm = new Porta();
		Porta portaDois = new Porta( PortaEspecificarTipo.SIMPLES, 1.3, 1.5, "N");
		Porta portaTres = new Porta(PortaEspecificarTipo.PADRAO, 2.5,  2, "N");
		Porta portaQuatro = new Porta(PortaEspecificarTipo.LUXO,   2.5,   2, "S");
		System.out.println("Informações porta um");
		portaUm.exibePorta();
		System.out.println("A primeira porta custa:");
		custoDaPorta(portaUm);
		System.out.println("\nInformações porta dois");
		portaDois.exibePorta();
		System.out.println("A segunda porta custa:");
		custoDaPorta(portaDois);
		System.out.println("Informações porta tres");
		portaTres.exibePorta();
		System.out.println("A terceira porta custa:");
		custoDaPorta(portaTres);
		System.out.println("Informações porta quatro");
		portaQuatro.exibePorta();
		System.out.println("A quarta porta custa:");
		custoDaPorta(portaQuatro);
	}
}
