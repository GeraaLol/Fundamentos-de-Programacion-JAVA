import java.util.Scanner;

public class Arreglos4
{
	public static void main(String[] args) 
	{
		int renglon,columna;
		int mapa[][]=new int[renglon][columna];
		Scanner contenedor=new Scanner(System.in);
		renglon=contenedor.nextInt();
		System.out.println("Renglon");
		Scanner bote=new Scanner(System.in);
		columna=bote.nextInt();
		System.out.println("Columna");
		
		for(int x=0;x<renglon;x++)
		{
			for(int y=0;y<columna;y++)
			{
				mapa[x][y]=(int)(Math.random()*2);
			}
		}
		for(int x=0;x<renglon;x++)
		{
			System.out.println();
			for(int y=0;y<columna;y++)
			{
				System.out.print(" "+mapa[x][y]);
			}
		}
		
	}

}
