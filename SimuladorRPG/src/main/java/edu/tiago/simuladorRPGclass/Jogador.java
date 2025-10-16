/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.tiago.simuladorRPGclass;

import java.awt.List;

/**
 *
 * @author TiagoT
 */
public class Jogador {

    private int nivel;
    private Equipamento mao;
    private Equipamento cabeca;
    private Equipamento peitoral;
    private Equipamento calca;
    private Equipamento sapato;

    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Equipamento getMao() {
        return mao;
    }

    public void setMao(Equipamento mao) {
        this.mao = mao;
    }

    public Equipamento getCabeca() {
        return cabeca;
    }

    public void setCabeca(Equipamento cabeca) {
        this.cabeca = cabeca;
    }

    public Equipamento getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(Equipamento peitoral) {
        this.peitoral = peitoral;
    }

    public Equipamento getCalca() {
        return calca;
    }

    public void setCalca(Equipamento calca) {
        this.calca = calca;
    }

    public Equipamento getSapato() {
        return sapato;
    }

    public void setSapato(Equipamento sapato) {
        this.sapato = sapato;
    }
    
    public boolean setCabeca (Equipamento cabeca) {
        if(cabeca.getTipo() == TipoEquipamento.CABECAL){
            this.cabeca = cabeca;
            return true;
        }else{
        
    }
}
