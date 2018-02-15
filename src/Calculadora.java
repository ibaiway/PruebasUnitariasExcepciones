import java.util.Scanner;

public class Calculadora {

	public int suma()throws NumberFormatException{
		int resultado= 0;
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un primer numero para sumar:");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("Dime el segundo numero para sumar:");
		num2 = Integer.parseInt(scan.nextLine());
		
		resultado = num1 + num2;

		
		return resultado;
	}
	
	public int division()throws Exception{
		int resultado = 0;
		int num1;
		int divisor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el numero que quieres dividir:");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("Dime el numero divisor:");
		divisor = Integer.parseInt(scan.nextLine());
		if(divisor == 0){
			throw new Exception("El divisor no puede ser = 0");
		}
		resultado = num1/divisor;
		scan.close();
		
		return resultado;
	}
}
