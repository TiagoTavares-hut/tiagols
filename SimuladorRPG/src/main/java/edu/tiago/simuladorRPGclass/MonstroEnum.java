package edu.tiago.simuladorRPGclass;

/**
 * Enum que representa diferentes tipos de monstros do RPG.
 * Cada monstro possui atributos básicos como vida, ataque e defesa.
 * 
 * @author Tiago
 */
public enum MonstroEnum {

    SLIME("Slime", 30, 5, 1),
    GOBLIN("Goblin", 50, 10, 3),
    ORC("Orc", 80, 15, 5),
    TROLL("Troll", 120, 20, 8),
    DRAGAO("Dragão", 300, 40, 20),
    ESQUELETO("Esqueleto", 40, 8, 2),
    DEMONIO("Demônio", 200, 35, 15);

    private final String nome;
    private final int vida;
    private final int ataque;
    private final int defesa;

    MonstroEnum(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString() {
        return String.format("%s [Vida: %d, Ataque: %d, Defesa: %d]", nome, vida, ataque, defesa);
    }
}
