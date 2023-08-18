package main.java.list.ExercicioOpBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhodeitens;

    public CarrinhoDeCompras() {
        this.carrinhodeitens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhodeitens.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){

    }
}
