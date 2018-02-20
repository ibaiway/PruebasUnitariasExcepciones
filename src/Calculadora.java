import java.util.Scanner;

public class Calculadora {

	public int suma(int num1, int num2)throws NumberFormatException{
		int resultado;
		
		resultado = num1 + num2;
		
		return resultado;
	}
	
	public int division(int num1, int divisor)throws Exception{
		int resultado = 0;		
		if(divisor == 0){
			throw new Exception("El divisor no puede ser = 0");
		}
		resultado = num1/divisor;
		
		return resultado;
	}
}
