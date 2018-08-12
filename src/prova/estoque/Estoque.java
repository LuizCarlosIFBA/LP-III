package prova.estoque;

import prova.fornecedor.Fornecedor;
import prova.produto.Produto;

public class Estoque {
	private Produto produto;
	private Fornecedor fornecedor;
	private int quantidade;

	void setQuantidade(int quantidade) {
		quantidade = quantidade;
	}

	int getQuantidade()
	   {
	        return quantidade;
	   }

	public boolean equals(Object o) {
		return false;
		/*
		 * if(x.equals(o)){
		 * 
		 * }
		 */
	}
}
