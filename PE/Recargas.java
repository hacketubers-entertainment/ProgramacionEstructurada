import java.util.Scanner;
public class Recargas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double BONO = 0.10;
        System.out.print("Número de celular: ");
        String celular = sc.nextLine();
        System.out.print("Saldo actual: ");
        double saldo = sc.nextDouble();
        System.out.print("Recarga: ");
        double recarga = sc.nextDouble();
        double bono = recarga * BONO;
        double total = recarga - bono;
        double saldoFinal = saldo + recarga;
        System.out.println("----- Recarga al " + celular + " -----");
        boolean llegaA200 = saldoFinal >= 200;
        boolean promocion = recarga >= 100 && saldo < 50;
        System.out.println("----- Recarga al " + celular + " -----");
        System.out.println("Recarga: " + recarga);
        System.out.println("Bono: " + bono);
        System.out.println("Total recibido: " + total);
        System.out.println("Saldo final: " + saldoFinal);
        System.out.println("¿Llega a 200?: " + llegaA200);
        System.out.println("¿Aplica promoción?: " + promocion);
        sc.close();
    }
}