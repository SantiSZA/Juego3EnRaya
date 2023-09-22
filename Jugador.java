
package contieneJugador;

/**
 *
 * @author CEDENORTE
 */
public class Jugador {
    //parametros
    private String nombre;
    private char ficha;
    //crear el constructor

    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }
//getter and setter    

    public String getNombre() {
        return nombre;
    }

    public char getFicha() {
        return ficha;
    }    
}
