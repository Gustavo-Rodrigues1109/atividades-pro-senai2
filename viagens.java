import java.util.Scanner;

public class maior_menor {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        System.out.print("Qual distancia você pretende percorrer? : ");
        var distancia = sc.nextInt();
        double preco;
        
        if (distancia <= 200) preco = 0.50;
        else preco = 0.45;
        
        double ValorDaViagem = distancia * preco;
        
        System.out.printf("O valor da viagem é de %.2fR$", ValorDaViagem);
        
    }
}
