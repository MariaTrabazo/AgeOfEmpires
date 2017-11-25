/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte2;

import java.util.HashMap;

/**
 *
 * @author María
 */
public class Civilizacion {
    
    private String nombre; //Griegos o Romanos, son todos humanos
    private boolean activa; //ver que civilizacion esta activa
    private HashMap<String,Edificio> edificios;
    private HashMap<String,Personaje> personajes;

    public Civilizacion(String nombre, boolean activa) {
        this.nombre = nombre;
        this.activa = activa;
        this.edificios = new HashMap<>();
        this.personajes = new HashMap<>();
    }

    public Civilizacion(HashMap<String, Edificio> edificios, HashMap<String, Personaje> personajes) {
        this.edificios = edificios;
        this.personajes = personajes;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActiva() {
        return activa;
    }

    public HashMap<String, Edificio> getEdificios() {
        return edificios;
    }

    public HashMap<String, Personaje> getPersonajes() {
        return personajes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void setEdificios(HashMap<String, Edificio> edificios) {
        this.edificios = edificios;
    }

    public void setPersonajes(HashMap<String, Personaje> personajes) {
        this.personajes = personajes;
    }
    
    
    
}
