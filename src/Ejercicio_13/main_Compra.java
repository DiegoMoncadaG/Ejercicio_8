package Ejercicio_13;

import java.util.Scanner;

public class main_Compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el color de la bolita (Blanco, Verde, Amarillo, Azul, Roja): ");
        String colorBolita = scanner.nextLine();

        Compra compra = new Compra(valorCompra, colorBolita);
        double valorPagar = compra.calcularValorPagar();

        System.out.println("\nEl cliente debe pagar: $" + valorPagar);
    }
}
