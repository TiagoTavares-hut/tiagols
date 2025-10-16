/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.tiago.simuladorRPGclass;

import edu.tiago.simuladorRPGclass.Equipamento;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author TiagoT
 */
public class EquipamentoService {
     public static List<Equipamento> ObterEquipamentos(){
        List<Equipamentos> equipamentos = new ArrayList<>();
        for (EquipamentosEnum item : EquipamentosEnum.values())
            Equipamento e = new Equipamento();
            e.setNome(item.getNome());
            e.setBonus(item.getBonus());
            e.setTipo(item.getTipo());
            equipamentos.add(e);
    }
    return equipamentos;