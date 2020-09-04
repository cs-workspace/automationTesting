package com.company;

// Open/Closed Principle

import org.w3c.dom.css.Rect;

import javax.sound.sampled.spi.AudioFileReader;
import java.awt.geom.Area;


public class CalcularArea {

    int ancho;
    int largo;

    public CalcularArea (int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public static void calcularAreaRectangular(CalcularArea calcularArea){
        int area = calcularArea.ancho * calcularArea.largo;
        System.out.println(area);

    }

    public static void main(String[] args){
        CalcularArea rectangulo = new CalcularArea(5, 5);

        calcularAreaRectangular(rectangulo);

    }

}

