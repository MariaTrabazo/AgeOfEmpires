/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte1;

/**
 *
 * @author Cristina Alvarez Vales y María Trabazo Segura
 */
public class Edificio {

   private String tipo;
    private String nombre;
    private int puntosSalud;
    private int costeReparacion;
    private Recursos recurso;
    private int capacidad;//capacidad alojamiento
    private Posicion posicion;
    //private Recursos cantidad;//cantidad recurso de cada tipo necesario para reconstruirlo 
                             //o para crear un nuevo personaje

    /*public Edificio() {
        if ("casa".equals(tipo)) {
            puntosSalud = 400;
            costeReparacion = 600;
//            recurso.setMadera(100);
//            recurso.setPiedra(200);
//           capacidad = 20;
        } else if ("cuartel".equals(tipo)) {
            puntosSalud = 500;
            costeReparacion = 700;
//            recurso.setMadera(150);
//            recurso.setPiedra(250);
        } else if ("ciudadela".equals(tipo)) {
            puntosSalud = 600;
            costeReparacion = 700;
//            recurso.setMadera(200);
//            recurso.setPiedra(300);
            capacidad = 10;
        }
    }

    public Edificio(String tipo, int puntosSalud, int costeReparacion, Recursos recurso, int capacidad) {
        this.tipo = tipo;
        this.puntosSalud = puntosSalud;
        this.costeReparacion = costeReparacion;
        this.recurso = recurso;
        this.capacidad = capacidad;
    }*/
    public Edificio() {
        recurso= new Recursos();
        posicion= new Posicion();
    }
    public Edificio(String nombre, String tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
        recurso= new Recursos();
        posicion= new Posicion();
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public int getCosteReparacion() {
        return costeReparacion;
    }

    public Recursos getRecurso() {
        return recurso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Recursos getCantidad() {
        return recurso;
    }

    public void setTipo(String tipo) {
        if ("casa".equals(tipo) || "ciudadela".equals(tipo) || "cuartel".equals(tipo)) {
            this.tipo = tipo;
            
        } else {
            System.out.println("No hay edificios de este tipo");
        }

    }

    public void setPuntosSalud(int puntosSalud) {
        if (puntosSalud == 0) {
            System.out.println("No se puede reconstruir el edificio");
        } else {
            this.puntosSalud = puntosSalud;
        }

    }

    public void setCosteReparacion(int costeReparacion) {
        this.costeReparacion = costeReparacion;
    }

    public void setRecurso(Recursos recurso) {
        this.recurso = recurso;

    }

    public void setCapacidad(int capacidad) {
        if("casa".equals(tipo)){
            if(capacidad > 10){
                System.out.println("No se pueden crear más paisanos, no hay espacio en la ciudadela");
            }
            else{
                this.capacidad = capacidad;
            }
        }
        else if("cuartel".equals(tipo)){
            if(capacidad > 10){
                System.out.println("No se pueden crear más soldados, no hay espacio en la ciudadela");
            }
            else{
                this.capacidad = capacidad;
            }
        }
        
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setCantidad(Recursos recurso) {
        this.recurso = recurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void describirEdificio(){
        if("ciudadela".equals(tipo)){
            System.out.println(posicion);
            System.out.println(recurso.getComida() + recurso.getMadera() + recurso.getPiedra());
            System.out.println(puntosSalud);
        }
        else if("casa".equals(tipo)){
            System.out.println(posicion);
            System.out.println(puntosSalud);
            System.out.println(capacidad);
        }
        else if("cuartel".equals(tipo)){
            System.out.println(posicion);
            System.out.println(puntosSalud);
        }
    }
}
