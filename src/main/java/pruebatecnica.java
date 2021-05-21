/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class pruebatecnica {
    
    private static int tamX=8; //tamaño en X del tablero
    private static int tamY=8; //tamaño en Y del tablero
    
    private static int posRx=0; //Posición en X de la reina
    private static int posRy=0; //Posición en Y de la reina
    
    public static int[][] tablero = new int[tamX][tamY]; //Arreglo multidimencional del tablero
    
    private static void posreina(int x, int y){
        posRx=x; posRy=y;
        for (int i=0; i<tamX; i++) {
            for (int j=0; j<tamY; j++) {
                if(i==x && j==y){
                    tablero[i][j]=1;
                }else if(i==x || j==y){
                    tablero[i][j]=2;
                }else{
                    tablero[i][j]=0;
                }
                
            }
            
        }
    }
    
    private static void diag(){
        for (int i=0; i<tamX; i++) {
            if((posRx+i)<tamX && (posRy+i)<tamY){
                tablero[(posRx)+i][(posRy)+i]=4; 
            }
            
            if((posRx-i)>=0 && (posRy-i)>=0){
                tablero[(posRx)-i][(posRy)-i]=4;
            }
            
            if((posRx+i)<tamX && (posRy-i)>=0) {
                tablero[(posRx)+i][(posRy)-i]=4;
            }
            
            if((posRx-i)>=0 && (posRy+i)<tamY){
                tablero[(posRx)-i][(posRy)+i]=4;
            }
        }
    }
    
    private static int resultado() {
        int c=0;
        for (int i=0; i<tamX; i++) {
            for (int j=0; j<tamY; j++) {
                if((tablero[i][j])!=0){
                    c++;
                }
            }
        }
        return c-1;
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        posreina(1,1);
        diag();
        System.out.println("El total de casillas disponibles para moverse es: "+resultado());
        
        //Prueba
        /*for (int i=0; i<tamX; i++) {
            for (int j=0; j<tamY; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }*/
    }

    
}
//LISTO