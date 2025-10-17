package edu.tiago.simuladorRPGclass;

import edu.tiago.simuladorRPG.model.TipoEquipamento;

public enum EquipamentoEnum {

    CAPACETE_COURO("Capacete de Couro", "+2 Defesa", TipoEquipamento.CABECA),
    ARMADURA_COURO("Armadura de Couro", "+5 Defesa", TipoEquipamento.ARMADURA),
    ESPADA_CURTA("Espada Curta", "+3 Ataque", TipoEquipamento.MAO),
    BOTAS_COURO("Botas de Couro", "+1 Defesa", TipoEquipamento.CALCADO);

    private final String nome;
    private final String bonus;
    private final TipoEquipamento tipo;

    EquipamentoEnum(String nome, String bonus, TipoEquipamento tipo) {
        this.nome = nome;
        this.bonus = bonus;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getBonus() {
        return bonus;
    }

    public TipoEquipamento getTipo() {
        return tipo;
    }
}
