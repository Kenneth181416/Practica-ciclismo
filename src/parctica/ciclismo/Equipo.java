
package parctica.ciclismo;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String pais;
    private static int tiempoTotal = 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected void imprimirDatos() {
        System.out.println("Equipo: " + nombre);
        System.out.println("País: " + pais);
    }

    protected void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    protected void calcularTiempoTotal() {
        tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempoCarrera();
        }
        System.out.println("Tiempo total del equipo: " + tiempoTotal + " minutos");
    }

    protected void listarCiclistas() {
        System.out.println("Ciclistas del equipo:");
        for (Ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre());
        }
    }

    protected void buscarCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getId() == id) {
                c.imprimirDatos();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista con ID " + id + " no encontrado.");
    }
}
