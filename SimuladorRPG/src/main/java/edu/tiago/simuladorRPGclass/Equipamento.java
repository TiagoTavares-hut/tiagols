/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.tiago.simuladorRPGclass;

/**
 *
 * @author TiagoT
 */
public class Equipamento {
private String nome;
    private int bonus;
    private String tipo;

    public Equipamento() {
    }

    public Equipamento(String nome, int bonus, String tipo) {
        this.nome = nome;
        this.bonus = bonus;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Equipamento: %s | Tipo: %s | Bônus: %d", nome, tipo, bonus);
    }
}