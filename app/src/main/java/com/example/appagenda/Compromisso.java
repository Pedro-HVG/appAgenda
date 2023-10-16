package com.example.appagenda;

public class Compromisso
{
    private Data mData;
    private Hora mHora;
    private String mDescricao;

    public Compromisso(Data data, Hora hora, String descricao) {
        this.mData = data;
        this.mDescricao = descricao;
        this.mHora = hora;
    }

    public Data getmData() {
        return mData;
    }

    public Hora getmHora() {
        return mHora;
    }

    public String getmDescricao() {
        return mDescricao;
    }

    public void setmData(Data mData) {
        this.mData = mData;
    }

    public void setmDescricao(String mDescricao) {
        this.mDescricao = mDescricao;
    }

    public void setmHora(Hora mHora) {
        this.mHora = mHora;
    }
}
