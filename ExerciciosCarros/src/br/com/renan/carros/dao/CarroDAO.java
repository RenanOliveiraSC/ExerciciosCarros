package br.com.renan.carros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.carros.model.Carro;

public class CarroDAO {

	private final Connection con;

	public CarroDAO(Connection con) {
		this.con = con;

	}

	public boolean inserir(Carro carro) throws SQLException {
		String sql = "INSERT INTO CARROS (CAR_CODIGO, CAR_PLACA, CAR_TIPO, CAR_MARCA, CAR_COR) VALUES (SEQ_CARRO.nextval, ?,?,?,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, carro.getPlaca());
		statement.setString(2, carro.getTipo());
		statement.setString(3, carro.getMarca());
		statement.setString(4, carro.getCor());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String marca) throws SQLException{
		String sql = "UPDATE CARRO SET CAR_NOME = ? WHERE CAR_CODIGO = ?";
		
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, marca);
		statement.setInt(2, codigo);
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException{
		String sql = "DELETE CARRO WHERE CAR_CODIGO = ?";
		
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, codigo);
		return statement.executeUpdate() > 0;
	}
		
	public List<Carro> lista() throws SQLException {
		List<Carro> lCarro = new ArrayList<>();
		String sql = "Select * from Carros";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("CAR_CODIGO");
					String placa = rs.getString("CAR_PLACA");
					String tipo = rs.getString("CAR_TIPO");
					String marca = rs.getString("CAR_MARCA");
					String cor = rs.getString("CAR_COR");
					lCarro.add(new Carro(codigo, placa, tipo, marca,cor));
				}
			}

		}
		return lCarro;
	}
}