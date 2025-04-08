package parctica.ciclismo;


public class Velocista extends Ciclista {
    
    private double potenciaPromedio;
    private double velocidadSprint;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potencia) {
        this.potenciaPromedio = potencia;
    }

    public double getVelocidadSprint() {
        return velocidadSprint;
    }

    public void setVelocidadSprint(double velocidad) {
        this.velocidadSprint = velocidad;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " W");
        System.out.println("Velocidad en sprint: " + velocidadSprint + " Km/h");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
}
