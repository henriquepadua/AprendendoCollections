import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


class Stream {
   public static void main(String[] args){

    List<String> vagabundos = new ArrayList<>();

    vagabundos.add("Henrique");
    vagabundos.add("Marcos");
    vagabundos.add("Leonardo");
    vagabundos.add("Paulo");

    System.out.println("Comecando a novela" + vagabundos.stream().max(Comparator.comparingInt(String::length)));

    System.out.println("Vai Pantanal" + vagabundos.stream().map(vagabundo -> vagabundo.concat("Vem danada").concat(String.valueOf(vagabundo.length()))).collect(Collectors.toList()));

    System.out.println("Vem gracinha" + vagabundos.stream().filter(vagabundo -> vagabundo.toUpperCase().contains("H")).collect(Collectors.toList()));
    
    System.out.println("Vem gracinha" + vagabundos.stream().limit(1).collect(Collectors.toList()));

    System.out.println("Tenta Pegar na esquina" + vagabundos.stream().peek(System.out::println).collect(Collectors.toList()));

    System.out.println("Pega na esquina" + vagabundos.stream().allMatch(vagabundo -> vagabundo.contains("o")))  ;

    System.out.println("Vai pegar nunca" + vagabundos.stream().anyMatch(vagabundo -> vagabundo.contains("H")));

    System.out.println("Vai pegar nunca" + vagabundos.stream().noneMatch(vagabundo -> vagabundo.contains("Y")));

    System.out.println("Tenta pegar esse" );
    
    vagabundos.stream().findFirst().ifPresent(System.out::println);

    System.out.println("Tudo junto e misturado");

    System.out.println(vagabundos.stream()
        .peek(System.out::println)
        .map(vagabundo ->
             vagabundo.concat("--").concat(String.valueOf(vagabundo.length())))
             .peek(System.out::println)
             .filter(vagabundo -> 
                    vagabundo.toLowerCase().contains("a"))
             //.collect(Collectors.toList()));
                //.collect(Collectors.joining(",")));
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(vagabundo -> vagabundo.substring(vagabundo.indexOf("-")+1))));

   }
}