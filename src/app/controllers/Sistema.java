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
	
	public static void inicializar() {
		Sistema.compradores = new HashSet<Comprador>();
		Sistema.vendedores = new HashSet<Vendedor>();
		Sistema.produtos = new HashSet<Mostruario>();
	}
}
