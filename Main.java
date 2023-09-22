
import contieneJugador.Jugador;
import contieneTablero.Tablero;
import java.util.Scanner;


/**
 *
 * @author CEDENORTE
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        
        Tablero tb = new Tablero();
        Jugador jg1 = new Jugador("jugador 1: ", 'X');
        Jugador jg2 = new Jugador("jugador 2: ", 'O');
        Jugador jugadorActual = jg1;
        
        System.out.println(" BIENVENIDO AL JUEGO DEL TRIKI ");
        
        while (true){
            tb.mostrarTablero();
            System.out.println(jugadorActual.getNombre()+"("+jugadorActual.getFicha()+"), Es tu turno");
            System.out.println("ingresa la fila del 1-3");
            int fila = teclado.nextInt();
            System.out.println("ingresa la columna del 1-3");
            int columna = teclado.nextInt();
            
            if (tb.realizarMovimiento(fila, columna, jugadorActual.getFicha())){
                if (tb.hayGanador(jugadorActual.getFicha())){
                    tb.mostrarTablero();
                    System.out.println(jugadorActual.getNombre()+"Haz ganado FELICITACIONES");
                    break;
                }else if (tb.tableroLleno()){
                    System.out.println("No hay Ganador");
                    break;
                }else{
                  jugadorActual=(jugadorActual == jg1)? jg2:jg1;                  
               } 
                }else{
                  System.out.println("Movimiento no valido, intente de nuevo");
            } 
        }
    }
}
