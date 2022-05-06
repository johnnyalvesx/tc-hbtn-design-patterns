import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes() {
        List<String> lista = new ArrayList<>();
        lista.add("cafe");
        return lista;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
