import java.util.Scanner;

public class Suma{
 public static void main(String args[]){
  
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, resultado = 0;

   System.out.println("�C�al es tu nombre?");
   nombre = in.nextLine();

   System.out.println("Escriba el primer numero para sumar:");	
   num1 = in.nextInt();
   System.out.println("Escriba el segundo numero para sumar:");	
   num2 = in.nextInt();
   
   resultado = num1 +num2;
   System.out.println("Hola " + nombre + ", el resultado de la suma es: " + resultado);	
 }
}
