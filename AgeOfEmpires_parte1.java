/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

import ageofempires_parte2.Civilizacion;
import ageofempires_parte2.Edificio;
import ageofempires_parte2.Personaje;
import ageofempires_parte2.Posicion;
import java.util.Scanner;

/**
 *
 * @author Maria Trabazo y Cristina¨Alvarez
 */
public class AgeOfEmpires_parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mapa mapaPrueba = new Mapa(5, 5);
        
        mapaPrueba.dibujarMapa();

        boolean instruccion = true;
        Scanner scanner = new Scanner(System.in);

        while (instruccion) {
            System.out.println("$ ");
            String linea = scanner.nextLine();
            String[] comando = linea.split(" ");
            switch (comando[0]) {
                case "salir":
                    instruccion = false;
                    break;
                case "imprimir mapa":
                    mapaPrueba.dibujarMapa();
                    break;
                case "listar":
                    if (comando.length != 2) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        if ("personaje".equals(comando[1])) {
                            mapaPrueba.listarPersonajes();
                        } else if ("edificio".equals(comando[1])) {
                            mapaPrueba.listarEdificios();
                        } else if("civilizaciones".equals(comando[1])){
                            mapaPrueba.listarCivilizaciones();
                        }
                    }
                    break;
                case "describir":
                    if (comando.length != 2) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        String nombre[] = comando[1].split("-");
                        if ("Paisano".equals(nombre[0]) || "Soldado".equals(nombre[0])) {
                            Personaje p1 = null;
                            p1 = mapaPrueba.devolverPersonaje(comando[1]);
                            p1.describirPersonaje();
                        } else if ("Ciudadela".equals(nombre[0]) || "Casa".equals(nombre[0]) || "Cuartel".equals(nombre[0])) {
                            Edificio e1 = mapaPrueba.devolverEdificio(comando[1]);
                            e1.describirEdificio();
                        }
                    }
                    break;
                case "mirar":
                    if (comando.length != 2) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        String pos = comando[1];
                        Posicion posicion = new Posicion(Character.getNumericValue(pos.charAt(1)), Character.getNumericValue(pos.charAt(3)));
                        mapaPrueba.mirarCelda(posicion);

                    }
                    break;
                case "mover":
                    if (comando.length != 3) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        String nombre[] = comando[1].split("-");
                        if ("Paisano".equals(nombre[0]) || "Soldado".equals(nombre[0])) {
                            Personaje p1 = null;
                            p1 = mapaPrueba.devolverPersonaje(comando[1]);
                            Posicion posAux = p1.getPosicion();
                            //System.out.println(posAux);
                            mapaPrueba.mover(p1, comando[2]);
                            //System.out.println(p1.getPosicion());

                        }
                        mapaPrueba.dibujarMapa();

                    }
                    break;
                case "almacenar":
                    if (comando.length != 3) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        String nombre[] = comando[1].split("-");
                        if ("Paisano".equals(nombre[0])) {
                            Personaje p2 = null;
                            p2 = mapaPrueba.devolverPersonaje(comando[1]);
                            mapaPrueba.almacenarRecursos(p2, comando[2]);
                        }
                    }
                    break;

                case "recolectar":
                    if (comando.length != 3) {
                        System.out.println("Error de sintaxis.");
                    } else {
                        Personaje p4 = mapaPrueba.devolverPersonaje(comando[1]);
                        mapaPrueba.recolectarRecurso(p4, comando[2]);
                        if (p4.getCapacidadRecoleccion() <= 80) {
                            System.out.println("Unidades recolectadas: " + p4.getCapacidadRecoleccion());
                            mapaPrueba.dibujarMapa();
                        }

                    }
                    break;
                case "reparar":
                    if (comando.length != 3) {
                        System.out.println("Error de sintaxis.");
                    } else {
                        Personaje p6 = mapaPrueba.devolverPersonaje(comando[1]);
                        mapaPrueba.reparar(p6, comando[2]);
                        mapaPrueba.dibujarMapa();

                    }
                    break;
                case "crear":
                    if (comando.length != 3) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        String nombre[] = comando[1].split("-");
                        if ("Ciudadela".equals(nombre[0])) {
                            Edificio e1 = null;
                            e1 = mapaPrueba.devolverEdificio(comando[1]);
                            mapaPrueba.crearPersonaje(e1, comando[2]);
                            mapaPrueba.dibujarMapa();

                        } else if ("Cuartel".equals(nombre[0])) {
                            Edificio e1 = null;
                            e1 = mapaPrueba.devolverEdificio(comando[1]);
                            mapaPrueba.crearPersonaje(e1, comando[2]);
                            mapaPrueba.dibujarMapa();
                        }

                    }
                    break;

                case "construir":
                    if (comando.length != 4) {
                        System.out.println("El numero de parametros pasados es incorrecto");
                    } else {
                        Personaje p1 = null;
                        p1 = mapaPrueba.devolverPersonaje(comando[1]);
                        mapaPrueba.construirEdificio(p1, comando[2], comando[3]);
                        mapaPrueba.dibujarMapa();
                    }
                    break;
                    
                case "cambiar":
                    if(comando.length !=2){
                        System.out.println("El numero de parametros pasados es incorrecto");                        
                    } else{
                        Civilizacion c = null;
                        c = mapaPrueba.devolverCivilizacion(comando[1]);
                        mapaPrueba.cambiarCivilizacion(c);
                    }
                    break;
                    
                    
                case "civilizacion":
                    if(comando.length !=1){
                        System.out.println("El numero de parametros pasados es incorrecto");
                    }
                    else{
                        mapaPrueba.preguntarCivilizacionActiva();
                    }
                    break;
              case "agrupar":
                if (comando.length != 2) {
                    System.out.println("El numero de parametros pasados es incorrecto");
                } else {
                    String pos = comando[1];
                    Posicion posicion = new Posicion(Character.getNumericValue(pos.charAt(1)), Character.getNumericValue(pos.charAt(3)));
                    mapaPrueba.agrupar(posicion);
                }
                break; 
                    
               case "desagrupar":
                    if(comando.length!=2){
                       System.out.println("Error de sintaxis."); 
                    }
                    else{
                        Grupo grupoAux = mapaPrueba.devolverGrupo(comando[1]);
                        if(grupoAux!=null){
                            mapaPrueba.desagrupar(grupoAux);
                            Celda celdaAux=(mapaPrueba.devolverCelda(grupoAux.getPosicion())); 
                            HashMap <String, Grupo> listaPC =mapaPrueba.getListaGrupos();
                            Personaje pAux;
                            for (String key :grupoAux.getPersonaje().keySet()) {           
                                pAux = grupoAux.getPersonaje().get(key);
                                celdaAux.getPersonajes().put(pAux.getNombre(), pAux);
                             }     
                            grupoAux.getPersonaje().clear();
                            mapaPrueba.setListaGrupos(listaPC);
                            mapaPrueba.getListaGrupos().remove(grupoAux.getNombre());
                            mapaPrueba.dibujarMapa();  
                        }
                         
                        
                    }
                    break;

            }
        }

    }

}
