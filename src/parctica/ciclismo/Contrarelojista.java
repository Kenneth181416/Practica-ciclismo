package parctica.ciclismo;

public class Contrarelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos(); // Llama al método de Ciclista
        System.out.println("Velocidad máxima: " + velocidadMaxima + " Km/h");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
}
