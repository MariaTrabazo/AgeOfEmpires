/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte1;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class Mapa {
    
    ArrayList <ArrayList<Celda>> miMapa= new ArrayList<>();

    public Mapa(int filas, int columnas) {
        
        if(miMapa.size()!=0){
            for(int i=0; i<filas; i++){
                ArrayList <Celda> fila= new ArrayList<>();
                miMapa.add(fila);
                for(int j=0; j<columnas; j++){
                    Celda celdaAux= new Celda();
                    celdaAux.getPosicion().setX(i);
                    celdaAux.getPosicion().setY(j);
                    if(i==0 && j==1){//HAY QUE IR AÑADIENDO COSAS EN POSICIONES ALEATORIAS
                        
                    }
                    //fila.add(null);
                }
            }
        }
        
    }
    
    public void dibujarMapa(Mapa mapa){
        
        String devolverMapa="\n";
        int columna=0, fila;
      
        for (fila=0; fila<miMapa.size(); fila++){
            for (columna=0; columna<miMapa.get(0).size(); columna++){
                Celda celdaAuxiliar;
                celdaAuxiliar=miMapa.get(fila).get(columna);
                switch(celdaAuxiliar.getTipo()){
                    case "pradera":
                        if(celdaAuxiliar.getPersonaje()!=null){
                            if("paisano".equals(celdaAuxiliar.getTipo())){
                                String[] personaje=celdaAuxiliar.getPersonaje().getNombre().split(".");
                                devolverMapa+="\t" + "P"+personaje[1];
                            }
                            else if("soldado".equals(celdaAuxiliar.getTipo())){
                                String[] personaje=celdaAuxiliar.getPersonaje().getNombre().split(".");
                                devolverMapa+="\t" + "S"+personaje[1];
                            }
                        }
                        else{
                            devolverMapa+="\t" + "@";
                        }
                        break;
                    case "arbusto":
                        devolverMapa+="\t" + "A";
                        break;
                    case "cantera":
                        devolverMapa+="\t" + "Can";
                        break;
                    case "bosque":
                        devolverMapa+="\t" + "B";
                        break;
                    case "casa":
                        String[] casas=celdaAuxiliar.getEdificio().getTipo().split(".");
                        devolverMapa+="\t" + "Cas"+casas[1];
                        break;
                    case "ciudadela":
                        String[] ciudadelas=celdaAuxiliar.getEdificio().getTipo().split(".");
                        devolverMapa+="\t" + "Ciu"+ciudadelas[1];
                        break;
                    case "cuartel":
                        String[] cuarteles=celdaAuxiliar.getEdificio().getTipo().split(".");
                        devolverMapa+="\t" + "Cuar"+cuarteles[1];
                        break;
                }
                
        }
        devolverMapa+="\n";
        
      }
      System.out.println(devolverMapa);
    }
        
        
    }
    
    
