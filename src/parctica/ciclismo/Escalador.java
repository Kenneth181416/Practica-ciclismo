
package parctica.ciclismo;


public class Escalador extends Ciclista {
    private float aceleracionSubida;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float rampa) {
        super(id, nombre);
        this.aceleracionSubida = aceleracion;
        this.gradoRampa = rampa;
    }

    public float getAceleracionSubida() {
        return aceleracionSubida;
    }

    public void setAceleracionSubida(float aceleracion) {
        this.aceleracionSubida = aceleracion;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float grado) {
        this.gradoRampa = grado;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración en subida: " + aceleracionSubida + " m/s²");
        System.out.println("Grado de rampa soportada: " + gradoRampa + "°");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }
}