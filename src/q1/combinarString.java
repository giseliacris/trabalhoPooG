package q1;

import java.util.Scanner;

public class combinarString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
String palavra;
int tam;
System.out.println("Informe uma palavra com 5 letras: ");
palavra = entrada.next();
	
	if(palavra.length() !=5) {
		 System.out.println("A palavra não possui a quantidade de letras que foi solicitado.");
		
		 return;
		 }
  char words[] = palavra.toCharArray();
		
  tam = words.length ;
		
	 for (int i = 0; i < tam; i++)
		 for (int j = 0; j < tam; j++)
		    for (int k = 0; k < tam; k++) {
		       if(!(i == j || j == k || k== i)){
		            System.out.print(words[i]);
		            System.out.print(words[j]);
		            System.out.print(words[k]);
		            System.out.println("");
		 }
		 }
			


	}

}
