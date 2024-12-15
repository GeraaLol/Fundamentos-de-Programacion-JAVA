import java.util.Scanner;
public class Condiciones14 
{
	public static void main(String[] Algo)
	{
		Scanner bote=new Scanner(System.in);
		int a,b;
		System.out.println("Teclea un número");
		a=bote.nextInt();
		b=(int)(Math.random()*10);//genera un num aleatorio entre 0 y 10
		System.out.println("Numero aleatorio generado: "+b);
		
		if (a<10)
		{
			System.out.println("Tu numero es correcto");
		if (b==a)
			System.out.println("Ganaste");
		else
			System.out.println("Perdiste");
		}
		else
			System.out.println("Tu numero es incorrecto");		
	}

}
/*/
*/