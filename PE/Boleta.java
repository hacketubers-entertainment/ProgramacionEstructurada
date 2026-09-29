import java.util.Scanner;

public class Boleta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Cual es tu primera calificacion?");
        double calif1 = sc.nextDouble();
        System.out.println("Cual es tu segunda calificacion?");
        double calif2 = sc.nextDouble();
        double promedio = (calif1 + calif2) / 2;
        System.out.println(nombre + " tu caliificacion total es: " + promedio);
        sc.close();
    }
}