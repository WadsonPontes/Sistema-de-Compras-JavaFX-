package app.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import app.enums.TipoFormaPagamento;
import app.models.compra.Compra;
import app.models.pessoa.Comprador;
import app.models.pessoa.Vendedor;
import app.models.produto.Mostruario;
import app.models.produto.Produto;

public class Sistema {
	public static Scanner scan = new Scanner(System.in);
	public static Set<Comprador> compradores;
	public static Set<Vendedor> vendedores;
	public static List<Compra> compras;
	public static Set<Produto> produtos;
	
	public static Comprador compradorSelecionado;
	public static Vendedor vendedorSelecionado;
	public static Produto produtoSelecionado;
	
	public static void inicializar() {
		Sistema.produtos = new HashSet<Produto>();
		Sistema.compras = new ArrayList<Compra>();
		Sistema.compradores = new HashSet<Comprador>();
		Sistema.vendedores = new HashSet<Vendedor>();
		
		Sistema.produtos.add(new Produto("0001", "Biscoito", 2.49, 100));
		Sistema.produtos.add(new Produto("0002", "Arroz", 4.09, 500));
		Sistema.produtos.add(new Produto("0003", "Feijão", 4.60, 400));
		Sistema.compras.add(new Compra("999.888.777-44", "50.266.711/0001-80", TipoFormaPagamento.BOLETO, Sistema.produtos));
		Sistema.compras.add(new Compra("111.888.777-44", "50.266.711/0001-80", TipoFormaPagamento.PIX, Sistema.produtos));
		Sistema.compras.add(new Compra("222.888.777-44", "50.266.711/0001-80", TipoFormaPagamento.DEBITO, Sistema.produtos));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59, Sistema.compras, Sistema.produtos));
		Sistema.compradores.add(new Comprador("Pontes", "111.888.777-44", 10000.59, Sistema.compras, Sistema.produtos));
		Sistema.compradores.add(new Comprador("Souza", "222.888.777-44", 130000.59, Sistema.compras, Sistema.produtos));
		Sistema.vendedores.add(new Vendedor("Wadson Vendendor", "50.266.711/0001-80"));
		Sistema.vendedores.add(new Vendedor("Pontes Vendendor", "40.266.711/0001-80"));
		Sistema.vendedores.add(new Vendedor("Souza Vendendor", "30.266.711/0001-80"));
	}
}
