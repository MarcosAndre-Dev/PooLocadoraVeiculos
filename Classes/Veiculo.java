package Classes;

public abstract class Veiculo {
	private String Placa;
	private String Marca;
	private String Modelo;
	private Double ValorDiaria;
	private Boolean Disponivel;
	
	public Veiculo(String placa, String marca, String modelo, double valorDiaria) {
		this.Placa = placa;
		this.Marca = marca;
		this.Modelo = modelo;
		this.ValorDiaria = valorDiaria;
		this.Disponivel = true;
	}
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public Double getValorDiaria() {
		return ValorDiaria;
	}
	public void setValorDiaria(Double valorDiaria) {
		ValorDiaria = valorDiaria;
	}
	public Boolean getDisponivel() {
		return Disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		Disponivel = disponivel;
	}
	
	public void Alugar() {
		if (this.Disponivel) {
			this.Disponivel = false;
			System.out.print("Veiculo alugado com sucesso!");
		}
		else {
			System.out.print("Veiculo já alugado!");
		}
	}
	public void Devolver() {
		this.Disponivel = true;
	}
	
	public abstract double CalcularValorAluguel(int dias);
	
	public void ExibirDados() {
		System.out.println("===== DADOS DO VEÍCULO =====");
		System.out.println("Placa: " + Placa);
		System.out.println("Marca: " + Marca);
		System.out.println("Modelo: " + Modelo);
		System.out.println("Valor da diária: R$ " + ValorDiaria);
		System.out.println("Disponível: " + (Disponivel ? "Sim" : "Não"));
	}
}
