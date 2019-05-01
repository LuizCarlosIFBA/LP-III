import compras.Compras;
import fornecedor.Fornecedor;
import produto.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compras c = new Compras();
				
		//Adicionando produto
		c.adicionaProduto("P-1","CD",1.20*30);
		c.adicionaProduto("P-30","Papel",15*55);
		c.adicionaProduto("P-3","Cola",3.25*50);
		
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
