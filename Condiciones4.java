package Si;

public class Condiciones4 
{
	public static void main(String [] ElPepe)
	{
		int dia;
		dia=(int)(Math.random()*9);
		System.out.println(dia);
		if(dia==0)
			System.out.println("Domingo");
		else
		if(dia==1)
			System.out.println("Lunes");
		else
		if(dia==2)
			System.out.println("Martes");
		if(dia==3)
			System.out.println("Miercoles");
		else
		if(dia==4)
			System.out.println("Jueves");
		else
		if(dia==5)
			System.out.println("Viernes");
		else
		if(dia==6)
			System.out.println("Sabado");
		else
			System.out.println("Tu dia no existe");
		
	}
	

}
