/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeo;

/**
 *
 * @author alons
 */
public class Circulo {
    
    private double radio;
    
    public Circulo(double radio1) {
        radio = radio1;
    }
    
    public void setRadio(double radio1) {
        this.radio = radio1;
    }
    
    public double getPerimetro() {
        return 2 * 3.14 * radio;
    }
    
    public double getArea() {
        return 3.14 * (radio * radio);
    }
}
