import java.util.Scanner;

public class Login{
 public static void main(String args[]){
 
 String usuario = "", password = "";
 Scanner entrada = new Scanner(System.in);

 System.out.print("ingresa el nombre de usuario: ");
 usuario = entrada.nextLine();
 
 System.out.print("ingresa tu contraseña: ");
 password = entrada.nextLine();
 
 if(usuario.equals("yefri") && password.equals("123456")){
 System.out.println("inicio de secion corecto: ");
 } else {
 System.out.println("nombre de usuario o password incorrectos: ");
 }
 }
}