public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempoCarrera = 0;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempo) {
        this.tiempoCarrera = tiempo;
    }

    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo de carrera: " + tiempoCarrera + " minutos");
    }

    public abstract String imprimirTipo();
}
