package Pruebas;

public class Corredor 
{
	public static void main(String[] args) 
	{
		int vex=8,algo=0;
		int separao[]=new int[vex];
		
		for(int y=0;y<8;y++)
		{
			separao[y]=(int)(Math.random()*2);
			System.out.print(" "+separao[y]);
		}
			if(separao[0]==separao[1] && separao[0]==1)
			{
				algo++;
			}
			if(separao[1]==separao[2] && separao[1]==1)
			{
				algo++;
			}
			if(separao[2]==separao[3] && separao[2]==1)
			{
				algo++;
			}
			if(separao[3]==separao[4] && separao[3]==1)
			{
				algo++;
			}
			if(separao[4]==separao[5] && separao[4]==1)
			{
				algo++;
			}
			if(separao[5]==separao[6] && separao[5]==1)
			{
				algo++;
			}
			if(separao[6]==separao[7] && separao[6]==1)
			{
				algo++;
			}
		
		System.out.println("\nPares de Uno en total\n"+algo);
		
	}
}
