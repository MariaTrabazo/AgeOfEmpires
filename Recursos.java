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
    
    public void setMadera(int valorMadera) {
        if(madera<0){
            System.out.println("El valor de la madera tiene que ser superior a 0");
        }
        else{
           madera = valorMadera; 
        }
    }

    public int getPiedra() {
        return piedra;
    }

    public void setPiedra(int valorPiedra) {
        if(piedra<0){
            System.out.println("El valor de la piedra tiene que ser superior a 0");
        }
        else{
           piedra = valorPiedra; 
        }
        
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int valorComida) {
        if(comida<0){
            System.out.println("El valor de la comida tiene que ser superior a 0");
        }
        else{
           comida = valorComida; 
        }
    }

       
}
