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
    
    private ArrayList <ArrayList<Celda>> miMapa;
    private HashMap <String, Personaje> listaPersonajes;
    private HashMap <String, Edificio> listaEdificios;
    private int contadorCiudadelas;
    private int contadorBosques;
    private int contadorArbustos;
    private int contadorCantera;
    private int contadorPersonajes;
    
    

    public Mapa(int filas, int columnas) {
        miMapa= new ArrayList<>();
        listaPersonajes= new HashMap <>();
        listaEdificios= new HashMap <>();
        
        //if(miMapa.size()!=0){
            for(int i=0; i<filas; i++){
                ArrayList <Celda> fila= new ArrayList<>();
                miMapa.add(fila);
                for(int j=0; j<columnas; j++){
                    Celda celdaAux= new Celda(i, j);
                    //celdaAux.getPosicion().setX(i);
                    //celdaAux.getPosicion().setY(j);
                    if(i==0 && j==1){
                        Edificio edificio1=new Edificio();
                        edificio1.setTipo("ciudadela");
                        edificio1.setNombre("Ciudadela-1");
                        edificio1.getCantidad().setComida(3000);
                        edificio1.getCantidad().setPiedra(3000);
                        edificio1.getCantidad().setMadera(3000);
                        edificio1.setPuntosSalud(5000);
                        Posicion p=new Posicion(i, j);
                        edificio1.setPosicion(p);
                        celdaAux.setTipo("ciudadela");
                        celdaAux.setEdificio(edificio1);
                        listaEdificios.put("Ciudadela-1", edificio1);
                    }
                    
                    else if (i==2 && j==2){
                        Personaje paisano1=new Personaje();
                        paisano1.setArmadura(300);
                        paisano1.setAtaque(100);
                        paisano1.setCapacidadRecoleccion(3000);
                        paisano1.setNombre("Paisano-1");
                        paisano1.setTipo("paisano");
                        paisano1.setSalud(1000);
                        Posicion p2=new Posicion(i, j);
                        paisano1.setPosicion(p2);
                        celdaAux.setTipo("paisano");
                        celdaAux.setPersonaje(paisano1);
                        listaPersonajes.put("Paisano-1", paisano1);
                    }
                    
                    else if(i==1 && j==4){
                        ContenedoresRecurso contenedor1= new ContenedoresRecurso();
                        contenedor1.setTipo("arbusto");
                        contenedor1.setNombre("Arbusto");
                        contenedor1.getRecurso().setComida(5000);
                        Posicion p3= new Posicion(i, j);
                        contenedor1.setPosicion(p3);
                        celdaAux.setTipo("arbusto");
                        celdaAux.setContenedor(contenedor1);//va a haber que añadir un contador 
                    }
                    else if(i==3 && j==4){
                        ContenedoresRecurso contenedor2= new ContenedoresRecurso();
                        contenedor2.setTipo("bosque");
                        contenedor2.setNombre("Bosque");
                        contenedor2.getRecurso().setComida(5000);
                        Posicion p4= new Posicion(i, j);
                        contenedor2.setPosicion(p4);
                        celdaAux.setTipo("bosque");
                        celdaAux.setContenedor(contenedor2);//va a haber que añadir un contador 
                    }
                    else if(i==0 && j==3){
                        ContenedoresRecurso contenedor3= new ContenedoresRecurso();
                        contenedor3.setTipo("cantera");
                        contenedor3.setNombre("Cantera");
                        contenedor3.getRecurso().setComida(5000);
                        Posicion p4= new Posicion(i, j);
                        contenedor3.setPosicion(p4);
                        celdaAux.setTipo("cantera");
                        celdaAux.setContenedor(contenedor3);//va a haber que añadir un contador 
                    }
                    
                    fila.add(celdaAux);
                }
            }
            
        //}
        
    }

    public ArrayList<ArrayList<Celda>> getMiMapa() {
        return miMapa;
    }

    public HashMap<String, Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public HashMap<String, Edificio> getListaEdificios() {
        return listaEdificios;
    }

    public int getContadorCiudadelas() {
        return contadorCiudadelas;
    }

    public int getContadorPersonajes() {
        return contadorPersonajes;
    }

    public void setMiMapa(ArrayList<ArrayList<Celda>> miMapa) {
        this.miMapa = miMapa;
    }

    public void setListaPersonajes(HashMap<String, Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    public void setListaEdificios(HashMap<String, Edificio> listaEdificios) {
        this.listaEdificios = listaEdificios;
    }

    public void setContadorCiudadelas(int contadorCiudadelas) {
        this.contadorCiudadelas = contadorCiudadelas;
    }
    
    public void setContadorPersonajes(int contadorPersonajes) {
        this.contadorPersonajes = contadorPersonajes;
    }
    
    
    public void dibujarMapa(){
        
        String devolverMapa="\n";
        int columna=0, fila;
      
        for (fila=0; fila<miMapa.size(); fila++){
            for (columna=0; columna<miMapa.get(0).size(); columna++){
                Celda celdaAuxiliar= miMapa.get(fila).get(columna);
                switch(celdaAuxiliar.getTipo()){
                    case "pradera":
                        if(celdaAuxiliar.getPersonaje()!=null){
                            if("paisano".equals(celdaAuxiliar.getTipo())){
                                String[] personaje=celdaAuxiliar.getPersonaje().getNombre().split("-");
                                devolverMapa+="\t" + "P"+personaje[1];
                            }
                            else if("soldado".equals(celdaAuxiliar.getTipo())){
                                String[] personaje=celdaAuxiliar.getPersonaje().getNombre().split("-");
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
                        String[] casas=celdaAuxiliar.getEdificio().getTipo().split("-");
                        devolverMapa+="\t" + "Cas"+casas[1];
                        break;
                    case "ciudadela":
                        String[] ciudadelas=celdaAuxiliar.getEdificio().getTipo().split("-");
                        devolverMapa+="\t" + "Ciu"+ciudadelas[1];
                        break;
                    case "cuartel":
                        String[] cuarteles=celdaAuxiliar.getEdificio().getTipo().split("-");
                        devolverMapa+="\t" + "Cuar"+cuarteles[1];
                        break;
                }
                
        }
        devolverMapa+="\n";
        
      }
      System.out.println(devolverMapa);
    }
        
    public void listarPersonajes(){
        Personaje personajeResultado=null;
        for(String key: listaPersonajes.keySet()){
            personajeResultado=listaPersonajes.get(key);
            System.out.println(personajeResultado.getNombre() + " " + personajeResultado.getPosicion());
            
        }
        
    }
    
    public void listarEdificios(){
        Edificio edificioResultado=null;
         for(String key: listaEdificios.keySet()){
            edificioResultado=listaEdificios.get(key);
            System.out.println(edificioResultado.getNombre() + " " + edificioResultado.getPosicion());
            
        }
        
    }
    
    public void describirCelda (String nombre){
        Celda celdaAuxiliar=new Celda();
        
        for(int i=0; i<miMapa.size(); i++){
            for(int j=0; j<miMapa.get(0).size(); j++){
                celdaAuxiliar=miMapa.get(i).get(j);
                if(celdaAuxiliar.getContenedor().getNombre().equals(parseInt(nombre))){
                   
                   
                }
                else if(celdaAuxiliar.getEdificio().getNombre().equals(nombre)){
                    
                }
                else if(celdaAuxiliar.getPersonaje().equals(nombre)){
                    
                }
            }
        }
    }
        
    }
    
    
