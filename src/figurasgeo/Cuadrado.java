/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeo;

/**
 *
 * @author alons
 */
public class Cuadrado {
    
    private double ladoA;
    
    public Cuadrado(double ladoAA) {
        ladoA = ladoAA;
    }
    
    public void setLadoA(double ladoAA) {
        this.ladoA = ladoAA;
    }
    
    public double getPerimetro() {
        return ladoA * 4;
    }
    
    public double getArea(){
        return ladoA * ladoA;
    }
}
