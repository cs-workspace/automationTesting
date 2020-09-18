package com.company;

class Laptop {
}

class ConectorDisplay{
    public void conectar(Laptop dispositivo){
        DispositivoConectado = dispositivo;
    }

    private Laptop DispositivoConectado;
}

class Monitor{
    public Monitor(ConectorDisplay videoConector){
        this.videoConector = videoConector;
    }
    public void conectarADispositivo(Laptop dispositivo){
        videoConector.conectar(dispositivo);
    }

    private ConectorDisplay videoConector;
} 