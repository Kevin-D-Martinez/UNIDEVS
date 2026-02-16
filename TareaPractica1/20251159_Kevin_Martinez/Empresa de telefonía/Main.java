public class Main {
    public static void main(String[] args) {

        Plan planBasico = new Plan("BASICO", 100, 10, 50.0);
        Cliente cliente = new Cliente("Kevin", "809-555-1234", planBasico);

        Factura factura = new Factura(cliente, 120, 15);
        factura.generarFactura();
    }
}
