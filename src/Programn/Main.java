package Programn;

import java.util.Scanner;
import Classes.Locadora;
import Classes.Veiculo;
import Classes.Carro;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Locadora locadora = new Locadora("Locadora Central");

        while (opcao != 5) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Alugar veículo");
            System.out.println("4 - Devolver veículo");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Placa: ");
                String placa = sc.nextLine();

                System.out.print("Marca: ");
                String marca = sc.nextLine();

                System.out.print("Modelo: ");
                String modelo = sc.nextLine();

                System.out.print("Valor da diária: ");
                double valorDiaria = sc.nextDouble();
                sc.nextLine();

                Veiculo v = new Carro(placa, marca, modelo, valorDiaria);
                locadora.CadastrarVeiculo(v);
            } 
            else if (opcao == 2) {
                locadora.ListarVeiculos();
            } 
            else if (opcao == 3) {

                System.out.print("Placa do veículo: ");
                String placa = sc.nextLine();

                System.out.print("Dias de aluguel: ");
                int dias = sc.nextInt();
                sc.nextLine();

                locadora.AlugarVeiculo(placa, dias);
            } 
            else if (opcao == 4) {

                System.out.print("Placa do veículo: ");
                String placa = sc.nextLine();

                locadora.DevolverVeiculo(placa);
            } 
            else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
