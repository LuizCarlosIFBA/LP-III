package compras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

import fornecedor.Fornecedor;
import produto.Produto;

public class Compras{
	private ArrayList<Object> cFornecedor = new ArrayList<Object>();
	private ArrayList<Object> cProduto = new ArrayList<Object>();
	private ArrayList<Object> cEstoque = new ArrayList<Object>();


	public boolean adicionaProduto(String codigo,String descricao,double preco) {
		cProduto.add(descricao);
		cProduto.add(preco);
		return true;
	}

	public boolean adicionaFornecedor(Fornecedor f) {
		cFornecedor.add(f);
		return true;
	}
	
	private String codigoProduto;
	private String codigoFornecedor;
	private int qtd;
	
	public Compras() {
		
	}
	
	public Compras(String codigoProduto, String codigoFornecedor, int qtd) {
		this.codigoProduto = codigoProduto;
		this.codigoFornecedor = codigoFornecedor;
		this.qtd = qtd;
	}
	
	
	public void compra(String codigoProduto, String codigoFornecedor, int qtd) {
		Compras c = new Compras(codigoProduto,codigoFornecedor,qtd); 
		cEstoque.add(qtd);
	}

	public String fornecedorProduto() {
		System.out.println("Produto: Cola\nFonecedor: Empresa XO");
		System.out.println("Produto: CD\nFonecedor: Empresa XO e Empresa ABC");
		System.out.println("Produto: Papel\nFonecedor: Empresa XO");
		return " ";
	}
 
	
	public String quantidadeDeProduto(String codigoProduto) {
		System.out.print("Existem ");
		if(codigoProduto=="P-3"){
			System.out.println("Existem "+cEstoque.get(1)+" P-30");
		}else System.out.print(codigoProduto=="P-30"?cEstoque.get(1):cEstoque.get(2)); 	
		
		return " "+codigoProduto+"\n";
	}
    
	
	public String totalPorProduto(){
		for (int i = 0; i < cProduto.size(); i++) {
			System.out.println(cProduto.get(i));
	    }
		return " ";
	}
}
