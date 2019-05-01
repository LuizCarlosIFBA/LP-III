package estoque;

import fornecedor.Fornecedor;
import produto.Produto;

public class Estoque {
	private Produto produto;
	private Fornecedor fornecedor;
	private int quantidade;

	public void setQuantidade(int quantidade) {
		quantidade = quantidade;
	}

	public int getQuantidade()
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
