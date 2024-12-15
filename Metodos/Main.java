public class Main
{
	public static void main(String[] args) 
	{
		VoidMain tec=new VoidMain();
		tec.misDatos();
		tec.miDireccion();
		//tec.misFinanzas();
		VoidMain tkt=new VoidMain();
		tkt.miEscuela();
		tkt.misDatos();
	}
	
	public void misDatos()
	{
		System.out.println("Gera");
		System.out.println("Tec");
	}
	
	public void miDireccion()
	{
		System.out.println("Vivo en chicali");
	}
	public void misFinanzas()
	{
		for(;;)
		{
			System.out.println("Hoy es martes");
		}
	}
	public void miEscuela()
	{
		System.out.println("ITMexicali");
	}
	

}
