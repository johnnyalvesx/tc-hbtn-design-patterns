import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();


    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public void setItensDentroCaixa(HashSet<ItemPedido> itensDentroCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void setItensForaCaixa(HashSet<ItemPedido> itensForaCaixa) {
        this.itensForaCaixa = itensForaCaixa;
    }

    @Override
    public String toString() {

        String fora = "\tFora da Caixa:\n";
        for (ItemPedido itemPedido : itensForaCaixa) {
            fora += String.format("\t\t- %s %s\n", itemPedido.getTipo(), itemPedido.getNome());
        }

        String dentro = "\tDentro da Caixa:\n";
        for (ItemPedido itemPedido : itensDentroCaixa) {
            dentro += String.format("\t\t- %s %s\n", itemPedido.getTipo(), itemPedido.getNome());
        }

        return fora + dentro;
    }
}
