/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte2;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author crysa
 */
public class Grupo {
    
    private HashMap<String, Personaje> personaje;
    private String tipo;
    private Posicion posicion;
    private String nombre;
    private int salud;
    private int ataque;
    private int armadura;
    private int capacidadRecoleccion;
    private String tipoRecurso;
    private int cantidadAlmacenada;
    private Civilizacion civilizacion;

    public Grupo(String nombre, Posicion posicion) {
        personaje = new HashMap<>();
        tipo = "grupo";
        salud= 0;
        ataque = 0;
        armadura = 0;
        this.nombre = nombre;
        this.posicion = posicion;
        
        
        
    }

    public Grupo() {
        
        personaje = new HashMap<>();
        tipo = "grupo";
        salud= 0;
        ataque = 0;
        armadura = 0;
        
    }
    
    

    public HashMap<String, Personaje> getPersonaje() {
        return personaje;
    }

    public void setPersonaje(HashMap<String, Personaje> personaje) {
        Iterator<Personaje> persona = personaje.values().iterator();
            while (persona.hasNext()) {
                Personaje personas = persona.next();
                salud += personas.getSalud();
                ataque +=personas.getAtaque();
                armadura +=personas.getArmadura();
                civilizacion = personas.getCivilizacion();
            }
        this.personaje = personaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }

    public void setCapacidadRecoleccion(int capacidadRecoleccion) {
        this.capacidadRecoleccion = capacidadRecoleccion;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public int getCantidadAlmacenada() {
        return cantidadAlmacenada;
    }

    public void setCantidadAlmacenada(int cantidadAlmacenada) {
        this.cantidadAlmacenada = cantidadAlmacenada;
    }

    public Civilizacion getCivilizacion() {
        return civilizacion;
    }

    public void setCivilizacion(Civilizacion civilizacion) {
        this.civilizacion = civilizacion;
    }
    
    
     @Override
    public String toString() {
        String x=null;
        
        
            x= "Celda de tipo grupo" + "\nLos puntos de salud son " + salud + "\nLa armadura es " + armadura + "\nEl ataque es " + ataque +"\nEs de la civilizacion " + civilizacion.getNombre() + "\nPersonajes que pertenecen al grupo:\n";
            Iterator<Personaje> persona = personaje.values().iterator();
            while (persona.hasNext()) {
                Personaje personas = persona.next();
                x =  x + personas.getNombre()+ "\n";
            }
        
        return x;
}
    
}
