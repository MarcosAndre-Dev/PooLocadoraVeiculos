# PooLocadoraVeiculos
Praticando Programação Orientada á Objetos com Java


📌 Requisitos do Sistema
1️⃣ Classe Abstrata Veiculo
Crie uma classe abstrata com:
Atributos (protected ou private + getters/setters):

placa
marca
modelo
valorDiaria
disponivel (boolean)


Métodos:
alugar() → torna o veículo indisponível
devolver() → torna o veículo disponível
calcularValorAluguel(int dias) → método abstrato
exibirDados()



2️⃣ Classes Filhas (Herança)
Crie pelo menos duas classes que herdem de Veiculo:
🚙 Carro
atributo extra: quantidadePortas

cálculo do aluguel:
 valorDiaria * dias


🏍️ Moto
atributo extra: cilindradas
cálculo do aluguel com desconto de 10%:
 (valorDiaria * dias) * 0.9

👉 Aqui você vai usar polimorfismo no método calcularValorAluguel.

3️⃣ Classe Cliente

nome
cpf

4️⃣ Classe Locadora
Responsável por:
armazenar uma lista de veículos (ArrayList<Veiculo>)

cadastrar veículos
listar veículos disponíveis
alugar veículo para um cliente
devolver veículo

5️⃣ Classe Main
Crie um menu no terminal, tipo:
1 - Cadastrar veículo
2 - Listar veículos disponíveis
3 - Alugar veículo
4 - Devolver veículo
5 - Sair
