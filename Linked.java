import java.util.Iterator;
import java.util.LinkedHashSet;

class Viagem{

}
class Linked{
    public static void main(String[] args)throws Exception{
        LinkedHashSet<String> usuario = new LinkedHashSet<>();
        Viagem v = new Viagem();
        usuario.add("Joao");
        usuario.add("Maria");
        usuario.add("Dom Bosco");

        System.out.println(usuario.add("oi"));
        //System.out.println(usuario.toArray(v));
    }
}
