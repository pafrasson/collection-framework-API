package main.java.list.ExercicioOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public List <Integer> ordenarAscendente(){
        List<Integer> numero = new ArrayList<>(numeroList);
        Collections.sort(numero);
        return numero;
    }
    public List <Integer> ordenarDescendente(){
        List<Integer> numero = new ArrayList<>(numeroList);
        numero.sort(Collections.reverseOrder());
        return numero;
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordNum = new OrdenacaoNumeros();

        ordNum.adicionarNumero(5);
        ordNum.adicionarNumero(10);
        ordNum.adicionarNumero(3);
        ordNum.adicionarNumero(7);

        System.out.println(ordNum.ordenarAscendente());
        System.out.println(ordNum.ordenarDescendente());
    }
}
