package QuestaoDois;

	public class Evento {
	      
	private String descrever,time1,time2;
	    private double time1Ven;
	    private double empate;
	    private double time2Ven;
	    private Resultado Resultado;


 public Evento(String descrever, String time1, String time2, double time1Ven, double empate, double time2Ven) {
		super();
		this.descrever = descrever;
		this.time1 = time1;
		this.time2 = time2;
		this.time1Ven = time1Ven;
		this.empate = empate;
        this.time2Ven = time2Ven;
        
		}
 	
 
     public String getDescrever() {
			return descrever;
		}


	public void setDescrever(String descrever) {
			this.descrever = descrever;
		}
		
	public Resultado getResultado() {
			return Resultado;
		}


	public void setResultado(Resultado resultado) {
			Resultado = resultado;
		}

	public String getTime1() {
			return time1;
		}


	public void setTime1(String time1) {
			this.time1 = time1;
		}


	public String getTime2() {
			return time2;
		}


	public void setTime02(String time2) {
			this.time2 = time2;
		}


	public double getTime1Ven() {
			return time1Ven;
		}


	public void setTime1Ven(double time1Ven) {
			this.time1Ven = time1Ven;
		}


	public double getEmpate() {
			return empate;
		}


	public void setEmpate(double empate) {
			this.empate = empate;
		}


	public double getTime2Ven() {
			return time2Ven;
		}


	public void setTime2Ven(double time2Ven) {
			this.time2Ven = time2Ven;
		}
		
		
}
	
