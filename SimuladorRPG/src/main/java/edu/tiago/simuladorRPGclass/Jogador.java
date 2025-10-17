package edu.tiago.simuladorRPGclass;

import edu.tiago.simuladorRPG.model.TipoEquipamento;
import java.util.ArrayList;
import java.util.List;

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
    private List<Equipamento> inventario;

    public Jogador() {
        this.nivel = 1;
        this.inventario = new ArrayList<>();
    }

    // Getters e setters básicos
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

    public List<Equipamento> getInventario() {
        return inventario;
    }

    // Adiciona um item ao inventário
    public void adicionarEquipamento(Equipamento equipamento) {
        inventario.add(equipamento);
    }

    // Define equipamento na cabeça (validação do tipo)
    public boolean setCabeca(Equipamento cabeca) {
    if (cabeca.getTipo() == TipoEquipamento.CABECA) {
        this.cabeca = cabeca;
        return true;
    }
    return false;
    }
}
