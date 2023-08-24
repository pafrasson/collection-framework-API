package main.java.list.ExercicioOrdenacao;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        listaDePessoas.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Pedro", 20, 1.75);
        ordenacaoPessoas.adicionarPessoa("Gabriel", 24, 1.80);
        ordenacaoPessoas.adicionarPessoa("Wesley", 27, 1.73);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
