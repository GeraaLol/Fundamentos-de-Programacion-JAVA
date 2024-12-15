package Si;

public class Condiciones7 
{

	public static void main(String[] Algo)
	{
		int a,b,c;
		System.out.println("a:0 lava los trastes \n b:1 saca la basura \n c:2 saca la basura");
		a=(int)(Math.random()*3);
		b=(int)(Math.random()*3);
		c=(int)(Math.random()*3);
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		if(a==0 || b==1 || c==2)
			//if(a==0 && b==1 && c==2)
			System.out.println("Cumpliste todo");
			else
				System.out.println("Lastima");
	}
}
