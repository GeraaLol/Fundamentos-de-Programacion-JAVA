package Si;

public class Condiciones3 
{
	public static void main(String ElPepe[])
	{
		int num1,num2;
		num1=(int)(Math.random()*5);
		num2=(int)(Math.random()*5);
		System.out.println("Valor de numero es "+num1);
		System.out.println("Valor de numero es "+num2);
		//Operador < menor que
		if(num1<num2)
			System.out.println("El "+num1+" es menor que "+num2);
		//else
			if(num1<=num2)
				System.out.println("El "+num1+" es menor o igual que "+num2);
			//else 
				if(num1>num2)
					System.out.println("El "+num1+" es mayor que "+num2);
				//else
					System.out.println("Ninguno");
			
	}

}
