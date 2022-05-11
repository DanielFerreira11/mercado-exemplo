package exemplo;
import exemplo.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
    Map<String, Produto> catalogo = new HashMap<String,Produto>();

    public ProdutoRepository() {
    }

    public ProdutoRepository(Map<String, Produto> catalogo) {
        this.catalogo = catalogo;
    }

    public void add(Produto p1){
        catalogo.put( p1.getId(), p1);
    }

    public void remove(Produto p1){
       catalogo.remove( p1.getId(), p1);
    }

    public Produto getProduto(Produto p1){
        return catalogo.get(p1.getId());
    }

    public Produto updateProduto(Produto p1){

    }


    @Override
    public String toString() {
        return "ProdutoRepository{" +
                "catalogo=" + catalogo +
                '}';
    }
}
