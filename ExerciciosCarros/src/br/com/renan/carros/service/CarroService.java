package br.com.renan.carros.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.carros.dao.CarroDAO;
import br.com.renan.carros.jdbc.ConnectionPoolOracle;
import br.com.renan.carros.model.Carro;

public class CarroService {

	public void inserir(Carro carro) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CarroDAO(con).inserir(carro);
		}
	}

	public void alterar(Carro carro) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CarroDAO(con).inserir(carro);
		}
	}

	public void excluir(Carro carro) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CarroDAO(con).inserir(carro);
		}
	}

	public List<Carro> listarcarros() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CarroDAO(con).lista();
		}
	}

}
