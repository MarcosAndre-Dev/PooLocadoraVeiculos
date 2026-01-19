package Classes;

public class Moto extends Veiculo{

	private int Cilindradas; 
	
	
	public int getCilindradas() {
		return Cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		Cilindradas = cilindradas;
	}

	public Moto(String placa, String marca, String modelo, double valorDiaria) {
		super(placa, marca, modelo, valorDiaria);
	}

	@Override
	public double CalcularValorAluguel(int dias) {
		return getValorDiaria() * dias;
	}

	public double CalcularValorAluguelDesconto(int dias) {
		return (getValorDiaria() * dias) * 0.9;
	}
}
