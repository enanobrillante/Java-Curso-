import java.util.Scanner;

public class Clase17loginwhile{
 public static void main(String args[]){
  
  String usuario = ""; 
  String password = "";
  Scanner entrada = new Scanner(System.in);
  
  while(usuario != "Mauro" && password != "1234"){
   
   System.out.print("Ingresa tu nombre de Usuario: ");  
   usuario = entrada.nextLine();
   System.out.print("Ingresa tu password: ");  
   password = entrada.nextLine();
   


   if(usuario.equals("Mauro") && password.equals("1234")){
   System.out.println("Inicio de sesi�n correcto");
   } else {
	System.out.println("Usuario o contrase�a incorrectos");
        usuario = "";
        password = "";
	}
    
   }
 }
}