import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Iterator;

import java.lang.Iterable;

class HashMapper {

    public static Stack<String> Siglas(Stack<String> siglas){

        siglas.add("AC");siglas.add("AL");
        siglas.add("AP");siglas.add("AM");
        siglas.add("BA");siglas.add("CE");
        siglas.add("DF");siglas.add("ES");
        siglas.add("GO");siglas.add("MA");
        siglas.add("MT");siglas.add("MS");
        siglas.add("MG");siglas.add("PA");
        siglas.add("PB");siglas.add("PR");
        siglas.add("PE");siglas.add("PI");
        siglas.add("RJ");siglas.add("RN");
        siglas.add("RS");siglas.add("RO");
        siglas.add("RR");siglas.add("SC");
        siglas.add("SP");siglas.add("SE");
        siglas.add("TO");
     
        int index = 0;

        Iterator sigla = siglas.iterator();

        while(sigla.hasNext()){
            siglas.setElementAt(siglas., index);
            index++;
        }

        System.out.println(siglas);
        return siglas;
    }
    public static void main(String[] args){
        Map<String,Integer> barreiro = new HashMap<>();
        Stack<String> siglas = new Stack<>();

        
        Siglas(siglas);

        /*

        System.out.println(barreiro.put("Rua tubarao", 65));
        System.out.println(barreiro);
        System.out.println(barreiro.getOrDefault(1, 0));
        System.out.println(barreiro.containsKey("Rua tubarao"));
        System.out.println(barreiro.compute("Rua tubarao", (k, v) -> (v == null) ? 1 : 2100));
        System.out.println(barreiro.entrySet());
        System.out.println(barreiro.get(1));

        */
    }
}
