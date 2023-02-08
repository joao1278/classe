package classe;

public class PrimeiroTrauma {
	
	int a = 5;//o atributo pertence a instancia
	static int b = 6;
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();// tenho que criar uma
		// instancia para acessar o atributo da instancia
		//--- mesmo estando na mesma classe 
		// tenho que criar uma instancia
		System.out.println(p.a);
		
		System.out.println(b);// por b ser estatic posso 
		//acessar ele diretamente
		
		
	}

}
