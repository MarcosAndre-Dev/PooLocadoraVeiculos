package Classes;

public class Carro extends Veiculo {

	private int QuantidadePortas;

	public Carro(String placa, String marca, String modelo, double valorDiaria) {
		super(placa, marca, modelo, valorDiaria);
	}

	public int getQuantidadePortas() {
		return QuantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		QuantidadePortas = quantidadePortas;
	}

	@Override
	public double CalcularValorAluguel(int dias) {
		return getValorDiaria() * dias;
	}
}
