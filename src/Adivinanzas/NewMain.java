package Adivinanzas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bossjjfl
 */
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        Scanner entrada = new Scanner(System.in);
        String opc;
        int numAle, num1, intentos=0;
        boolean salida=false, juego=false;
        Random random = new Random();
        
        System.out.println("********Adivina el número********\ningresa el numero del (1-100) hasta ganar!\nescribe 'salir' para hacerlo.");
        while(!salida){
            System.out.println("_____________________________________________\nGenerando numero...");numAle=random.nextInt(101);
            System.out.println("Numero Generado...");
            System.out.println("Ingresar");
            while(!juego){
                System.out.print("---> ");
                try{
                    num1=entrada.nextInt();
                }catch(Exception e){
                    String texto=entrada.next().toLowerCase();
                    if (texto.equals("salir")) {
                        juego=true;
                        salida=true;
                        continue;
                    }else{
                        System.out.println("Volver a intentar....");
                        continue;
                    }
                }
                intentos++;
                if (num1<0 || num1 >100) {
                    System.out.println("Volver a intentar...");
                }else if(num1<numAle){
                    System.out.println("Es mayor...");
                }else if(num1>numAle){
                    System.out.println("Es menor...");
                }else{
                    System.out.println("Has ganado en "+intentos+" intentos");
                    juego=true;
                }
            }
            if (salida==true) {
                continue;
            }else{
                System.out.print("_____________________________________________\nDesea volver a jugar\ny/n:: ");opc=entrada.next().toLowerCase();
                switch (opc) {
                    case "y":
                        intentos=0;
                        juego=false;
                        continue;
                    default:
                        salida=true;
                        continue;
                }
            }
        }
        System.out.println("_____________________________________________\nAdios...");
        entrada.close();
    }  
}