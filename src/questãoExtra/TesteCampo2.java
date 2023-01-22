package questãoExtra;

import java.util.Random;
import java.util.Scanner;



public class TesteCampo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ent = new Scanner(System.in);
		 
		 
		  System.out.println("altura do campo");
	        String altura = ent.next();
	        System.out.println("largura do campo");
	        String largura = ent.next();
	        System.out.println("raio da bola");
	        String raio= ent.next();
	        
	        
 ParOrdenado Posicaoinicial = new ParOrdenado(0,0);
	        
 Random Aleatorio = new Random();
 
 double total = Double.parseDouble(largura) + Double.parseDouble(altura);
 double maximo =(10*total)/100;
 double minimo = (5*total)/100;
 double velocidade = Aleatorio.nextDouble((maximo-minimo )+ 1)+minimo;
  Bola bola               = new Bola(Posicaoinicial,velocidade, velocidade);
	       
	 CampoRegular campo = new CampoRegular(Posicaoinicial, Double.parseDouble(largura), Double.parseDouble(altura), bola);
	       
	        for (int i = 1; i < 31; i++) {
	            campo.movimentaBola();
	            System.out.println(i + ": " + campo.getBolaM().toString());
	             }

	
	}
}
