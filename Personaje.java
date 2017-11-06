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
public class Personaje {
    
    private String tipo;
    private int salud;
    private int ataque;
    private int armadura;
    private int capacidadRecoleccion;
    private String tipoRecurso;
    private Posicion posicion;
    private String nombre;

    public Personaje(String tipo, int salud, int ataque, int armadura, int capacidadRecoleccion,  String tipoRecurso, Posicion posicion, String nombre ) {
        this.tipo = tipo;
        this.salud = salud;
        this.ataque = ataque;
        this.armadura = armadura;
        this.capacidadRecoleccion= capacidadRecoleccion;
        this.posicion=posicion;
        this.tipoRecurso=tipoRecurso;
        this.nombre=nombre;
    }
    
    public Personaje(){
        if("soldado".equals(tipo)){
            salud=200;
            ataque=600;
            armadura=400;
        }
        else if("paisano".equals(tipo)){
            salud=200;
            ataque=300;
            armadura=200;
            capacidadRecoleccion=300;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getSalud() {
        return salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        if(!"soldado".equals(tipo)|| !"paisano".equals(tipo)){
            System.out.println("No hay personajes de este tipo");
        }
        else{
           this.tipo = tipo; 
        }
        
    }

    public void setSalud(int salud) {
        if(salud<0){
            System.out.println("La salud ha de ser superior a 0");
        }
        else{
            this.salud = salud;
        }
        
    }

    public void setAtaque(int ataque) {
        if(ataque<0){
            System.out.println("El ataque ha de ser superior a 0");
        }
        else{
            this.ataque = ataque;
        }
    }

    public void setArmadura(int armadura) {
        if(armadura<0){
            System.out.println("La aramdura ha de ser superior a 0");
        }
        else{
            this.armadura = armadura;
        }
    }

    public void setCapacidadRecoleccion(int capacidadRecoleccion) {
        if("soldado".equals(tipo)){
            this.capacidadRecoleccion=0;
        }
        else{
            if(capacidadRecoleccion<0){
                System.out.println("La capacidad de recoleccion tiene que ser superior a 0");
            }
            else{
                this.capacidadRecoleccion = capacidadRecoleccion;
            }
        }
        
    }

    public void setTipoRecurso(String tipoRecurso) {
        if(!"madera".equals(tipoRecurso) || !"piedra".equals(tipoRecurso) || !"comida".equals(tipoRecurso)){
            System.out.println("No existe este recurso");
        }
        else{
            this.tipoRecurso = tipoRecurso;
        }
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void describirPersonaje(){
        if("paisano".equals(tipo)){
            System.out.println(posicion);
            System.out.println(ataque);
            System.out.println(armadura);
            System.out.println(salud);
            System.out.println(capacidadRecoleccion);
        }
        else if("soldado".equals(tipo)){
            System.out.println(posicion);
            System.out.println(ataque);
            System.out.println(armadura);
            System.out.println(salud);
        }
    }
    
    
    
}
