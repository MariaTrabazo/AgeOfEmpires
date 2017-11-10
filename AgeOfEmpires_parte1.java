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
                    if(comando.length!=2){
                        System.out.println("El numero de parametros pasados es incorrecto");
                    }
                    else{
                        String nombre[]=comando[1].split("-");
                        if("Paisano".equals(nombre[0]) || "Soldado".equals(nombre[0])){
                            Personaje p1=null;
                            p1=mapaPrueba.devolverPersonaje(comando[1]);
                            p1.describirPersonaje();
                        }
                        else if("Ciudadela".equals(nombre[0]) || "Casa".equals(nombre[0]) || "Cuartel".equals(nombre[0])){
                            Edificio e1=null;
                            e1=mapaPrueba.devolverEdificio(comando[1]);
                            e1.describirEdificio();
                        }
                    }
                    break;
                case "mirar": 
                    if(comando.length!=3){
                        System.out.println("El numero de parametros pasados es incorrecto");
                    }
                    else{
                        String nombre[]=comando[1].split("-");
                        if("Paisano".equals(nombre[0]) || "Soldado".equals(nombre[0])){
                            Personaje p1=null;
                            p1=mapaPrueba.devolverPersonaje(comando[1]);
                            Posicion posAux=p1.getPosicion();
                            System.out.println(posAux);
                            mapaPrueba.mover(p1, comando[2]);
                            System.out.println(p1.getPosicion());
                            if(p1.getPosicion()!=posAux){
                                (mapaPrueba.devolverCelda(p1.getPosicion())).setPersonaje(p1);
                                mapaPrueba.devolverCelda(posAux).setPersonaje(null);
                                 
                            }
                        }
                        mapaPrueba.dibujarMapa();
                    break;
            }
        }
        
    }
    
}
