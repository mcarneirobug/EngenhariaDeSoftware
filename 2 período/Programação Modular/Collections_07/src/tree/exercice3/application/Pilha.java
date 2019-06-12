package tree.exercice3.application;

/**
 * @author: Matheus
 * 07/05/2019
 */

public class Pilha < T > {

    private int max, topo;
    private T[] elementos;

    @SuppressWarnings("unchecked")
	public Pilha(int max) {
        topo = -1;
        this.max = max;
        elementos = (T[]) new Object[max];
    }

    public void push(T e) throws Error {
        if (topo < (max - 1)) elementos[++topo] = e;
        else throw new Error();
    }

    public T pop() throws Error {
        if (topo >= 0) return elementos[topo--];
        else throw new Error();
    }
}