import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
	Scanner teclado= new Scanner (System.in);
	int suma;
	int resta;
	int division;
	int multiplicacion;
	System.out.println("Introduce dos numeros para realizar operaciones");
	int num1= teclado.nextInt();
	int num2=teclado.nextInt();
	int resultado= num1+num2;
	int resultado1=num1-num2;
	int resultado2=num1/num2;
	int resultado3=num1*num2;
	System.out.println("La suma de los dos numeros es:"+ num1+ "+" +num2+ "=" +resultado );
	System.out.println("La resta de los dos numeros es:"+num1+ "-" +num2+ "=" + resultado1);
	System.out.println("La division de los dos numeros es:"+num1+ "/" +num2+ "=" + resultado2);
	System.out.println("La multiplicacion de los dos numeros es:"+num1+ "*" +num2+ "=" + resultado3);

	}

}
