package br.uern.di.poo.unidade1.construcao;

public class Porta {
	private PortaEspecificarTipo tipoPorta;
	private double altura;
	private double largura;
	private String portaPivotanteSN;
	final private double sePivotante   = 350.00;
	final private double PadraoAltura  = 1.8;
	final private double PadraoLargura = 0.7;
	
	public Porta(PortaEspecificarTipo tipoPorta, double altura, double largura, String portaPivotanteSN) {
		super();
		this.tipoPorta = tipoPorta;
		this.altura = altura;
		this.largura = largura;
		this.portaPivotanteSN = portaPivotanteSN;
		
	}
	
	
	public  Porta() {
		this.tipoPorta = PortaEspecificarTipo.SIMPLES;
		this.altura  =  PadraoAltura;
		this.largura =  PadraoLargura;
		this.portaPivotanteSN = "N";
		}
		
	public PortaEspecificarTipo getTipoPorta() {
		return tipoPorta;
	}
	public void setTipoPorta(PortaEspecificarTipo tipoPorta) {
		this.tipoPorta = tipoPorta;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public String getportaPivotanteSN() {
		return portaPivotanteSN;
	}
	public void setportaPivotanteSN(String portaPivotanteSN) {
		this.portaPivotanteSN = portaPivotanteSN;
	}
	public double getSePivotante() {
		return sePivotante;
	}

	public double getPadraoAltura() {
		return PadraoAltura;
	}
	
	public double getPadraoLargura() {
		return  PadraoLargura;
	}
	
	
	public double calculaPreco() {
		double valor = this.altura*this.largura * tipoPorta.getPreco();
		if(this.portaPivotanteSN == "S")
			return sePivotante + valor;
		else 
			return valor;
	}
	public void exibePorta(){
		System.out.println("         Informações da porta comprada       ");
		System.out.println(" Tipo da porta: "+this.tipoPorta);
		System.out.println(" Altura da porta: "+this.altura  );
		System.out.println(" Lagura da porta: "+this.largura );
		System.out.println(" Se a porta possui pivotante(S/N): "+this.portaPivotanteSN);
		System.out.println("---------------------------------------------");
	}
}
