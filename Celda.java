/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte1;

/**
 *
 * @author María
 */
public class Celda {
    
    private Posicion posicion;
    private ContenedoresRecurso contenedor;
    private Edificio edificio;
    private Personaje personaje;
    private String tipo;

    public Celda() {
        this.posicion = posicion;
        this.contenedor = contenedor;
        this.edificio = edificio;
        this.tipo = "pradera";
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public ContenedoresRecurso getContenedor() {
        return contenedor;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setContenedor(ContenedoresRecurso contenedor) {
        this.contenedor = contenedor;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void setTipo(String tipo) {
        if("cuartel".equals(tipo) || "ciudadela".equals(tipo) || "casa".equals(tipo)){
            this.tipo = tipo;
        }
        if("pradera".equals(tipo) || "bosque".equals(tipo) || "cantera".equals(tipo) || "arbusto".equals(tipo)){
            this.tipo = tipo;
        }
        
    }
    
    
    
    
    
    
}
