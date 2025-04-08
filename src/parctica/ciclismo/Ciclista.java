

package parctica.ciclismo;


public abstract class Ciclista {
 
    private int id;
    private String nombre;
    private int tiempoCarrera = 0;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    // Método que puede llamar una subclase con super.imprimirDatos()
    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoCarrera + " minutos");
    }

    // Método abstracto
    public abstract String imprimirTipo();
}
