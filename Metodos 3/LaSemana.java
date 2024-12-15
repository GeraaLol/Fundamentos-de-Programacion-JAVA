package Jueves;

public class LaSemana 
{
	public static void main(String[] args) 
	{
		Lunes dia=new Lunes();
		Martes diaM=new Martes();
		LaSemana xxx=new LaSemana();
		
		xxx.misActividades();
		System.out.println();
		dia.actividadesLunes();
		System.out.println();
		diaM.actividadesMartes();
	}
	public void misActividades()
	{
		System.out.println("Mis actividades de la semana son: ");
		
	}
}
