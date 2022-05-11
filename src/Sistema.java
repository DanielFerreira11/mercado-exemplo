import exemplo.ProdutoRepository;
import exemplo.Lote;
import exemplo.Produto;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Produto p2 = new Produto("biscoito", "treloso");
		Produto p3 = new Produto("ovo", "galinha");

		Lote lote = new Lote(produto, 10L);

		ProdutoRepository catalogo = new ProdutoRepository();

		catalogo.add(produto);
		catalogo.add(p2);
		catalogo.add(p3);


		System.out.println(produto);
		System.out.println(lote);
		System.out.println(catalogo.toString());
		System.out.println(catalogo.getProduto(produto));
		System.out.println(catalogo.getProduto(p2));
		System.out.println(catalogo.getProduto(p3));
		catalogo.remove(p3);
		System.out.println(catalogo.toString());




	}
}
