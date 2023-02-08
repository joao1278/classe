package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;  // fiz uma atribuição por valor
		
		a++;
		b--;
		System.out.println(a + " "+ b);
		
		data d1 = new data();
		data d2 = d1; // fiz uma atribuição por referencia 
		              // pois estou trabalhando com ( Objeto )
		
		d1.dia = 25;
		d2.mes = 06;
		
		data d3 = new data(01,15,2025);
		data d4 = d3;
		
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		System.out.println(d4.obterDataFormatada());
		
		VoltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

	static void VoltarDataParaValorPadrao(data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		// passando um objeto como parametro
		// para uma função
		
		// ele vai por padrao como uma referencia
		
	}
}
