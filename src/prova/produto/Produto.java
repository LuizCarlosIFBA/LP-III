package prova.produto;

public class Produto {
	private String codigo;
	private String descricao;
	private double preco;

	// Código
	public void setCodigo(String codigo) {
		codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	// Descrição
	public void setDescricao(String descricao) {
		descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	// Preco
	public void setPreco(double preco)
	   {
	        preco = preco;
	   }

	double getPreco() {
		return preco;
	}

}
