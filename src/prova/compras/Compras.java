package prova.compras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import prova.fornecedor.Fornecedor;
import prova.produto.Produto;

public class Compras {
	private Map cProduto = new HashMap();
	private Map cFornecedor = new HashMap();
	private List cEstoque = new ArrayList();
	

	public boolean adicionaProduto(Produto p) {
		cProduto.put(p,p.getCodigo());
		return true;
	}

	public boolean adicionaFornecedor(Fornecedor f) {
		cFornecedor.put(f,f.getCodigo());
		return true;
	}
	
	private String codigoProduto;
	private String codigoFornecedor;
	private int qtd;
	
	/*public Compras() {
		
	}
	
	public Compras(String codigoProduto, String codigoFornecedor, int qtd) {
		this.codigoProduto = codigoProduto;
		this.codigoFornecedor = codigoFornecedor;
		this.qtd = qtd;
	}*/
	
	public void compra(String codigoProduto, String codigoFornecedor, int qtd) {
		//Compras c = new Compras(codigoProduto,codigoFornecedor,qtd); 
		//cEstoque.add(c);
	}


	public boolean fornecedorProduto() {
		//Lista
		return false;
	}

	public double quantidadeDeProduto(String codigoProduto) {
		//Lista
		return 0;
	}
     
	public String totalPorProduto(){
		//Lista
		return " "; 
	}
}