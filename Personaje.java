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
    
 public Personaje(String nombre, String tipo){
        this.posicion = new Posicion();
        this.nombre = nombre;
        this.tipo = tipo;      
        
        if("soldado".equals(tipo)){
            salud=600;
            ataque=700;
            armadura=600;
            coste = 100;
        }
        else if("paisano".equals(tipo)){
            salud=500;
            ataque=300;
            armadura=300;
            capacidadRecoleccion=500;
            coste = 50;
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
        if("soldado".equals(tipo)|| "paisano".equals(tipo)){
            this.tipo = tipo;
        }
        else{
            System.out.println("No hay personajes de este tipo");
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
        if("Soldado".equals(tipo)){
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
            System.out.println("La posicion es " + posicion);
            System.out.println("El ataque es " + ataque);
            System.out.println("La armadura es " + armadura);
            System.out.println("Los puntos de saludo son " + salud);
            System.out.println("La capadidad de recoleccion es " + capacidadRecoleccion);
        }
        else if("soldado".equals(tipo)){
            System.out.println("La posicion es " + posicion);
            System.out.println("El ataque es " + ataque);
            System.out.println("La armadura es " + armadura);
            System.out.println("Los puntos de saludo son " + salud);
        }
    }
     
     public void describirPersonaje(Personaje personaje){
        
        if ("paisano".equals(personaje.getTipo())) {
            System.out.println("La posicion es " + personaje.getPosicion());
            System.out.println("El ataque es " + personaje.getAtaque());
            System.out.println("La armadura es " + personaje.getArmadura());
            System.out.println("Los puntos de salud son " + personaje.getSalud());
            System.out.println("La capadidad de recoleccion es " + personaje.getCapacidadRecoleccion());
            System.out.println("La cantidad almacenada es " + personaje.getCantidadAlmacenada());
        } else if ("soldado".equals(personaje.getTipo())) {
            System.out.println("La posicion es " + personaje.getPosicion());
            System.out.println("El ataque es " + personaje.getAtaque());
            System.out.println("La armadura es " + personaje.getArmadura());
            System.out.println("Los puntos de salud son " + personaje.getSalud());
        }
    }
     
     public void mirarPersonaje(){
        if("paisano".equals(tipo)){
            System.out.println("Celda de tipo paisano");
            System.out.println("El ataque es " + ataque);
            System.out.println("La armadura es " + armadura);
            System.out.println("Los puntos de saludo son " + salud);
            System.out.println("La capadidad de recoleccion es " + capacidadRecoleccion);
        }
        else if("soldado".equals(tipo)){
            System.out.println("Celda de tipo soldado");
            System.out.println("El ataque es " + ataque);
            System.out.println("La armadura es " + armadura);
            System.out.println("Los puntos de saludo son " + salud);
        }
    }
    
    
}
