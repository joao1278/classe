package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.8);
		//a.pi=100000;
		
		
		
		//segundo exenplo com mudanca no valor de pi
		AreaCirc a1 = new AreaCirc(5);
		a1.raio = 0;// 
		//AreaCirc.PI = 3.1415;// quando colocamos o valor de pi
		// desta forma, estamos informando que mude o valor de 
		//todas as contas feitas.
		// poren se colocarmos outro valor de pi
		// como esta feito na linha 29
		// o valor ira ser outerado a partir desta linha 
		// entao todos os resultados sera feito com o valor de pi
		//informado na linha 29 
		    
		System.out.println(a.area());
		
		//AreaCirc.PI = 0.0;
		
		System.out.println(a1.area());
		// podemos mudar o valor de pi
		// porque o valor de pi pertece a 
		//cada estâcia
		
	}

}
