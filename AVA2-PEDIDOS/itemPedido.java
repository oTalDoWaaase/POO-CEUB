public class ItemPedido {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public double getSubTotal() {
        return quantidade * precoUnitario;
    }
}
