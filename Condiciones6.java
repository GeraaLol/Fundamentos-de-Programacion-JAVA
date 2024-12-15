package Si;

public class Condiciones6 
{
	public static void main(String[] Algo)
	{
		int a,b,c;
		a=(int)(Math.random()*10);
		b=(int)(Math.random()*10);
		c=(int)(Math.random()*10);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(a>b && a>c)
			System.out.println(" "+a+" Fue el mayor que "+b+" y "+c);
		if(b>a && b>c)
			System.out.println(" "+b+" Fue mayor que "+a+" y "+c);
		if(c>a && c>b)
			System.out.println(" "+c+" Fue mayor que "+a+" y "+b);
		if(b>c && b>a)
			System.out.println(" "+b+" Fue mayor que "+c+ " y "+a);
		if(c>b && c>a)
			System.out.println(" "+c+" Fue mayor que "+b+ " y "+c);
		if(a==b && a==c)
			System.out.println(" "+a+" Es igual que"+b+ " y "+c);
		if(b==c && b==a)
			System.out.println(" "+b+" Es igual que "+c+ " y "+a);
	}

}
