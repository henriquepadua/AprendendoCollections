import java.util.Comparator;
import java.util.TreeSet;



public class TreeS {
    public static void main(String[] args){
        TreeSet<String> arvoreDoAmor = new TreeSet<>();
        TreeSet<String> arvoreDoSexo = new TreeSet<>();

        arvoreDoAmor.add("Luiza");//arvoreDoAmor.add("Luiza");
        arvoreDoAmor.add("Yasmin");
        arvoreDoAmor.add("Eduarda");

        System.out.println(arvoreDoAmor);

        System.out.println(arvoreDoAmor.first());

        System.out.println(arvoreDoAmor);

        System.out.println(arvoreDoAmor.subSet("Luiza", "Yasmim"));

        System.out.println(arvoreDoAmor);

        System.out.println(arvoreDoAmor.tailSet("Luiza"));

        System.out.println(arvoreDoAmor);

        System.out.println(arvoreDoAmor.ceiling("Eduar"));

        System.out.println(arvoreDoAmor);

        System.out.println(arvoreDoAmor.floor("Luiza"));

        System.out.println(arvoreDoAmor);
    }
    
}
