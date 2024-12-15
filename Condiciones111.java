package Condiciones11;

public class Condiciones111 
{
	public static void main(String[] ElPepe)
	{
		int a,b,c;
		a=(int)(Math.random()*1001);
		b=(int)(Math.random()*1001);
		c=(int)(Math.random()*1001);
		System.out.println("A:"+a+"\nB:"+b+"\nC:"+c);
		if (a<500)
			System.out.println("Este numero es menor a 500 "+a);
		else
			System.out.println("Tu Numero "+a+ "no es menor a 500");
		if (b>600 && b<700)
			System.out.println("Este numero es intermedio "+b);
		else 
			System.out.println("Tu numero no esta en el intermedio "+b);
		if (c>800)
			System.out.println("Este numero es mayor a 800 "+c);
		else
			System.out.println("Tu numero "+c+"no es mayor a 800");
	}

}
