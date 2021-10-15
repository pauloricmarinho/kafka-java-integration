package br.com.prmarinho.kafka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable{

	private static final long serialVersionUID = -7948600219590138087L;

	private Integer id;
	
	private String nome;
	
	private Double valor;
	
	static List<Produto> produtos = new ArrayList<Produto>();
	
	public Produto() { 
		super();
		produtos.add(new Produto(1000, "Lente Camera 4K Ultra Canon", 999.99));
		produtos.add(new Produto(2000, "Nintendo Switch Red and Blue", 2999.99));
		produtos.add(new Produto(3000, "XBox S Series", 3999.99));
		produtos.add(new Produto(4000, "Bike Mormaii MX3000", 1999.99));
		produtos.add(new Produto(5000, "Volante Logitec G29", 1999.99));
		produtos.add(new Produto(6000, "Drone DJI C2001", 8999.99));
	}
	
	public Produto(Integer id, String nome, Double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public static List<Produto> getProdutos() {
		return produtos;
	}

	public static void setProdutos(List<Produto> produtos) {
		Produto.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
