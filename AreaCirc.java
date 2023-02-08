package classe;

public class AreaCirc {
	
	
	double raio ;
	static final double PI = 3.14 ;
	
	 AreaCirc(double raioInicial) {//construtor com parimetro
		 //PI = 3.14;
		 raio = raioInicial;// obriga a dizer qual o raio
		                    // na criacao do objeto
		
	}
              //metodo
	 double area() {
		 return PI * raio * raio ;
	 }
	 
	 // criar um metodo static
	 
	 
}
