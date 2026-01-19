package Classes;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

	private String Nome;
	private List<Veiculo> Veiculos;

	public Locadora(String nome) {
		this.Nome = nome;
		this.Veiculos = new ArrayList<>();
	}

	public void CadastrarVeiculo(Veiculo veiculo) {
		Veiculos.add(veiculo);
		System.out.println("Veículo cadastrado com sucesso!");
	}

	public void ListarVeiculos() {
		for (Veiculo v : Veiculos) {
			System.out.print(v.ExibirDados());
			System.out.println("----------------------");
		}
	}

	public void ListarVeiculosDisponiveis() {
		for (Veiculo v : Veiculos) {
			if (v.getDisponivel()) {
				System.out.print(v.ExibirDados());;
				System.out.println("----------------------");
			}
		}
	}

	public void AlugarVeiculo(String placa, int dias) {
		for (Veiculo v : Veiculos) {
			if (v.getPlaca().equalsIgnoreCase(placa)) {

				if (v.getDisponivel()) {
					v.Alugar();
					double valor = v.CalcularValorAluguel(dias);
					System.out.println("Valor total: R$ " + valor);
				} else {
					System.out.println("Veículo não está disponível.");
				}
				return;
			}
		}
		System.out.println("Veículo não encontrado.");
	}

	public void DevolverVeiculo(String placa) {
		for (Veiculo v : Veiculos) {
			if (v.getPlaca().equalsIgnoreCase(placa)) {
				v.Devolver();
				System.out.println("Veículo devolvido com sucesso!");
				return;
			}
		}
		System.out.println("Veículo não encontrado.");
	}
}
