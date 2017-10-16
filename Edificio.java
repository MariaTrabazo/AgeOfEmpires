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
    }
    
    
}
