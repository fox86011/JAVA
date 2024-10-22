package clearminds.cuentas;

public class Cuenta {
    private String id;
    private String tipo = "A"; // Valor por defecto
    private double saldo;

    // Constructor que recibe el id
    public Cuenta(String id) {
        this.id = id;
    }

    // Constructor que recibe todos los atributos
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Métodos getter y setter
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return  saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }
    public void imprimir() {
        System.out.println("**********************************");
        System.out.println("CUENTA");
        System.out.println("**********************************");
        System.out.println("Número de Cuenta: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: USD " + saldo);
        System.out.println("**********************************");
    }

    public void imprimirConMiEstilo() {
        System.out.println("==================================");
        System.out.println("Datos de la Cuenta");
        System.out.println("==================================");
        System.out.printf("ID: %s\n", id);
        System.out.printf("Tipo: %s\n", tipo);
        System.out.printf("Saldo: $%.2f\n", saldo);
        System.out.println("==================================");
    }
}
