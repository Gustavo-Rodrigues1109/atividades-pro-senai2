import java.util.Scanner;

public class dois_logins
{
	public static void main(String[] args) {
	    var sc = new Scanner(System.in);
	    
	    System.out.println("Informe seu login: ");
	        String login = sc.nextLine();
	    System.out.println("Informe sua senha: ");
	        String senha = sc.nextLine();
	    
	if ((login.equals ("atila") && senha.equals("12345")) ||
	   (login.equals ("olivi") && senha.equals("54321"))) {
	    System.out.println("Seja bem vindo!");   
	   }
    
    else {
        System.out.println("Usuário e senha não conferem");
    }
	    
	}

}
