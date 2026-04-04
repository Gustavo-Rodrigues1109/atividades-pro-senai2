import java.util.Scanner;

public class black_friday
{
	public static void main(String[] args) {
	    var sc = new Scanner(System.in);
	    
	    System.out.println("Informe o valor do produto: ");
	        Double valor = sc.nextDouble();
	    System.out.println("Informe a forma de pagamento: ");
	        int pag = sc.nextInt();
	    
	if (pag == 1) {
	    double desc1 = 10;
	    double V1 = valor - (valor * desc1 / 100);
	    System.out.println("O valor com desconto é de "+ V1);
	   }
    else if (pag == 2) {
	    double desc2 = 5;
	    double V2 = valor - (valor * desc2 / 100);
	    System.out.println("O valor com desconto é de "+ V2);
	   }   
    else if (pag == 3) {
	    double desc3 = 3;
	    double V3 = valor - (valor * desc3 / 100);
	    System.out.println("O valor com desconto é de "+ V3);
	   }
    else if (pag == 4) {
	    double desc4 = 7.5;
	    double V4 = valor - (valor * desc4 / 100);
	    System.out.println("O valor com desconto é de "+ V4);
       }
	   
	}

}
