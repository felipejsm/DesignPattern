package br.com.correios;

import br.com.correios.strategy.EntregaProdutoStrategy;

public class EntregaCorreios {
	private EntregaProdutoStrategy entrega;
	public void setEntregaProdutoStrategy(EntregaProdutoStrategy entrega) {
		this.entrega = entrega;
	}
	public void getEntregaProdutoStrategy() {
		entrega.entregaProduto();
	}
}
