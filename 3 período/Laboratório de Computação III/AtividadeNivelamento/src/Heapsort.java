/**
 * Ordene o vetor utilizando algum
 * algoritmo de ordena��o. Mostre o 
 * tempo necess�rio para ordenar.
 * 
 * Crie um m�todo para ordenar.
 */

class Heapsort extends Geracao {
	 
    /**
     * Construtor.
     */
   public Heapsort(){
      super();
   }
 
 
    /**
     * Construtor.
     * @param int tamanho do array de numeros inteiros.
     */
   public Heapsort(int tamanho){
      super(tamanho);
   }
 
 
   public static void constroi(int tamHeap){
      for(int i = tamHeap; i > 1 && array[i] > array[i/2]; i /= 2){
         swap(i, i/2);
      }
   }
 
  public static void reconstroi(int tamHeap){
      int i = 1, filho;
      while(i <= (tamHeap/2)){
 
         if (array[2*i] > array[2*i+1] || 2*i == tamHeap){
            filho = 2*i;
         } else {
            filho = 2*i + 1;
         }
 
         if(array[i] < array[filho]){
            swap(i, filho);
            i = filho;
         }else{
            i = tamHeap;
         }
      }
   }
 
    /**
     * Algoritmo de ordenacao Heapsort.
     */
    public static void heapsort() {
      //Alterar o vetor ignorando a posicao zero
      int[] tmp = new int[n+1];
      for(int i = 0; i < n; i++){
         tmp[i+1] = array[i];
      }
      array = tmp;
 
      //Contrucao do heap
      for(int tamHeap = 2; tamHeap <= n; tamHeap++){
         constroi(tamHeap);
      }
 
      for(int i = 1; i < tmp.length; i++){
         System.out.println(tmp[i]);
      }
 
      //Ordenacao propriamente dita
      int tamHeap = n;
      while(tamHeap > 1){
         swap(1, tamHeap--);
         reconstroi(tamHeap);
      }
 
      //Alterar o vetor para voltar a posicao zero
      tmp = array;
      array = new int[n];
      for(int i = 0; i < n; i++){
         array[i] = tmp[i+1];
      }
   }
 
 
    public static void main(String[] args) {
      Heapsort heapsort = new Heapsort(7);
      int vet[] = {20, 10, 5, 30, 50, 45, 35};
 
      	heapsort.entrada(vet);
        heapsort.mostrar();
         
        long comeco = now();
        heapsort.heapsort();
        long fim = now();
         
        heapsort.mostrar();
        System.out.println("Ordenado: " + heapsort.isOrdenado());
        System.out.println("Tempo para ordenar: " + (fim-comeco)/1000.0 + " s.");
    }
}