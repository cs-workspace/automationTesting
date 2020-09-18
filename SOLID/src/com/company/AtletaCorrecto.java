package com.company;

//Interface Segregation Ejemplo Correcto

public interface AtletaCorrecto {
    void competir();

}

interface NadadorAtleta extends AtletaCorrecto{
    void nadar();
}

interface SaltosAtleta extends AtletaCorrecto{
    void saltoAlto();
}

class StevenWilsonCorrecto implements NadadorAtleta{
    @Override
    public void competir() {
        System.out.println("La competencia de Steven Wilson ya inicio");
    }

    @Override
    public void nadar() {
        System.out.println("Steven Wilson empezo a nadar");
    }


    }
}