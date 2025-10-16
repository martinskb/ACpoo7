public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido();

        p.item1.produto = "Teclado";
        p.item1.quantidade = 2;
        p.item1.preco = 120.0;

        p.item2.produto = "Mouse";
        p.item2.quantidade = 1;
        p.item2.preco = 80.0;

        double total = (p.item1.quantidade * p.item1.preco) +
                (p.item2.quantidade * p.item2.preco);

        System.out.println("Produto 1: " + p.item1.produto);
        System.out.println("Produto 2: " + p.item2.produto);
        System.out.println("Valor total: " + total);
    }
}
