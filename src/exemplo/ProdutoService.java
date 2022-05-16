package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProdutoService {
    LoteRepository loteRepo;
    ProdutoRepository prodRepo;

    public List<Produto> listarProdsLotes(String nome){
        List<Lote> lotes = loteRepo.getAllLotes(); //criar método getALL no Repositório de lote
        List <Produto> prods = getProdsFromLotes(lotes); // criar o método getProdsFromLotes nessa classe
        List<Produto> prodok = getProdsByName(prods, nome);

    }

    public  List<Produto> listarProdByName(String name){
        List<Produto> prods = prodRepo.getAllProds(); //criar método getALL no Repositório de produto
        List<Produto> prodok = getProdsByName(prods, name);
    }

    private ArrayList<Produto> getProdsByName(List<Produto> produtos, String nomeProduto){
        ArrayList<Produto> listaNomes = new ArrayList<>();

        for(Produto p : produtos){
            if(p.getNome().contains(nomeProduto)) {
                listaNomes.add(p);
            }
        }
        return listaNomes;
    }

    private List<Produto> getProdsFromLotes(List<Lote> lotes){

    }



}
