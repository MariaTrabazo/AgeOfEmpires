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
    public Edificio(String nombre, String tipo) {
       
        this.posicion= new Posicion();
        this.nombre=nombre;
        this.tipo=tipo;
      
        
        if ("casa".equals(tipo)) {
            puntosSalud = 400;
            costeReparacion = 1800;
            recurso = new Recursos(1000, 800, null);
            capacidad = 10;
        } else if ("cuartel".equals(tipo)) {
            puntosSalud = 500;
            costeReparacion = 2000;
            recurso = new Recursos(1100, 900, null);
        } else if ("ciudadela".equals(tipo)) {
            puntosSalud = 5000;
            costeReparacion = 700;
            recurso = new Recursos(3000,3000,3000);
        }
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
            if(capacidad > 10 || capacidad <= 0){
                System.out.println("No se pueden crear más paisanos, no hay espacio en la ciudadela");
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
            System.out.println("La posicion es " + posicion);
            System.out.println("La cantidad de comida es \n" + recurso.getComida() + "La cantidad de madera es \n" + recurso.getMadera() + "La cantidad de piedra es " + recurso.getPiedra());
            System.out.println("Los puntos de salud son " + puntosSalud);
        }
        else if("casa".equals(tipo)){
            System.out.println("La posicion es " + posicion);
            System.out.println(puntosSalud);
            System.out.println("Los puntos de salud son " + puntosSalud);
        }
        else if("cuartel".equals(tipo)){
            System.out.println("La posicion es " + posicion);
            System.out.println("Los puntos de salud son " + puntosSalud);
        }
    }
   
       public void describirEdificio(Edificio edificio){
        if("ciudadela".equals(edificio.getTipo())){
            System.out.println("La posicion es " + edificio.getPosicion());
            System.out.println("La cantidad de comida es " + edificio.getRecurso().getComida() + "\nLa cantidad de madera es " + edificio.getRecurso().getMadera() + "\nLa cantidad de piedra es " + edificio.getRecurso().getPiedra());
            System.out.println("Los puntos de salud son " + edificio.getPuntosSalud());
        }
        else if("casa".equals(edificio.getTipo())){
            System.out.println("La posicion es " + edificio.getPosicion());
            System.out.println("Los puntos de salud son " + edificio.getPuntosSalud());
        }
        else if("cuartel".equals(edificio.getTipo())){
            System.out.println("La posicion es " + edificio.getPosicion());
            System.out.println("Los puntos de salud son " + edificio.getPuntosSalud());
        }
   
   public void mirarEdificio(){
          
        if("ciudadela".equals(tipo)){
            System.out.println("La celda es de tipo ciudadela");
            System.out.println("La cantidad de comida es " + recurso.getComida() + "\nLa cantidad de madera es " + recurso.getMadera() + "\nLa cantidad de piedra es " + recurso.getPiedra());
            System.out.println("Los puntos de salud son " + puntosSalud);
        }
        else if("casa".equals(tipo)){
            System.out.println("La celda es de tipo casa");
            System.out.println("Los puntos de salud son " + puntosSalud);
        }
        else if("cuartel".equals(tipo)){
            System.out.println("La celda es de tipo cuartel");
            System.out.println("Los puntos de salud son " + puntosSalud);
        }
    }
}
