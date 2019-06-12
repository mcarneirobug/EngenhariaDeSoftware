package exe07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TarefasRealizadas {

    public static void tarefasRealizadas(int t, List<Tarefas> tarefas) {
        List<Tarefas> resposta = new ArrayList<Tarefas>();
        tarefas.sort(Comparator.comparingInt(Tarefas::getTempo));
        
        int somaTempo = 0;
        int cont = 0;

        while (tarefas.size() > resposta.size() && somaTempo + tarefas.get(cont).getTempo() <= t) {
            resposta.add(tarefas.get(cont));
            somaTempo += tarefas.get(cont).getTempo();
            cont++;
        }
        System.out.println();
        resposta.forEach(System.out::print);
        System.out.println();
    }
    
    public static void runTASK() {
        List<Tarefas> tarefas = new ArrayList<Tarefas>(6);
        
        tarefas.add(new Tarefas(5));
        tarefas.add(new Tarefas(15));
        tarefas.add(new Tarefas(10));
        tarefas.add(new Tarefas(15));
        tarefas.add(new Tarefas(12));
        tarefas.add(new Tarefas(10));
        
        tarefasRealizadas(100, tarefas);
    }
}