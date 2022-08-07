import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Collections;

public class Comparetorr implements Comparable<Comparetorr>{

    private final String nomeMeliante;
    private final int meliante;

    public Comparetorr(String nomeMeliante,int meliante){
        this.nomeMeliante = nomeMeliante;
        this.meliante = meliante;
    }

    public String getnomeMeliante(){ return nomeMeliante;}

    public int getMeliante(){  return meliante;}

    @Override
    public String toString(){ return nomeMeliante + " -" + meliante;}

    @Override
    public int compareTo(Comparetorr i){ return this.getMeliante() - i.getMeliante();} 

    public class ReversoComparatorr implements Comparator<Comparetorr>{

        @Override
        public int compare(Comparetorr o1,Comparetorr o2 ){
            return o2.getMeliante() - o1.getMeliante();
        }
    
        /*@Override
        public String compare(Comparetorr o1,Comparetorr o2){
            return o2.getnomeMeliante().compareTo()o2.getnomeMeliante();
        }*/
    }

    //@Override
    //public String compareTo(Comparetorr s){return this.getnomeMeliante().compareTo(s.getnomeMeliante());}
}

class ReversoComparatorr implements Comparator<Comparetorr>{

    @Override
    public int compare(Comparetorr o1,Comparetorr o2 ){
        return o2.getMeliante() - o1.getMeliante();
    }

    /*@Override
    public String compare(Comparetorr o1,Comparetorr o2){
        return o2.getnomeMeliante().compareTo()o2.getnomeMeliante();
    }*/
}    



class Compila{
    public static void main(String[] args){
        List<Comparetorr> compara = new ArrayList<>();

        compara.add(new Comparetorr("Henrique", 20));
        compara.add(new Comparetorr("Leonardo", 35));
        compara.add(new Comparetorr("Antonia", 62));
        compara.add(new Comparetorr("Joao", 53));
        compara.add(new Comparetorr("Joaoa", 53));

        System.out.println("Iniciando ordenacao");

        System.out.println(compara);

        System.out.println("Ordenando");

        compara.sort((first,second) -> first.getMeliante() - second.getMeliante());

        System.out.println(compara);

        System.out.println("Ordenando naturalmente");

        compara.sort(Comparator.comparingInt(Comparetorr::getMeliante));

        System.out.println(compara);

        System.out.println("Ordenando resersamente");

        compara.sort(Comparator.comparingInt(Comparetorr::getMeliante).reversed());

        System.out.println(compara);

        System.out.println("Usando Comparable");

        Collections.sort(compara,new ReversoComparatorr());

        System.out.println(compara);
    }
}
