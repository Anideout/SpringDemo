package duoc.database.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {
    @Id
    private String patente;
    private String marca;
    private int anio;
    
    
    //constructor
    public Vehiculo() {
        this.patente = " ";
        this.marca = " ";
        this.anio = 0;
    }

    /**
     * @return String return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return int return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }



}
