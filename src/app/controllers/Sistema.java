package app.controllers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import app.models.pessoa.Comprador;
import app.models.pessoa.Vendedor;
import app.models.produto.Mostruario;

public class Sistema {
	public static Scanner scan = new Scanner(System.in);
	public static Set<Comprador> compradores;
	public static Set<Vendedor> vendedores;
	public static Set<Mostruario> produtos;
	
	public static Comprador compradorSelecionado;
	public static Vendedor vendedorSelecionado;
	public static Mostruario produtoSelecionado;
	
	public static void inicializar() {
		Sistema.compradores = new HashSet<Comprador>();
		Sistema.vendedores = new HashSet<Vendedor>();
		Sistema.produtos = new HashSet<Mostruario>();
		
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		Sistema.compradores.add(new Comprador("Wadson Pontes", "999.888.777-44", 13000.59));
		
		Sistema.vendedores.add(new Vendedor("Wadson Vendendor", "50.266.711/0001-80"));
		
		Sistema.produtos.add(new Mostruario("0001", "Biscoito", 2.49));
	}
}
