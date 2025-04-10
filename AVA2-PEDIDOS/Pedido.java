import java.util.Date;
import java.util.List;

public class Pedido {
    private String id;
    private Date dataHora;
    private String status;
    private double valorTotal;

    private Cliente cliente;
    private Vendedor vendedor;
    private List<ItemPedido> itens;

    public double calcularValorTotal() { return 0; }

    public void atualizarStatus(String novoStatus) {}

    public void adicionarItem(ItemPedido item) {}

    public void removerItem() {}

    public void aplicarDesconto() {}
}
