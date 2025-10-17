package edu.tiago.simuladorRPGclass;

import edu.tiago.simuladorRPG.model.Monstro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Serviço responsável por retornar uma lista dos monstros disponíveis no jogo.
 * Usa diretamente o enum Monstro definido em edu.tiago.simuladorRPG.model.
 * 
 * @author Tiago
 */
public class MonstroService {

    public static List<Monstro> obterMonstros() {
        List<Monstro> monstros = new ArrayList<>();

        // Adiciona todos os monstros definidos no enum Monstro
        monstros.addAll(Arrays.asList(Monstro.values()));

        return monstros;
    }
}
