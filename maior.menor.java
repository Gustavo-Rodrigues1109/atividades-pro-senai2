import java.util.Scanner;

public class maior_menor {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        // Ler os três números
        System.out.print("Digite o primeiro número: ");
            var num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
            var num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
            var num3 = sc.nextInt();

        // Inicializa maior e menor com o primeiro número
        
            var maior = num1;
            var menor = num1;

        // Descobrir o maior
        
            if (num2 > maior) maior = num2;
            if (num3 > maior) maior = num3;

        // Descobrir o menor
        
            if (num2 < menor) menor = num2;
            if (num3 < menor) menor = num3;

        // Calcular soma e média
        
            var soma = num1 + num2 + num3;
            var media = soma / 3.0;
            
            System.out.println("maior = "+ maior);
            System.out.println("menor = "+ menor);
            System.out.println("soma = "+ soma);
            System.out.print("media = "+ media);
    }
}
