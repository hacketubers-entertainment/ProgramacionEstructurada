import java.util.Scanner;
public class holamundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola Mundo");
        System.out.println("Grupo 1-B");
        System.out.println("dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dame tu edad");
        int edad = sc.nextInt();
        System.out.println("tu nombre es " + nombre + " y tu edad es " + edad);
        sc.close();
    }
}