public class Arreglos3
{
	public static void main(String[] args) 
	{
		int renglon=5,columna=5;
		int mapa[][]=new int[renglon][columna];
		//llenar la matriz
		for(int x=0;x<renglon;x++) //renglones
		{
			for(int y=0;y<columna;y++) //columna
			{
				mapa[x][y]=(int)(Math.random()*2);
			}
		}
		//impresion de matriz
		for(int x=0;x<renglon;x++)//renglones
		{
			System.out.println();
			for(int y=0;y<columna;y++)//columnas
			{
				System.out.print(" "+mapa[x][y]);
			}
		}
	}

}
