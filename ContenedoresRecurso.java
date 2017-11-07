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
public class ContenedoresRecurso {
    
    private String tipo;
    private String nombre;
    private Recursos recurso;
    private Posicion posicion;
    private int cantidadMadera;
    private int cantidadPiedra;
    private int cantidadComida;

    public ContenedoresRecurso(String tipo, Recursos recurso, Posicion posicion, int cantidadMadera, int cantidadPiedra, int cantidadComida) {
        this.tipo = tipo;
        this.recurso = recurso;
        this.posicion = posicion;
        this.cantidadMadera = cantidadMadera;
        this.cantidadPiedra = cantidadPiedra;
        this.cantidadComida = cantidadComida;
    }

    public ContenedoresRecurso() {
        this.recurso = new Recursos();
        this.posicion = new Posicion();
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Recursos getRecurso() {
        return recurso;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getCantidadMadera() {
        return cantidadMadera;
    }

    public int getCantidadPiedra() {
        return cantidadPiedra;
    }

    public int getCantidadComida() {
        return cantidadComida;
    }

    public void setTipo(String tipo) {
        if("cantera".equals(tipo)|| "arbusto".equals(tipo) ||"bosque".equals(tipo)){
            this.tipo = tipo; 
            
        }
        else{
           System.out.println("No hay contenedores de recurso de este tipo");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //FALTAN LAS COMPROBACIONES DE ESTOS SETTERS
    public void setRecurso(Recursos recurso) {
        this.recurso = recurso;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setCantidadMadera(int cantidadMadera) {
        this.cantidadMadera = cantidadMadera;
    }

    public void setCantidadPiedra(int cantidadPiedra) {
        this.cantidadPiedra = cantidadPiedra;
    }

    public void setCantidadComida(int cantidadComida) {
        this.cantidadComida = cantidadComida;
    }

    public void describirContenedorRecurso(){
        if("arbusto".equals(tipo)){
            System.out.println(posicion);
            System.out.println(recurso.getComida());
            System.out.println(cantidadComida);
        }
        else if("cantera".equals(tipo)){
            System.out.println(posicion);
            System.out.println(recurso.getPiedra());
            System.out.println(cantidadPiedra);
        }
        else if("bosque".equals(tipo)){
            System.out.println(posicion);
            System.out.println(recurso.getMadera());
            System.out.println(cantidadMadera);
        }
    }
    
    
    
    
}
