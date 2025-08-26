package br.com.srlarissa.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robô está se movendo!");
    }
}
