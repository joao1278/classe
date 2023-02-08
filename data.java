package classe;

public class data {
	//quando for criar uma classe
	// nao utiliza o sinal de igualdade (=)
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
	data (){//construtor padrao
		dia = 01;//desta forma estamos colocando uma data
		mes = 01;//padrao para o formato da data
		ano = 1970;
		
	}
	
	data (int diaInicial,int mesInicial ,int anoInicial) {
		 dia = diaInicial;
		 mes = mesInicial;
		 ano = anoInicial;
		
		
	}

	

}
