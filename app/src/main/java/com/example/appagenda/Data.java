package com.example.appagenda;

public class Data {

    private int mDia;
    private int mMes;
    private int mAno;

    public Data(int dia, int mes, int ano) {
        this.mDia = dia;
        this.mMes = mes;
        this.mAno = ano;
    }

    public int getmAno() {
        return mAno;
    }

    public int getmDia() {
        return mDia;
    }

    public int getmMes() {
        return mMes;
    }

    public void setmAno(int mAno) {
        this.mAno = mAno;
    }

    public void setmDia(int mDia) {
        this.mDia = mDia;
    }

    public void setmMes(int mMes) {
        this.mMes = mMes;
    }
}
