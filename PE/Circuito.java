import java.util.Scanner;

public class Circuito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¿Cuantas vueltas recorriste?: ");
        int vueltas = sc.nextInt();
        System.out.println("¿Cuantos Minutos Tardaste?: ");
        double minutos = sc.nextDouble();
        final double CIRCUITO = 0.5;
        double kilometros = vueltas * CIRCUITO;
        double ritmo = minutos/kilometros;
        boolean distancia = kilometros >= 5;
        boolean tiempo = ritmo < 6;
        System.out.println(nombre + " recorriste: " + kilometros);
        System.out.println("con un ritmo de " + ritmo + " min por km");
        System.out.println(distancia);
        System.out.println(tiempo);
        sc.close();
    }
}