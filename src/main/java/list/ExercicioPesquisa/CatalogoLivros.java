package main.java.list.ExercicioPesquisa;

import main.java.list.ExercicioOpBasicas.Item;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrolist;

    public CatalogoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int ano) {
        Livro livro = new Livro(nome, ano, autor);
        livrolist.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> intervaloAnos = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    intervaloAnos.add(l);
                }
            }
        }
        return intervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist) {
                if (l.getNome().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Roberto", 1990);
        catalogoLivros.adicionarLivro("Livro 2", "Quinto", 2004);
        catalogoLivros.adicionarLivro("Livro 3", "Pedro", 2003);

        System.out.println(catalogoLivros.pesquisarPorAutor("Quinto"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990,2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
    }
}