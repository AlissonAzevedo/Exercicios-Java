import java.util.*;
public class Baskara {
	public static void main (String args[]) {
		double x1, x2;
		Scanner entrada;
		entrada = new Scanner(System.in);  
  		System.out.print("Informe o valor de a: ");
  	double a = entrada.nextDouble();		
  		System.out.print("Informe o valor de b: ");
  	double	b = entrada.nextDouble();		
  		System.out.println("Informe o valor de c: ");
  	double	c = entrada.nextDouble();		
  		if (a == 0){
        System.out.println("Estes valores não formam uma equação de segundo grau ");
      }
    
      else { 
     			double delta = (b * b) - ( 4 * a * c);
       			if (delta < 0)
	  			      System.out.println("Não existe raiz real ");
       			if (delta == 0) { 
	  			      System.out.println("Existe uma raiz real");
	    		      x1 = (- b) / (2 * a);
                String x1Format = String.valueOf(x1);
            if (x1Format.contains("0.5")){ 
                x1Format = "1/2";
                System.out.println("Raiz = "+x1Format);
            }
			
	  			}            
       		if (delta > 0) { 
	  			System.out.println("Existem duas raízes reais");
	    			x1 = (- b + Math.sqrt(delta))/(2 * a);
	    			x2 = (- b - Math.sqrt(delta))/( 2 * a);
	    			System.out.println("Primeira raiz = " + x1);
	    			System.out.println("Segunda raiz = " + x2);
	  			 }
    		}
	}
}