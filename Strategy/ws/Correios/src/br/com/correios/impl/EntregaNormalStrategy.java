package br.com.correios.impl;

import br.com.correios.strategy.EntregaProdutoStrategy;

public class EntregaNormalStrategy implements EntregaProdutoStrategy{

	@Override
	public void entregaProduto() {
		// TODO Auto-generated method stub
		System.out.println("Entrega Normal");
	}
	
}
