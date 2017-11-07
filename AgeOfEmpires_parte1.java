/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte1;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class AgeOfEmpires_parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Mapa mapaPrueba= new Mapa(5, 5);
        boolean instruccion= true;
        Scanner scanner = new Scanner(System.in);
        
        while(instruccion){
            System.out.println("$ ");
            String linea=scanner.nextLine();
            String[] comando = linea.split(" ");
            switch(comando[0]){
                case "salir":
                    instruccion=false;
                    break;
                case "dibujar":
                    mapaPrueba.dibujarMapa();
                    break;
                case "listar":
                    if(comando.length!=2){
                        System.out.println("El numero de parametros pasados es incorrecto");
                    }
                    else{
                        if("personaje".equals(comando[1])){
                          mapaPrueba.listarPersonajes();
                        }
                        else if("edificio".equals(comando[1])){
                            mapaPrueba.listarEdificios();
                        }
                    }
                    break;
                case "describir":
                    break;
                case "mirar": 
                    break;
            }
        }
        
    }
    
}
