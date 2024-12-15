public class Arreglos5
{
	public static void main(String[] args) 
	{
		int renglon=5,columna=5;
		int matrix[][]=new int[renglon][columna];
		//llenar la matriz
		for(int x=0;x<renglon;x++)
		{
			for(int y=0;y<columna;y++) //columna
			{
				matrix[x][y]=(int)(Math.random()*2);
			}
		}
		//impresion de matriz
		for(int x=0;x<renglon;x++)
		{
			System.out.println();
			for(int y=0;y<columna;y++)
			{
				System.out.print(" "+matrix[x][y]);
			}
		}
		if (matrix[0][0]==1 && matrix[1][10])
	}

}
