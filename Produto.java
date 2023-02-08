package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	Produto (String nomeInicial, double precoInicial ){
		nome = nomeInicial;
		preco = precoInicial;
		//DESCONTO = descontoInicial;
			
	}
	Produto (){
		
	}
	
	// aula 96
	// outros tipos de metodos
	// olhar a aula
	double precoComdesconto() {
		return preco * (1 - desconto);
	}
		double precoComDesconto (double descontoDoGerente) {
			return preco * (1 - desconto + descontoDoGerente);
		
		
		
	}

}
