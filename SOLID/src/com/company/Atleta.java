package com.company;

//Interface Segregation Ejemplo Incorrecto

public interface Atleta {
    void competir();
    void nadar();
    void saltoAlto();
}

public class StevenWilson implements Atleta{
    @Override
    public void competir() {
        System.out.println("La competencia de Steven Wilson ya inicio");
    }

    @Override
    public void nadar() {
        System.out.println("Steven Wilson empezo a nadar");
    }

    @Override
    public void saltoAlto() {

    }
}