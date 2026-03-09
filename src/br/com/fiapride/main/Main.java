package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Marcos", "ABC-1234", 25.4);

        System.out.println(v1);

        v1.adicionarGas(24.7);
        System.out.println("----------------");
        v1.gastarGas(40.5);


    }



}
