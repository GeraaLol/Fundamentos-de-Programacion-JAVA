package AreasyVolumenes;

import java.util.*;

public class Triangulo
{
	public static void main(String cualquiercosa[])
	{
		Scanner bote= new Scanner(System.in);
		double areaTriangulo,base,altura;
		
		System.out.println("Teclea la base del triangulo ");
		base=bote.nextDouble();
		System.out.println("Teclea la altura del triangulo");
		altura=bote.nextDouble();
		
		areaTriangulo=(base*altura)/2;
		
		System.out.println("El area del triangulo es "+areaTriangulo);
		
		
	}
	
	
}
