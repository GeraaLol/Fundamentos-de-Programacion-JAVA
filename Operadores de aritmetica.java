package Aritmetica;
import java.util.Scanner;
public class Operadores 
{

	public static void main(String algo[])
	{
		Scanner bote=new Scanner(System.in);
		double a0,a1,a2,a3,a4,a5,b,c;
	
		System.out.println("Teclea el valor de B");
		b=bote.nextDouble();
		System.out.println("Teclea el valor de C");
		c=bote.nextDouble();
		
		System.out.println("Tu valor de variable es... "+b+" "+c);
		//a0=b*b;
		a0=Math.pow(b, 2);
		System.out.println("El resultado es... "+a0);
		////////////////////////////////////////////
		//a1=b_elevado_a_la_2_mas_b
		//a1=b*b+b;
		a1=Math.pow(b, 2)+b;
		System.out.println("El resultado de la segunda expresion es... "+a1);
		
		a2=(c+b)/(c*c);
		System.out.println("El resultado de la tercera ecp es... "+a2);
		
		a3=((c*c)+(b*b))/b;
		System.out.println("El resultado de la cuarta exp es... "+a3);
		
		a4=((b*b)-(4*b*c))/(2*b);
		System.out.println("El resultado de la quita exp es... "+a4);
		
		a5=Math.sqrt(b);
		System.out.println("El resultado de la sexta exp es... "+a5);
		
		
	}
}
