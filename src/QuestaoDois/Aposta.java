package QuestaoDois;

	public class Aposta {

private Evento evento;
private Resultado Resultado;
private float ValorApostado;

		  
  public Aposta(Evento evento, Resultado resultado, float valorApostado) {
		super();
		this.evento = evento;
		Resultado = resultado;
		ValorApostado = valorApostado;
			
		}


	public Evento getEvento() {
			
		return evento;
		}
	
	public void setEvento(Evento evento) {
			this.evento = evento;
		}
	
	public Resultado getResultado() {
			return Resultado;
		}
	
	public void setResultado(Resultado Resultado) {
		    this.Resultado = Resultado;
		}
	
	public float getValorApostado() {
			return ValorApostado;
		}
	
	public void setValorApostado(float valorApostado) {
			ValorApostado = valorApostado;
		}
		  
	public double calculaLucro(Evento evento) {
		double ganho = 0;
			if(this.getResultado()== evento.getResultado()) {
				if(this.getResultado()== Resultado.TIME1) {
					 ganho = this.ValorApostado * evento.getTime1Ven();
				}
				
				else if(this.getResultado()== Resultado.TIME2) {
					 ganho = this.ValorApostado * evento.getTime2Ven();
					
				}
					
				else {
					 ganho = this.ValorApostado * evento.getEmpate();
					
				}
			}
			
			return ganho;
		}
}
