/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte1;

/**
 *
 * @author crysa
 */
public class Edificio {
    
     private String ciudadela;
    private String casa;
    private String cuartel;
    private int puntosSalud;
    private int costeReparacion;
    private Recursos recurso;
    
    public Edificio(){
        ciudadela = "Ciudadela";
        casa = "Casa";
        cuartel = "Cuartel";
        puntosSalud=100;
    }
    
    public Edificio(String valorCiudadela, String valorCasa, String valorCuartel, int puntosSalud, int costeReparacion){
        ciudadela = valorCiudadela;
        casa = valorCasa;
        cuartel = valorCuartel;
        this.puntosSalud=puntosSalud;
        this.costeReparacion=costeReparacion;
    }

    public String getCiudadela() {
        return ciudadela;
    }

    public void setCiudadela(String valorCiudadela) {
        ciudadela = valorCiudadela;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String valorCasa) {
        casa = valorCasa;
    }

    public String getCuartel() {
        return cuartel;
    }

    public void setCuartel(String valorCuartel) {
        cuartel = valorCuartel;
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

    public void setPuntosSalud(int puntosSalud) {
        if(puntosSalud==0){
            System.out.println("No se puede reconstruir el edificio");
        }
        else{
            this.puntosSalud = puntosSalud;
        }
        
    }

    public void setCosteReparacion(int costeReparacion) {
        this.costeReparacion = costeReparacion;
    }

    public void setRecurso(Recursos recurso) {
        this.recurso = recurso;
    }
    
   /* private String ciudadela;
    private String casa;
    private String cuartel;
    
    
    public Edificio(){
        ciudadela = "Ciudadela";
        casa = "Casa";
        cuartel = "Cuartel";
    }
    
    public Edificio(String valorCiudadela, String valorCasa, String valorCuartel){
        ciudadela = valorCiudadela;
        casa = valorCasa;
        cuartel = valorCuartel;
    }

    public String getCiudadela() {
        return ciudadela;
    }

    public void setCiudadela(String valorCiudadela) {
        ciudadela = valorCiudadela;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String valorCasa) {
        casa = valorCasa;
    }

    public String getCuartel() {
        return cuartel;
    }

    public void setCuartel(String valorCuartel) {
        cuartel = valorCuartel;
    }*/
    
    
}
