import java.util.Scanner;             // 1: importa la librería necesaria para tu programa 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.print("Minutos de estudio: ");
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int sobrantes = minutos % 60;
        double horasExactas = minutos / 60.0;
        System.out.println("Tiempo de estudio de " + nombre);
        System.out.println(horas + " horas y " + sobrantes + " minutos");
        System.out.println("En horas: " + horasExactas);
        sc.close();
    }
}