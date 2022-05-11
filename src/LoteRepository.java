import exemplo.Lote;
import exemplo.Produto;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {

    Map<String, Lote> lotes = new HashMap<String,Lote>();

    public LoteRepository() {
    }

    public LoteRepository(Map<String, Lote> lotes) {
        this.lotes = lotes;
    }

   public void add(Lote l1){
       lotes.put( l1.getId(), l1);
   }

    public void remove(Lote l1){
        lotes.remove( l1.getId(), l1);
    }

    public Lote getProduto(Lote l1){
        return lotes.get(l1.getId());
    }
}
