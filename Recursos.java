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
public class Recursos {
    private Integer madera;
    private Integer piedra;
    private Integer comida;
    
    
    public Recursos(){
        madera = 100;
        piedra = 100;
        comida = 100;
    }
    
    public Recursos(Integer valorMadera, Integer valorPiedra, Integer valorComida){
        madera = valorMadera;
        piedra = valorPiedra;
        comida = valorComida;
    }

    public Integer getMadera() {
        return madera;
    }

    public void setMadera(Integer valorMadera) {
        madera = valorMadera;
    }

    public Integer getPiedra() {
        return piedra;
    }

    public void setPiedra(Integer valorPiedra) {
        piedra = valorPiedra;
    }

    public Integer getComida() {
        return comida;
    }

    public void setComida(Integer valorComida) {
        comida = valorComida;
    }
    
    
}
