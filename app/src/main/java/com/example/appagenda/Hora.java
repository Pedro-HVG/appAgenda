package com.example.appagenda;

public class Hora {

    private int mHora;
    private int mMinuto;

    public Hora(int hora, int minuto) {
        this.mHora = hora;
        this.mMinuto = minuto;
    }

    public int getmHora() {
        return mHora;
    }

    public int getmMinuto() {
        return mMinuto;
    }

    public void setmHora(int mHora) {
        this.mHora = mHora;
    }

    public void setmMinuto(int mMinuto) {
        this.mMinuto = mMinuto;
    }
}