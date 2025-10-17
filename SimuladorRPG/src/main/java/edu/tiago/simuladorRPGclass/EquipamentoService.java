package edu.tiago.simuladorRPGclass;

import java.util.List;
import java.util.ArrayList;

public class EquipamentoService {

    // 🔹 Método estático que retorna uma lista de equipamentos
    public static List<Equipamento> ObterEquipamento() {
        List<Equipamento> equipamentos = new ArrayList<>();

        // Percorre todos os valores do enum EquipamentoEnum
        for (EquipamentoEnum item : EquipamentoEnum.values()) {
            Equipamento e = new Equipamento();
            e.setNome(item.getNome());
            e.setBonus(item.getBonus());
            e.setTipo(item.getTipo());
            equipamentos.add(e);
        }

        return equipamentos;
    }
}
