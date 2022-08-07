import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

class Lista{
    public static void main(String[] args){
        Queue<String> filaDoPao = new LinkedList<>();

        filaDoPao.add("Juliana");

        filaDoPao.add("Pedro");

        filaDoPao.add("Carlos");

        filaDoPao.add("Larissa");

        filaDoPao.add("Joao");

        Iterator fila = filaDoPao.iterator();

        fila.

        while(fila.hasNext()){
          System.out.print( fila.next() +" || ");
        }

        String primeiroaVazar = filaDoPao.peek();

        System.out.println();

        System.out.println(primeiroaVazar);

        System.out.println(filaDoPao);

        String primeiroVazando = filaDoPao.poll();

        System.out.println(primeiroVazando);

        System.out.println(filaDoPao);      

        filaDoPao.add("Daniel");

        System.out.println(1);

        System.out.println(filaDoPao.size());

        System.out.println(filaDoPao.isEmpty());

        System.out.println(filaDoPao.contains("Carlos"));
    }
}