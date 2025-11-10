/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class SistemaVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 8);
        Veiculo moto = new Moto("Honda", "CB500", 2021);
        Veiculo caminhao = new Caminhao("Volvo", "FH", 2020);

        Veiculo[] veiculos = {carro, moto, caminhao};

        for (Veiculo v : veiculos) {
            System.out.println("\n--- Detalhes do Veículo ---");
            v.exibirDetalhes();
            v.acelerar();
        }
    }
}