package List;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;


public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
}

public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
}

public void removerTarefa(String descricao) {
    List<Tarefa> tarefasremover = new ArrayList<>();
    for (Tarefa tarefa : tarefaList) {
        if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
            tarefasremover.add(tarefa);
        }
    }
    tarefaList.removeAll(tarefasremover);
}

public int obterNumeroTarefas() {
    return tarefaList.size();
}

public void obterDescricoes() {
    System.out.println(tarefaList);
}

}

