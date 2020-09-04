package com.company;

//Liskov Substitution

public class Animal {

    public String comidaFavorita;

    public Animal(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }


    static class Perro extends Animal {
        public Perro(String comidaFavorita) {
            super(comidaFavorita);
        }
    }

    static class Gato extends Animal {
        public Gato(String comidaFavorita) {
            super(comidaFavorita);
        }
    }

    public static void darGalleta(Animal animal) {
        String mensaje = " Le diste de comer a " + animal.getClass().getSimpleName() + " un poco de " + animal.comidaFavorita;
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Perro skeeter = new Perro("salchicha");
        Gato garfield = new Gato("comida de gato");

        darGalleta(skeeter);
        darGalleta(garfield);
    }
}