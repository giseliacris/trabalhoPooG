package questãoExtra;

import java.util.Scanner;


public class TesteCampo {
public static void main(String[] args) {

		
	Scanner op = new Scanner(System.in);
	
    System.out.println("Posição do campo");
    String posicao = op.next();
    System.out.println("altura do campo");
    String altura = op.next();
    System.out.println("largura do campo");
    String largura = op.next();
    System.out.println("Posição do eixo X");
    String X = op.next();
    System.out.println("Posição do eixo Y");
    String Y = op.next();
    System.out.println("raio da bola");
    String raio = op.next();
    System.out.println("Velocidade vertical");
    String veloVertical = op.next();
    System.out.println("Velocidade horizontal"); 
    String veloHorizontal = op.next();
        
        
        X.replaceAll(",", ".");
        Y.replaceAll(",", ".");

   ParOrdenado posCentro = new ParOrdenado(Double.parseDouble(X)      , Double.parseDouble(Y));
   ParOrdenado posicaoCanto = new ParOrdenado(-Double.parseDouble(largura)/2, Double.parseDouble(altura)/2);

   Bola         bola        = new Bola(posCentro, Double.parseDouble(veloHorizontal), Double.parseDouble(veloVertical));
   CampoRegular campo = new CampoRegular(posicaoCanto, Double.parseDouble(largura), Double.parseDouble(altura), bola);

        for (int i = 1; i < 31; i++) {
            campo.movimentaBola();
            System.out.println(i + ": " + campo.getBolaM().toString());
        }
	}
}
