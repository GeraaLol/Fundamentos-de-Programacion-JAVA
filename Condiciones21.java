import java.util.Scanner;

public class Condiciones20 
{
	public static void main(String[] Algo) 
	{
		int opcion;
		double AreaTriangulo,bt,at;
		double radio,areaC;
		double lado,areaCuadrado;
		double baseR,alturaR,areaR;
		System.out.println("    Menu \n1.-Area del triangulo \n2.-Area del circulo \n3.Area del cuadro \nSelecciona una opcion...");
		Scanner bote=new Scanner(System.in);
		opcion=bote.nextInt();
		System.out.println(opcion);
	
		
		switch(opcion)
		{
		case 1:
			System.out.println("Area del circulo");
			System.out.println("Teclea la base del triagulo");
			bt=bote.nextDouble();
			System.out.println("Teclea la altura del triangulo");
			at=bote.nextDouble();
			AreaTriangulo=(bt*at)/2;
			System.out.println("Tu resultado es: "+AreaTriangulo);
		break;
		case 2:
			System.out.println("Area del circulo");
			System.out.println("Teclea el radio del circulo");
			radio=bote.nextDouble();
			areaC=(3.1416*radio*radio);
			System.out.println("Tu resultado es: "+areaC);	
		break;
		case 3:
			System.out.println("Area del cuadrado");
			System.out.println("Teclea el lado del cuadrado");
			lado=bote.nextDouble();
			areaCuadrado=(lado*lado);
			System.out.println("Tu resultado es:"+areaCuadrado);
		break;
		case 4:
			System.out.println("Area del rectangulo");
			System.out.println("Teclea la base del rectangulo");
			baseR=bote.nextDouble();
			System.out.println("Teclea la altura del triangulo");
			alturaR=bote.nextDouble();
			areaR=(baseR*alturaR);
			System.out.println();
		break;
		default:
			System.out.println("Tu opcion no existe");
			
		}
	}
}
