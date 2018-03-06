package br.com.correios;

import br.com.correios.impl.EntregaNormalStrategy;
import br.com.correios.impl.EntregaSedexStrategy;

public class EntregaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntregaCorreios entrega = new EntregaCorreios();
		entrega.setEntregaProdutoStrategy(new EntregaNormalStrategy());
		entrega.getEntregaProdutoStrategy();
		//mudando em RunTime
		entrega.setEntregaProdutoStrategy(new EntregaSedexStrategy());
		entrega.getEntregaProdutoStrategy();
	}

}
