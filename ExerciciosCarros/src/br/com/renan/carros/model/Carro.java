package br.com.renan.carros.model;

public class Carro {

	private int codigo;
	private String placa;
	private String tipo;
	private String marca;
	private String cor;
	
	public Carro(int codigo, String placa, String tipo, String marca, String cor) {
		this.codigo = codigo;
		this.placa = placa;
		this.tipo = tipo;
		this.marca = marca;
		this.cor = cor;
		
	}
	
	public Carro(String placa, String tipo, String marca, String cor){
		this.placa = placa;
		this.tipo = tipo;
		this.marca = marca;
		this.cor = cor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
}