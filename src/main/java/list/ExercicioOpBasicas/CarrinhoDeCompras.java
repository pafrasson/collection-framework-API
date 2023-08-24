package main.java.list.ExercicioOpBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhodeitens;

    public CarrinhoDeCompras() {
        this.carrinhodeitens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        carrinhodeitens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhodeitens.isEmpty()) {
            for (Item i : carrinhodeitens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhodeitens.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhodeitens.isEmpty()) {
            for (Item item : carrinhodeitens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!carrinhodeitens.isEmpty()) {
            System.out.println(this.carrinhodeitens);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinhodeitens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
