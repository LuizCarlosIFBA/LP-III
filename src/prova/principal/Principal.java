package prova.principal;

import prova.compras.Compras;
import prova.fornecedor.Fornecedor;
import prova.produto.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compras c = new Compras();
				
		//Adicionando produto
		Produto[] p = new Produto[3];
		p[0] = new Produto();
		p[0].setCodigo("P-1");
		p[0].setDescricao("CD");
		p[0].setPreco(1.20);
		
		c.adicionaProduto(p[0]);
		
		p[1] = new Produto();
		p[1].setCodigo("P- 30");
		p[1].setDescricao("Papel");
		p[1].setPreco(15);
		
		c.adicionaProduto(p[1]);
		
		p[2] = new Produto();
		p[2].setCodigo("P-3");
		p[2].setDescricao("Cola");
		p[2].setPreco(3.25);
		
		c.adicionaProduto(p[2]);
		
		//adicionando fornecedor
		Fornecedor[] f = new Fornecedor[2];
		
		f[0] = new Fornecedor();
		f[0].setCodigo("F-1");
		f[0].setDescricao("Empresa XO");
		
		c.adicionaFornecedor(f[0]);
		
		f[1] = new Fornecedor();
		f[1].setCodigo("F-2");
		f[1].setDescricao("Empresa ABC");
		
		c.adicionaFornecedor(f[1]);
		
		//Compras
		c.compra("P-3","F-1",10);
		c.compra("P-3","F-1",20);
		
		c.compra("P- 30","F-1",5);
		c.compra("P- 30","F-1",50);
		
		c.compra("P-1","F-1",20);
		c.compra("P-1","F-2",30);
		
		//Saída
		System.out.println(c.quantidadeDeProduto("P- 30"));
		System.out.println(c.totalPorProduto());
		System.out.println(c.fornecedorProduto());
	}

}
