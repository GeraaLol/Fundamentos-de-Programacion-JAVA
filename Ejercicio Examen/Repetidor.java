package Pruebas;

public class Repetidor 
{
	public static void main(String[] args) 
	{
		int vec=8,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
		int separador[]=new int[vec];
		
		for(int x=0;x<separador.length;x++)
		{
			separador[x]=(int)(Math.random()*10);
			System.out.print(" "+separador[x]);
			
			if(separador[x]==0)
			{
			a++;
			}
			if(separador[x]==1)
			{
				b++;
			}
			if(separador[x]==2)
			{
				c++;
			}
			if(separador[x]==3)
			{
				d++;
			}
			if(separador[x]==4)
			{
				e++;
			}
			if(separador[x]==5)
			{
				f++;
			}
			if(separador[x]==6)
			{
				g++;
			}
			if(separador[x]==7)
			{
				h++;
			}
			if(separador[x]==8)
			{
				i++;
			}
			if(separador[x]==9)
			{
				j++;
			}
		}
		System.out.println("Las veces que se repitieron los numeros"+"\n0 se repitio"+a+"veces"+"\n1 se repitio"+b+"veces"
				+"\n2 se repitio"+c+"veces"+"\n3 se repitio"+d+"veces"+"\n4 se repitio"+e+"veces"+"\n5 se repitio"+f+"veces"
				+"\n6 se repitio"+g+"veces"+"\n7 se repitio"+h+"veces"+"\n8 se repitio"+i+"veces"+"\n9 se repitio"+j+"veces");
	}
}
