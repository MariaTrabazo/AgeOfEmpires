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
    
   private ArrayList<ArrayList<Celda>> miMapa;
    private HashMap<String, Personaje> listaPersonajes;
    private HashMap<String, Edificio> listaEdificios;
    private HashMap<String, ContenedoresRecurso> listaContenedores;
    private int contadorCiudadelas;
    private int contadorBosques;
    private int contadorArbustos;
    private int contadorCanteras;
    private int contadorPaisanos = 1;
    private int contadorSoldados = 0;
    private int contadorCasas = 0;
    private int contadorCuarteles = 0;

    public Mapa(int filas, int columnas) {
        miMapa = new ArrayList<>();
        listaPersonajes = new HashMap<>();
        listaEdificios = new HashMap<>();
        listaContenedores = new HashMap<>();

        for (int i = 0; i < filas; i++) {
            ArrayList<Celda> fila = new ArrayList<>();
            miMapa.add(fila);
            for (int j = 0; j < columnas; j++) {
                Celda celdaAux = new Celda(i, j);
                if (i == 0 && j == 1) {
                    Edificio edificio1 = new Edificio("Ciudadela-1", "ciudadela");

                    Posicion p = new Posicion(i, j);
                    edificio1.setPosicion(p);
                    celdaAux.setTipo("ciudadela");
                    celdaAux.setEdificio(edificio1);
                    listaEdificios.put("Ciudadela-1", edificio1);
                } else if (i == 2 && j == 2) {
                    celdaAux.setTipo("pradera");
                    Personaje personaje1 = new Personaje("Paisano-1", "paisano");
                    Posicion p2 = new Posicion(i, j);
                    personaje1.setPosicion(p2);
                    celdaAux.setPersonaje(personaje1);
                    listaPersonajes.put("Paisano-1", personaje1);
                } else if (i == 1 && j == 4) {
                    ContenedoresRecurso contenedor1 = new ContenedoresRecurso("Arbusto-1", "arbusto");
                    Posicion p3 = new Posicion(i, j);
                    contenedor1.setPosicion(p3);
                    celdaAux.setTipo("arbusto");
                    celdaAux.setContenedor(contenedor1);
                    contadorArbustos++;
                    listaContenedores.put("Arbusto-1", contenedor1);
                } else if (i == 3 && j == 2) {
                    ContenedoresRecurso contenedor2 = new ContenedoresRecurso("Bosque-1", "bosque");
                    Posicion p4 = new Posicion(i, j);
                    contenedor2.setPosicion(p4);
                    celdaAux.setTipo("bosque");
                    celdaAux.setContenedor(contenedor2);
                    listaContenedores.put("Bosque-1", contenedor2);
                    contadorBosques++;
                } else if (i == 0 && j == 3) {
                    ContenedoresRecurso contenedor3 = new ContenedoresRecurso("Cantera-1", "cantera");
                    Posicion p4 = new Posicion(i, j);
                    contenedor3.setPosicion(p4);
                    celdaAux.setTipo("cantera");
                    celdaAux.setContenedor(contenedor3);
                    contadorCanteras++;
                    listaContenedores.put("Cantera-1", contenedor3);
                } else if (i == 0 && j == 0) {
                    Edificio edificio1 = new Edificio("Cuartel-1", "cuartel");
                    Posicion p = new Posicion(i, j);
                    edificio1.setPosicion(p);
                    celdaAux.setTipo("cuartel");
                    celdaAux.setEdificio(edificio1);
                    contadorCuarteles++;
                    listaEdificios.put("Cuartel-1", edificio1);
                } else if (i == 4 && j == 4) {
                    Edificio edificio2 = new Edificio("Casa-1", "casa");
                    Posicion p = new Posicion(i, j);
                    edificio2.setPosicion(p);
                    celdaAux.setTipo("casa");
                    celdaAux.setEdificio(edificio2);
                    contadorCasas++;
                    listaEdificios.put("Casa-1", edificio2);
                }

                fila.add(celdaAux);
            }
        }

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

    public HashMap<String, ContenedoresRecurso> getListaContendores() {
        return listaContenedores;
    }

    public int getContadorCiudadelas() {
        return contadorCiudadelas;
    }

    public int getContadorPaisanos() {
        return contadorPaisanos;
    }

    public int getContadorSoldados() {
        return contadorSoldados;
    }

    public int getContadorCasas() {
        return contadorCasas;
    }

    public int getContadorCuarteles() {
        return contadorCuarteles;
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

    public void setContadorPaisanos(int contadorPaisanos) {
        this.contadorPaisanos = contadorPaisanos;
    }

    public void setContadorSoldados(int contadorSoldados) {
        this.contadorSoldados = contadorSoldados;
    }

    public void setContadorCasas(int contadorCasas) {
        this.contadorCasas = contadorCasas;
    }

    public void setContadorCuarteles(int contadorCuarteles) {
        this.contadorCuarteles = contadorCuarteles;
    }

    public void dibujarMapa() {

        String devolverMapa = "\n";
        int columna = 0, fila;

        for (fila = 0; fila < miMapa.size(); fila++) {
            for (columna = 0; columna < miMapa.get(0).size(); columna++) {
                Celda celdaAuxiliar = miMapa.get(fila).get(columna);
                switch (celdaAuxiliar.getTipo()) {
                    case "pradera":
                        if (celdaAuxiliar.getPersonaje() != null) {
                            if (celdaAuxiliar.getPersonaje().getTipo().equals("paisano")) {
                                String[] personaje = celdaAuxiliar.getPersonaje().getNombre().split("-");
                                devolverMapa += "\t" + "P" + personaje[1];
                            } else if (celdaAuxiliar.getPersonaje().getTipo().equals("soldado")) {
                                String[] personaje = celdaAuxiliar.getPersonaje().getNombre().split("-");
                                devolverMapa += "\t" + "S" + personaje[1];
                            }
                        } else {
                            devolverMapa += "\t" + "@";
                        }
                        break;
                    case "arbusto":
                        String[] arbustos = celdaAuxiliar.getContenedor().getNombre().split("-");
                        devolverMapa += "\t" + "A" + arbustos[1];
                        break;
                    case "cantera":
                        String[] canteras = celdaAuxiliar.getContenedor().getNombre().split("-");
                        devolverMapa += "\t" + "Can" + canteras[1];
                        break;
                    case "bosque":
                        String[] bosques = celdaAuxiliar.getContenedor().getNombre().split("-");
                        devolverMapa += "\t" + "B" + bosques[1];
                        break;
                    case "casa":
                        String[] casas = celdaAuxiliar.getEdificio().getNombre().split("-");
                        devolverMapa += "\t" + "Cas" + casas[1];
                        break;
                    case "ciudadela":
                        String[] ciudadelas = celdaAuxiliar.getEdificio().getNombre().split("-");
                        devolverMapa += "\t" + "Ciu" + ciudadelas[1];
                        break;
                    case "cuartel":
                        String[] cuarteles = celdaAuxiliar.getEdificio().getNombre().split("-");
                        devolverMapa += "\t" + "Cuar" + cuarteles[1];
                        break;
                }

            }
            devolverMapa += "\n";

        }
        System.out.println(devolverMapa);
    }

    public void listarPersonajes() {
        Personaje personajeResultado = null;
        for (String key : listaPersonajes.keySet()) {
            personajeResultado = listaPersonajes.get(key);
            System.out.println(personajeResultado.getNombre() + " " + personajeResultado.getPosicion());

        }

    }

    public void listarEdificios() {
        Edificio edificioResultado = null;
        for (String key : listaEdificios.keySet()) {
            edificioResultado = listaEdificios.get(key);
            System.out.println(edificioResultado.getNombre() + " " + edificioResultado.getPosicion());

        }

    }

    public void listarContenedores() {
        ContenedoresRecurso contenedorResultado = null;
        for (String key : listaContenedores.keySet()) {
            contenedorResultado = listaContenedores.get(key);
            System.out.println(contenedorResultado.getNombre() + " " + contenedorResultado.getPosicion());

        }

    }

    public Personaje devolverPersonaje(String nombre) {
        Personaje personajeAux = null;
        for (String key : listaPersonajes.keySet()) {
            personajeAux = listaPersonajes.get(key);
            if (personajeAux.getNombre().equals(nombre)) {
                return personajeAux;
            }
        }
        return null;
    }

    public Edificio devolverEdificio(String nombre) {
        Edificio edificioAux = null;
        for (String key : listaEdificios.keySet()) {
            edificioAux = listaEdificios.get(key);
            if (edificioAux.getNombre().equals(nombre)) {
                return edificioAux;
            }
        }
        return null;
    }

    public ContenedoresRecurso devolverContenedor(String nombre) {
        ContenedoresRecurso contenedorAux = null;
        for (String key : listaContenedores.keySet()) {
            contenedorAux = listaContenedores.get(key);
            if (contenedorAux.getNombre().equals(nombre)) {
                return contenedorAux;
            }
        }
        return null;
    }
    
   

    public void mirarCelda(Posicion posicion) {

        int fila, columna;
        for (fila = 0; fila < miMapa.size(); fila++) {
            for (columna = 0; columna < miMapa.get(0).size(); columna++) {
                Celda celdaAuxiliar = miMapa.get(fila).get(columna);

                if (posicion.equals(celdaAuxiliar.getPosicion())) {
                    celdaAuxiliar.describirCelda();
                }
            }
        }

    }
    
    public void mover(Personaje personaje, String direccion){
        Celda celdaAdyacente=devolverCeldaAdyacente(personaje.getPosicion(), direccion);
        if(celdaAdyacente!=null){
            if("pradera".equals(celdaAdyacente.getTipo()) && celdaAdyacente.getPersonaje()==null){
                miMapa.get(personaje.getPosicion().getX()).get(personaje.getPosicion().getY()).setPersonaje(null);
                personaje.setPosicion(celdaAdyacente.getPosicion());
                celdaAdyacente.setPersonaje(personaje);
                System.out.println("El " +personaje.getNombre()+ " se ha movido a la posicion "+ personaje.getPosicion());
            }
            else if(!"pradera".equals(celdaAdyacente.getTipo())){
                System.out.println("Solo te puedes mover por las praderas");
            }
        }
        else{
            System.out.println("No existe el personaje");
        }
        
    }
    
   public Celda devolverCeldaAdyacente(Posicion posicion, String direccion){
        Celda celdaAdyacente;
        
        for(int i=0; i<miMapa.size(); i++){
            for(int j=0; j<miMapa.get(0).size(); j++){
                if( i==posicion.getX() && j==posicion.getY() && "NORTE".equals(direccion)){
                    if(j!=4){
                        celdaAdyacente=miMapa.get(i-1).get(j);
                        return celdaAdyacente;
                    }
                    else{
                        System.out.println("Estas fuera de los limites");
                    }
                }
                
                
                if("SUR".equals(direccion) && i==posicion.getX() && j==posicion.getY()){
                    if(j!=4){
                        celdaAdyacente=miMapa.get(i+1).get(j);
                        return celdaAdyacente;
                    }
                    else{
                        System.out.println("Estas fuera de los limites");
                    }
                }
                
                
                if("ESTE".equals(direccion) && i==posicion.getX() && j==posicion.getY()){
                    if(i!=0){
                        celdaAdyacente=miMapa.get(i).get(j+1);
                        return celdaAdyacente;
                    }
                    else{
                        System.out.println("Estas fuera de los limites");
                    }
                }
                
                
                if("OESTE".equals(direccion) && i==posicion.getX() && j==posicion.getY()){
                    if(i!=0){
                        celdaAdyacente=miMapa.get(i).get(j-1);
                        return celdaAdyacente;
                    }
                    else{
                        System.out.println("Estas fuera de los limites");
                    }
                }
            }
        }
        
        return null; 
    }
    
    public Celda devolverCelda (Posicion posicion){
        Celda celdaAux=new Celda();
        
        for(int i=0; i<miMapa.size(); i++){
            for(int j=0; j<miMapa.get(0).size(); j++){
                celdaAux=miMapa.get(i).get(j);
            }
        }
        return celdaAux;
    }
    
        public void crearPersonaje(Edificio edificio, String tipo) {

        if ("paisano".equals(tipo)) {

            String paisano = "Paisano-";
            String numero = "";
            numero = Integer.toString(contadorPaisanos + 1);
            String total = paisano + numero;

            Personaje paisanoNuevo = new Personaje(total, tipo);
            Celda celdaAdyacente = devolverCeldaAdyacente(edificio.getPosicion(), "SUR");
            if ("pradera".equals(celdaAdyacente.getTipo())) {
                System.out.println("Coste de creación: " + paisanoNuevo.getCoste() + " unidades de comida");

                int comida = edificio.getRecurso().getComida();
                if (comida > 50) {

                    paisanoNuevo.setPosicion(celdaAdyacente.getPosicion());
                    celdaAdyacente.setPersonaje(paisanoNuevo);
                    edificio.getRecurso().setComida(comida - 50);
                    Edificio casa = devolverEdificio("Casa-1");
                    int cap = casa.getCapacidad();
                    edificio.setCapacidad(cap - 1);
                    System.out.println("Te quedan " + edificio.getCapacidad() + " unidades de capacidad de alojamiento");

                    System.out.println("El " + paisanoNuevo.getNombre() + " se ha encuentra a la posicion " + paisanoNuevo.getPosicion());
                    listaPersonajes.put(paisanoNuevo.getNombre(), paisanoNuevo);
                    contadorPaisanos++;
                } else {
                    System.out.println("No hay recursos suficientes para crear este personaje. Hay " + comida + " unidades de comida y se necesitan 50");
                }

            }

        } else if ("soldado".equals(tipo)) {
            String paisano = "Soldado-";
            String numero = "";
            numero = Integer.toString(contadorSoldados + 1);
            String total = paisano + numero;

            Personaje soldadoNuevo = new Personaje(total, tipo);
            Celda celdaAdyacente = devolverCeldaAdyacente(edificio.getPosicion(), "SUR");
            if ("pradera".equals(celdaAdyacente.getTipo())) {

                System.out.println("Coste de creación: " + soldadoNuevo.getCoste() + " unidades de comida");
                Edificio ciu = null;
                ciu = devolverEdificio("Ciudadela-1");
                int comida = ciu.getRecurso().getComida();
                if (comida > 100) {
                    soldadoNuevo.setPosicion(celdaAdyacente.getPosicion());
                    celdaAdyacente.setPersonaje(soldadoNuevo);
                    ciu.getRecurso().setComida(comida - 100);
                    Edificio casa = null;
                    casa = devolverEdificio("Casa-1");
                    int cap = casa.getCapacidad();
                    edificio.setCapacidad(cap - 1);
                    System.out.println("Te quedan " + edificio.getCapacidad() + " unidades de capacidad de alojamiento");

                    System.out.println("El " + soldadoNuevo.getNombre() + " se ha encuentra a la posicion " + soldadoNuevo.getPosicion());
                    listaPersonajes.put(soldadoNuevo.getNombre(), soldadoNuevo);
                    contadorSoldados++;
                } else {
                    System.out.println("No hay suficientes recursos para crear este personaje. Hay " + comida + " unidades de comida y se necesitan 100");
                }

            }
        } else {
            System.out.println("El personaje que quiere crear no existe");
        }

    }

    public void construirEdificio(Personaje personaje, String tipo, String direccion) {

        if ("casa".equals(tipo)) {
            String casa = "Casa-";
            String numero = "";
            numero = Integer.toString(contadorCasas + 1);
            String total = casa + numero;

            Edificio nuevaCasa = new Edificio(total, tipo);
            Celda celdaAdyacente = devolverCeldaAdyacente(personaje.getPosicion(), direccion);
            if ("pradera".equals(celdaAdyacente.getTipo())) {
                Edificio ciu = null;
                ciu = devolverEdificio("Ciudadela-1");
                System.out.println("Coste del edificio: " + nuevaCasa.getRecurso().getMadera() + " unidades de madera y " + nuevaCasa.getRecurso().getPiedra() + " de piedra");
                int madera = ciu.getRecurso().getMadera();
                int piedra = ciu.getRecurso().getPiedra();
                if (madera > 1000 && piedra > 800) {
                    ciu.getRecurso().setMadera(madera - 1000);
                    ciu.getRecurso().setPiedra(piedra - 800);

                    nuevaCasa.setPosicion(celdaAdyacente.getPosicion());
                    celdaAdyacente.setTipo(tipo);
                    celdaAdyacente.setEdificio(nuevaCasa);
                    listaEdificios.put(nuevaCasa.getNombre(), nuevaCasa);
                    System.out.println("Se ha construido una casa en la posicion" + nuevaCasa.getPosicion());
                    contadorCasas++;

                } else {
                    System.out.println("No hay suficientes recursos para construir el edificio. Hay " + madera + "unidades de madera y " + piedra + " unidades de piedra.");
                }

            } else {
                System.out.println("La celda destino no es transitable");
            }
        } else if ("cuartel".equals(tipo)) {
            String cuartel = "Cuartel-";
            String numero = "";
            numero = Integer.toString(contadorCuarteles + 1);
            String total = cuartel + numero;

            Edificio nuevoCuartel = new Edificio(total, tipo);
            Celda celdaAdyacente = devolverCeldaAdyacente(personaje.getPosicion(), direccion);
            if ("pradera".equals(celdaAdyacente.getTipo())) {
                Edificio ciu = null;
                ciu = devolverEdificio("Ciudadela-1");
                System.out.println("Coste del edificio: " + nuevoCuartel.getRecurso().getMadera() + " unidades de madera y " + nuevoCuartel.getRecurso().getPiedra() + " de piedra");
                int madera = ciu.getRecurso().getMadera();
                int piedra = ciu.getRecurso().getPiedra();
                if (madera > 1000 && piedra > 800) {
                    ciu.getRecurso().setMadera(madera - 1000);
                    ciu.getRecurso().setPiedra(piedra - 800);

                    nuevoCuartel.setPosicion(celdaAdyacente.getPosicion());
                    celdaAdyacente.setTipo(tipo);
                    celdaAdyacente.setEdificio(nuevoCuartel);
                    listaEdificios.put(nuevoCuartel.getNombre(), nuevoCuartel);
                    System.out.println("Se ha construido una cuartel en la posicion" + nuevoCuartel.getPosicion());
                    contadorCuarteles++;

                } else {
                    System.out.println("No hay suficientes recursos para construir el edificio. Hay " + madera + "unidades de madera y " + piedra + " unidades de piedra.");
                }

            } else {
                System.out.println("El edificio que desea construir no existe");
            }

        }

    }
    
    public void almacenarRecursos(Personaje personaje, String direccion) {
        Celda celda = devolverCeldaAdyacente(personaje.getPosicion(), direccion);

        if ("ciudadela".equals(celda.getTipo())) {
            if ("piedra".equals(personaje.getTipoRecurso())) {
                celda.getEdificio().getRecurso().setPiedra(personaje.getCantidadAlmacenada() + celda.getEdificio().getRecurso().getPiedra());
                personaje.setCapacidadRecoleccion(personaje.getCapacidadRecoleccion() + personaje.getCantidadAlmacenada());
                personaje.setCantidadAlmacenada(0);
                System.out.println("Almacenadas 100 unidades de piedra en la ciudadela");
            } else if ("madera".equals(personaje.getTipoRecurso())) {
                celda.getEdificio().getRecurso().setMadera(personaje.getCantidadAlmacenada() + celda.getEdificio().getRecurso().getMadera());
                personaje.setCapacidadRecoleccion(personaje.getCapacidadRecoleccion() + personaje.getCantidadAlmacenada());
                personaje.setCantidadAlmacenada(0);
                System.out.println("Almacenadas 100 unidades de madera en la ciudadela");
            } else if ("comida".equals(personaje.getTipoRecurso())) {
                celda.getEdificio().getRecurso().setComida(personaje.getCantidadAlmacenada() + celda.getEdificio().getRecurso().getComida());
                personaje.setCapacidadRecoleccion(personaje.getCapacidadRecoleccion() + personaje.getCantidadAlmacenada());
                personaje.setCantidadAlmacenada(0);
                System.out.println("Almacenadas 100 unidades de comida en la ciudadela");
            }
        } else if ("casa".equals(celda.getTipo())) {
            System.out.println("No se puede almacenar recursos en una casa");
        } else if ("cuartel".equals(celda.getTipo())) {
            System.out.println("No se puede almacenar recursos en un cuartel");
        }

    }

    public void recolectarRecurso(Personaje paisano, String direccion) {
        Celda celdaAux = devolverCeldaAdyacente(paisano.getPosicion(), direccion);

        if ("cantera".equals(celdaAux.getTipo())) {
            if (paisano.getCantidadAlmacenada() < paisano.getCapacidadRecoleccion()) {
                celdaAux.getContenedor().setCantidadPiedra(celdaAux.getContenedor().getCantidadPiedra() - 100);
                paisano.setCantidadAlmacenada(paisano.getCantidadAlmacenada() + 100);
                paisano.setCapacidadRecoleccion(paisano.getCapacidadRecoleccion() - 100);
                System.out.println("Has conseguido 100 unidades de piedra");
                paisano.setTipoRecurso("piedra");
                if (celdaAux.getContenedor().getCantidadPiedra() == 0) {
                    celdaAux.setTipo("pradera");
                    celdaAux.getContenedor().setRecurso(null);

                }
            } else {
                System.out.println("Ya no se puede recolectar mas.");
            }

        } else if ("bosque".equals(celdaAux.getTipo())) {
            if (paisano.getCantidadAlmacenada() < paisano.getCapacidadRecoleccion()) {
                celdaAux.getContenedor().setCantidadMadera(celdaAux.getContenedor().getCantidadMadera() - 100);
                paisano.setCantidadAlmacenada(paisano.getCantidadAlmacenada() + 100);
                paisano.setCapacidadRecoleccion(paisano.getCapacidadRecoleccion() - 100);
                System.out.println("Has conseguido 100 unidades de madera");
                paisano.setTipoRecurso("madera");
                if (celdaAux.getContenedor().getCantidadMadera() == 0) {
                    celdaAux.setTipo("pradera");
                    celdaAux.getContenedor().setRecurso(null);
                }
            } else {
                System.out.println("Ya no se puede recolectar mas.");
            }

        } else if ("arbusto".equals(celdaAux.getTipo())) {
            if (paisano.getCantidadAlmacenada() < paisano.getCapacidadRecoleccion()) {
                celdaAux.getContenedor().setCantidadComida(celdaAux.getContenedor().getCantidadComida() - 100);
                paisano.setCantidadAlmacenada(paisano.getCantidadAlmacenada() + 100);
                paisano.setCapacidadRecoleccion(paisano.getCapacidadRecoleccion() - 100);
                System.out.println("Has conseguido 100 unidades de comida");
                paisano.setTipoRecurso("comida");
                if (celdaAux.getContenedor().getCantidadComida() == 0) {
                    celdaAux.setTipo("pradera");
                    celdaAux.getContenedor().setRecurso(null);
                }
            } else {
                System.out.println("Ya no se puede recolectar mas.");
            }

        } else {
            System.out.println("La celda destino no es un contenedor de recursos");
        }
    }
    public boolean buscarCiudadelaReparar(){
        int capacidad1=0, capacidad2=0;
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    Celda cAux=miMapa.get(i).get(j);
                    if(cAux.getEdificio().getPuntosSalud()<500){
                        if("ciudadela".equals(cAux.getTipo())){
                           int a=cAux.getEdificio().getRecurso().getMadera();
                           int b=cAux.getEdificio().getRecurso().getPiedra();
                           if(a>200 && b>100){
                               cAux.getEdificio().getRecurso().setMadera(a-200);
                               cAux.getEdificio().getRecurso().setPiedra(b-100);
                               capacidad1=200;
                               capacidad2=100;
                           }
                           else{
                               System.out.println("No hay suficientes recursos"); 
                           }
                        }
                    }
                    else{
                        System.out.println("No es necesario repararlo");
                    }
                }
            }
            if(capacidad1==200 && capacidad2==100){
                System.out.println("Coste de la reparacion: " + capacidad1 + " unidades de madera y " +capacidad2 +" unidades de piedra.");
                return(true);
            }
            else{
                return false;
            }
    }
    
    public void reparar( Personaje paisano,String direccion){
        Celda celdaAux;
        celdaAux=devolverCeldaAdyacente(paisano.getPosicion(), direccion);
        if("ciudadela".equals(celdaAux.getTipo())){
            if(celdaAux.getEdificio().getPuntosSalud()<500 && celdaAux.getEdificio().getPuntosSalud()>0 ){
                if(buscarCiudadelaReparar()==true){
                    celdaAux.getEdificio().setPuntosSalud(500);
                }
            }
            else{
                System.out.println("No es necesario repararlo");
            }
        }
        else if("casa".equals(celdaAux.getTipo())){
            if(celdaAux.getEdificio().getPuntosSalud()<500 && celdaAux.getEdificio().getPuntosSalud()>0 ){
                if(buscarCiudadelaReparar()==true){
                    celdaAux.getEdificio().setPuntosSalud(500);
                }
            }
            else{
                System.out.println("No es necesario repararlo");
            }
        }
        else if("cuartel".equals(celdaAux.getTipo())){
            if(celdaAux.getEdificio().getPuntosSalud()<500 && celdaAux.getEdificio().getPuntosSalud()>0 ){
                if(buscarCiudadelaReparar()==true){
                    celdaAux.getEdificio().setPuntosSalud(500);
                }
            }
            else{
                System.out.println("No es necesario repararlo");
            }
        }
        else{
            System.out.println("La celda no contiene ningun edificio");
        }
    }
    
        
    }
    
    
