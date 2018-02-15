import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculadora casio = new Calculadora();
		int opcion = 0;
		System.out.println("### MENU ###");
		System.out.println("1 -  PARA SUMAR");
		System.out.println("2 - PARA RESTAR");
		System.out.println("3 - PARA MULTIPLICAR");
		System.out.println("4 - PARA DIVIDIR");
		
		Scanner scan = new Scanner(System.in);
		opcion = scan.nextInt();
	
		switch (opcion) {
		case 1:
			try {
				
				int  resultadoSuma = casio.suma();
				
				System.out.println("El resultado de la suma es: " + resultadoSuma);
				
			} catch (NumberFormatException e) {
				System.out.println("Error de formato de numero");
			}
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
	
			try {
				int resultadoDivision = casio.division();
				
				System.out.println("El resultado de la divison es: " + resultadoDivision);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			break;
		default:
			break;
		}
		
		

	}

}
