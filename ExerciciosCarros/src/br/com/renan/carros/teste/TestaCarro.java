package br.com.renan.carros.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.carros.dao.CarroDAO;
import br.com.renan.carros.jdbc.ConnectionPoolOracle;
import br.com.renan.carros.model.Carro;
import br.com.renan.carros.service.CarroService;

public class TestaCarro {

	public static void main(String[] args) throws SQLException {
		CarroService carroService = new CarroService();

		List<Carro> lCarros = carroService.listarcarros();
		for (Carro car : lCarros) {
			imprimirCarros(car);
		}

		// Inserir um novo carro
		Carro carro = new Carro("MYZ-4587", "Fusca", "Volkswagen", "Rosa com bolinha branca");
		carroService.inserir(carro);

		Carro carro2 = new Carro("MAZ-0007", "Brasília", "Volkswagen", "Preto");
		carroService.inserir(carro2);

		Carro carro3 = new Carro("AAZ-0207", "Kombi", "Volkswagen", "Branco");
		carroService.inserir(carro3);

		Carro carro4 = new Carro("AAZ-0232", "Uno", "Fiat ", "Cinza");
		carroService.inserir(carro4);

		Carro carro5 = new Carro("A2Z-0235", "Gol ", "Volkswagen  ", "Verde musgo");
		carroService.inserir(carro5);

	}

	private static void imprimirCarros(Carro car) {
		System.out.println("Placa: " + car.getPlaca() + " Tipo: " + car.getTipo() + " Marca:" + car.getMarca() + " Cor:"
				+ car.getCor());

	}
}
