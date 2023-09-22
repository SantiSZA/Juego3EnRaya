
package contieneTablero;

/** @author CEDENORTE*/
public class Tablero {
    //Parametros
    private char[][] tablero;
    private static final int TAMANO = 3;
    //Metodo Constructor
    public Tablero(){
        tablero = new char[TAMANO][TAMANO];
        
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                tablero[i][j] = ' ';                     
            }
        }
    }
        public void mostrarTablero(){
            System.out.println("--------------");
            for (int i = 0; i < TAMANO; i++) {
                System.out.print("| ");
                for (int j = 0; j < TAMANO; j++) {
                    System.out.print(tablero[i][j]+" | ");
                }
                System.out.println("\n--------------");
            }            
        }
        public boolean realizarMovimiento(int fila, int columna, char ficha){
            if (fila >=1 && fila <= TAMANO && columna >= 1 && columna <= TAMANO && tablero[fila-1][columna-1] == ' '){
                 tablero[fila-1][columna-1] = ficha;
                 return true;
            }  
            return false;            
        }
        public boolean hayGanador(char ficha){
            //verificar filas y columnas
            for (int i = 0; i < TAMANO; i++) {
               //ganar por filas
                if(tablero[i][0]==ficha && tablero[i][1] == ficha && tablero[i][2] == ficha){
                    return true;                    
                }
                //ganar por columna
                if(tablero[0][i]==ficha && tablero[1][i] == ficha && tablero[2][i] == ficha){
                return true;
            }
                //ganar por diagonal 1
                if (tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha){
                    return true;
                }
                //ganar por diagonal 2
                if (tablero[0][2] == ficha && tablero[1][1] == ficha && tablero[2][0] == ficha){
                   return true; 
                }      
        }
            return false;
        }
        public boolean tableroLleno(){
            for (int i = 0; i < TAMANO; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tablero[i][j] == ' '){
                    return false;
                }           
                }
            }
            return true;
        }
}

