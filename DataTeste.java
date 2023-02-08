package classe;

public class DataTeste {

	
	public static void main(String[] args) {
	
		data d1 = new data();
		
		d1.ano = 1987;
		d1.dia = 26;
		d1.mes = 07;
		// para exibir a data no formato certo
		// colocamos (%d) e separamos com (/) para 
		// formar o valor da data
		
		
		// criei uma stancia para poder acessar a variavel 
		data d2 = new data(25,12,1500);
		
		//d2.ano = 1987;
		//d2.dia = 05;
		//d2.mes = 11;
		
		data d3 = new data();// tbem podemos colocar o numero desejado
		d3.dia = 25;
		
		
		
		// d3 entrou no formato padrao
		// explicito no objeto 
		//data padrao colocada
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	
		
		
	}
}
