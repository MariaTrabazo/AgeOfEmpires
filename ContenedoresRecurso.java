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
    private Recursos recurso;
    private Posicion posicion;
    private int cantidadMadera;
    private int cantidadPiedra;
    private int cantidadComida;
    
    public ContenedoresRecurso(){
        
        if("cantera".equals(tipo)){
            cantidadPiedra = 100;
            recurso.setPiedra(cantidadPiedra);
        }
        if("bosque".equals(tipo)){
            cantidadMadera = 100;
            recurso.setMadera(cantidadMadera);
        }
        if("arbusto".equals(tipo)){
            cantidadComida = 100;
            recurso.setComida(cantidadComida);
        }
        posicion = new Posicion();
        
    }

    public ContenedoresRecurso(String tipo, Posicion posicion, int cantidadMadera, int cantidadPiedra, int cantidadComida) {
        this.tipo = tipo;
        if("cantera".equals(tipo)){
            this.cantidadPiedra = cantidadPiedra;
            recurso.setPiedra(cantidadPiedra);
         }   
        if("bosque".equals(tipo)){
            this.cantidadMadera = cantidadMadera;
            recurso.setMadera(cantidadMadera);
        }
        if("arbusto".equals(tipo)){
             this.cantidadComida = cantidadComida;
             recurso.setComida(cantidadComida);
        }
        this.posicion = posicion;
        
    }

    public String getTipo() {
        return tipo;
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
        if(!"cantera".equals(tipo)|| !"arbusto".equals(tipo) ||!"bosque".equals(tipo)){
            System.out.println("No hay contenedores de recurso de este tipo");
        }
        else{
           this.tipo = tipo; 
        }
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

    
    
    
    
    
}
