/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageofempires_parte1;

/**
 *
 * @author María
 */
public class Celda {
    
   private Posicion posicion;
    private ContenedoresRecurso contenedor;
    private Edificio edificio;
    private HashMap<String, Personaje> personajes;
    private Personaje personaje;
    private String tipo;
    private boolean visible;

   public Celda() {
        this.posicion = new Posicion();
        this.contenedor = null;
        this.personaje = null;
        this.personajes = new HashMap();
        this.edificio = null;
        this.tipo = "pradera";
    }

   public Celda(int x, int y) {
        this.posicion = new Posicion(x, y);
        this.contenedor = null;
        this.personaje = null;
        this.personajes = new HashMap();
        this.edificio = null;
        this.tipo = "pradera";
    }   
   
    public Posicion getPosicion() {
        return posicion;
    }

    public ContenedoresRecurso getContenedor() {
        return contenedor;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public String getTipo() {
        return tipo;
    }
    
    public HashMap<String, Personaje> getPersonajes() {
        return personajes;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setContenedor(ContenedoresRecurso contenedor) {
        this.contenedor = contenedor;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    
    public void setPersonajes(HashMap<String, Personaje> personajes) {
        this.personajes = personajes;
    }

    public void setTipo(String tipo) {
        if("cuartel".equals(tipo) || "ciudadela".equals(tipo) || "casa".equals(tipo)){
            this.tipo = tipo;
        }
        if("pradera".equals(tipo) || "bosque".equals(tipo) || "cantera".equals(tipo) || "arbusto".equals(tipo)){
            this.tipo = tipo;
        }
        
    }
    
    public void describirCelda() {

        if (visible == true) {
            if ("ciudadela".equals(tipo) || "casa".equals(tipo) || "cuartel".equals(tipo)) {
                if (edificio != null) {
                    edificio.mirarEdificio();
                }
            } else if ("cantera".equals(tipo) || "bosque".equals(tipo) || "arbusto".equals(tipo)) {
                if (contenedor != null) {
                    System.out.println(contenedor);
                }

            } else if ("pradera".equals(tipo)) {
                if (personaje != null) {
                    if ("paisano".equals(personaje.getTipo()) || "soldado".equals(personaje.getTipo())) {

                        Iterator<Personaje> persona = personajes.values().iterator();
                        while (persona.hasNext()) {
                            Personaje personas = persona.next();
                            personas.mirarPersonaje();
                        }

                    }

                } else {
                    System.out.println("Celda de tipo pardera");
                }

            }
        } else {
            System.out.println("La celda no está visible");
        }
    }
        
}
