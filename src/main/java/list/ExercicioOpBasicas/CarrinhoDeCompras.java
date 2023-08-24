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
}
