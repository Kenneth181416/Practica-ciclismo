/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parctica.ciclismo;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
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
