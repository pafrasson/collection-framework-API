package main.java.list.ExercicioOpBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();
        for (Tarefa t :tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemove.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemove);
    }
}