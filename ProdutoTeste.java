package classe;

public class ProdutoTeste {

     public static void main(String[] args) {
    	 //uma classe define um tipo
    	 // o construtor tem o mesmo nome da classe a ser chamada
    	 Produto p1 = new Produto("notebook",4356.89);
    	// p1.nome = "notebook";
    	// p1.preco = 4356.89;
    	 //p1.desconto = 0.25;
    	 
    	 
    	 var p2 = new Produto();
    	 p2.nome = "caneta";
    	 p2.preco = 12.56;
    	 
    	 Produto.desconto = 0.50;// alterando o valor do desdonto
    	                         // da classe
    	 
    	 Produto p3 = new Produto();
    	 p3.nome = "casa";
    	 p3.preco = 11.000;
    	 
    	 
    	 System.out.println(p1.nome + " " + p1.precoComdesconto() );
    	 System.out.println(p2.nome+ " " + p2.precoComdesconto());
    	 double precofinal3=p3.precoComdesconto();
		
    	 double precofinal1= p1.precoComdesconto();
    	 double precofinal2= p2.precoComdesconto();
    	 double mediacarrinho = (precofinal1 + precofinal2 + precofinal3) / 2;
    	 System.out.printf("media carrinho = R$%.2f", mediacarrinho);
    	 
	}
}
