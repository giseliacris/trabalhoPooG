package br.uern.di.poo.unidade1.construcao;

public enum PortaEspecificarTipo {
	SIMPLES("compensada","simpes",50.00),
	PADRAO("andiroba","com encaixe",140.00),
	LUXO("ipe","do tipo tetra",350.00);
		private final String madeira;
		private final String tipoFechadura;
		private final double preco;


	private PortaEspecificarTipo(String madeira, String tipoFechadura, double preco) {
		this.madeira = madeira;
		this.tipoFechadura = tipoFechadura;
		this.preco = preco;
	}

	public String getMadeira() {
		return madeira;
	}
	public String getTipoFechadura() {
		return tipoFechadura;
	}
	public double getPreco() {
		return preco;
	}
}
