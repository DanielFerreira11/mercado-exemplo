import exemplo.ProdutoRepository;
import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoService;

public class Sistema {

	public static void main(String[] args) {

		Produto produto = new Produto("Leite", "Parmalat");
		Produto p1 = new Produto("Leite em pó", "Isis");
		Produto p2 = new Produto("biscoito", "treloso");
		Produto p3 = new Produto("ovo", "galinha");
		Produto p4 = new Produto("Leite de vaca", "Betania");
		Produto p5 = new Produto("Leite de cabra", "Mococa");

		Lote lote = new Lote(produto, 10L);

		//ProdutoRepository catalogo = new ProdutoRepository();

		ProdutoService ps = new ProdutoService();

		/*catalogo.add(produto);
		catalogo.add(p1);
		catalogo.add(p2);
		catalogo.add(p3);
		catalogo.add(p4);
		catalogo.add(p5);



		System.out.println(produto);
		System.out.println(lote);
		System.out.println(catalogo.toString());
		System.out.println(catalogo.getProduto(produto));
		System.out.println(catalogo.getProduto(p2));
		System.out.println(catalogo.getProduto(p3));
		catalogo.remove(p3);
		System.out.println(catalogo.toString());
		*/

		//System.out.println(catalogo.listProdutoByName("Leite"));





	}
}
