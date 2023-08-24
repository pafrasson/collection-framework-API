package main.java.list.ExercicioPesquisa;

public class Livro {
    private String nome;
    private int ano;
    private String autor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", autor='" + autor + '\'' +
                '}';
    }

    public Livro(String nome, int ano, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }
}
