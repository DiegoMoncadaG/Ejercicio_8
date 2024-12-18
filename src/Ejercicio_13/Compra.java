package Ejercicio_13;

public class Compra {
    private double valorCompra;
    private String colorBolita;

    public Compra(double valorCompra, String colorBolita) {
        this.valorCompra = valorCompra;
        this.colorBolita = colorBolita.toUpperCase();
    }

    public double calcularValorPagar() {
        int porcentajeDescuento;

        switch (colorBolita) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            default:
                porcentajeDescuento = 100;
                break;
        }

        return valorCompra - (porcentajeDescuento * valorCompra / 100);
    }
}
