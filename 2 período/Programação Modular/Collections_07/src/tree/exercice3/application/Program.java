package tree.exercice3.application;

/**
 * @author: Matheus
 * 07/05/2019
 */

public class Program {

   public static void main(String [] args) {

       Pilha<Integer> p = new Pilha<Integer>(10);
       p.push(-10);
       p.push(100);
       p.push(15);

       System.out.println(p.pop() + "\n" + p.pop() + "\n" + p.pop());

       try {
           Pilha<Data> p2 = new Pilha<Data>(10);

           p2.push(new Data(2017, 7, 12));
           p2.push(new Data(2017, 10, 8));
           p2.push(new Data(2017, 11, 5));

           System.out.println("\n" + p2.pop() + "\n" + p2.pop() + "\n" + p2.pop());

       } catch (ExceptionData e) {
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
       System.exit(0);
   }
}