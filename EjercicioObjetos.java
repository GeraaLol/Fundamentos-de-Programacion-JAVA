public class EjercicioObjetos
{
	public static void main(String[] args) 
	{
		Miercoles objeto= new Miercoles();
		objeto.losnumeros();
		objeto.misdatos();
		objeto.multi();
		objeto.par();
	}
	public void losnumeros()
	{
		int num1,num2,resultado;
		num1=(int)(Math.random()*100);
		num2=(int)(Math.random()*100);
		resultado=num1+num2;
		System.out.println("Resultado suma..."+resultado);
	}
	public void misdatos()
	{
		System.out.println("GeraLol");
		System.out.println("19");
		System.out.println("Cecyte");
		
	}
	public void multi()
	{
		int a,b,c;
		a=(int)(Math.random()*500);
		b=(int)(Math.random()*500);
		c=(a*b);
		System.out.println("Resultado multi..."+c);
	}
	public void par()
	{
		int par,par2;
		par=(int)(Math.random()*100);
		par2=(int)(Math.random()*100);
		if(par==par2)
			System.out.println("Son pares..."+par+"..."+par2);
		else
			System.out.println("No son pares..."+par+"..."+par2);
	}
	//sumar 2 numeros random
	//mostrar sus datos nombre edad escuela procedencia
	//multiplicar 3 numeros random por 500
	//indicar si un numero random por 100 es par
	
	//solicitar año de nacimiento
	//ingresar otro año de nacimiento
	//output: indicar cuantos años tendrá tiene o tuvo
	

}
