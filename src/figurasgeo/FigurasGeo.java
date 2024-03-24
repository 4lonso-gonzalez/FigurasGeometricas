/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeo;

import java.util.Scanner;

/**
 *
 * @author alons
 */

public class FigurasGeo {

    public static void main(String[] args) {
        double ladoA, ladoB, radio;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Operaciones con figura geométrica rectángulo");
        System.out.println("============================================");
        System.out.println("Ingrese el lado A del rectangulo: ");
        ladoA = leer.nextDouble();
        System.out.println("Ingrese el lado B del rectangulo: ");
        ladoB = leer.nextDouble();
        Rectangulo objetoRectangulo = new Rectangulo(ladoA, ladoB);
        objetoRectangulo.setLadoA(ladoA); 
        objetoRectangulo.setLadoB(ladoB);
        double perimetro_rec = objetoRectangulo.getPerimetro();
        double area_rec = objetoRectangulo.getArea();
        System.out.println("El área del rectángulo es: " + area_rec);
        System.out.println("El perimetro del rectangulo es :" + perimetro_rec);
        
        System.out.println("Operaciones con figura geométrica cuadrado");
        System.out.println("==========================================");
        System.out.println("Ingrese el lado A del cuadrado: ");
        ladoA = leer.nextDouble();
        Cuadrado objetoCuadrado = new Cuadrado(ladoA);
        objetoCuadrado.setLadoA(ladoA);
        double perimetro_cua = objetoCuadrado.getPerimetro();
        double area_cua = objetoCuadrado.getArea();
        System.out.println("El área del cuadrado es: " + area_cua);
        System.out.println("El perimetro del rectangulo es: " + perimetro_cua);
        
        System.out.println("Operaciones con figura geométrica círculo");
        System.out.println("=========================================");
        System.out.println("Ingrese el radio del circulo: ");
        radio = leer.nextDouble();
        Circulo objetoCirculo = new Circulo(radio);
        objetoCirculo.setRadio(radio);
        double perimetro_cir = objetoCirculo.getPerimetro();
        double area_cir = objetoCirculo.getArea();
        System.out.println("El área del circulo es: " + area_cir);
        System.out.println("El perimetro del circulo es: " + perimetro_cir);
    }
}