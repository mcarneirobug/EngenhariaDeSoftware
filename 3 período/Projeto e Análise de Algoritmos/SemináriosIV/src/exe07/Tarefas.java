package exe07;

public class Tarefas {

    private int tempoI;

    public Tarefas() {}

    public Tarefas(int tempo) {
        this.tempoI = tempo;
    }

    public int getTempo() {
        return this.tempoI;
    }

    public void setTempo(int tempo) {
        this.tempoI = tempo;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Tempo: " + this.getTempo() + " | ");
    	return sb.toString();
    }
}