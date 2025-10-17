package edu.tiago.simuladorRPGclass;

import edu.tiago.simuladorRPG.model.TipoEquipamento;

public class Equipamento {

    private String nome;
    private String bonus;
    private TipoEquipamento tipo; // ⚠️ importante: tipo do ENUM, não String

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public TipoEquipamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + " (" + bonus + ")";
    }
}
