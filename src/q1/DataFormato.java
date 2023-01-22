package q1;
import java.util.Scanner;

public class DataFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //questão 1 letra b-14.19
	Scanner date = new Scanner(System.in);
	System.out.println("Bem vindo usuário:");
	System.out.println("Informe uma data seguinte o formaato (dd/mm/AAAA)");
	String data = date.nextLine();
	
	String dia = data.substring(0, 2);
	String Mes = data.substring(3, 5);
	String ano = data.substring(6,data.length());
		
	switch (Mes) {
		
	case "01":
		System.out.println("January " + dia+" ," + ano);
		
		break;
		
	case "02":
		System.out.println("February " + dia+" ," + ano);
		
		break;
		
	case "03":
		System.out.println("March" + dia+" ," + ano);
		
		break;
		
	case "04":
		System.out.println("April" + dia+" ," + ano);
		
		break;
		
	case "05":
		System.out.println("May" + dia+" ," + ano);
		
		break;
		
	case "06":
		System.out.println(" June" + dia+" ," + ano);
		
		break;
		
	case "07":
		System.out.println("July" + dia+" ," + ano);
		
		break;
	
	case "08":
		System.out.println("August" + dia+" ," + ano);
		
		break;
		
	case "09":
		System.out.println("September" + dia+" ," + ano);
		
		break;
		
	case "10":
		System.out.println("October " + dia+"," + ano);
		
		break;
		
	
	case "11":
		System.out.println("November " + dia+"," + ano);
		
		break;
		
	case "12":
		System.out.println("December " + dia+"," + ano);
		
		break;
		
	default:
		System.out.println("Data informada é inválida");
		}

	}

}
