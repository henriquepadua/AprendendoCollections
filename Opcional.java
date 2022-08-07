import java.io.OptionalDataException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

class Opcional {
    public static void main(String[] args){
        Optional<String> optionalMorte = Optional.of("Not Existe");

        System.out.println("Talvez voce viva");
        optionalMorte.ifPresentOrElse(System.out::println, () -> System.out.println("Existe vida"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Quem sabe voce fique vivo(a)");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Vai morrer"));
        
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Quem sabe voce fique vivo(a)");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Vai morrer"));

        System.out.println("Qual a chance de voce morrer");
        OptionalDouble.of(13.100).ifPresent(System.out::println);

        Optional<String> optionalString = Optional.empty();

            /*System.out.println(optionalString.isPresent());
            String pegando = optionalString.get();
            System.out.println(pegando.concat("----------"));
            optionalString.map((valore) -> valore.concat("sdf")).ifPresent((System.out::println));
            System.out.println(optionalString);
            optionalString.orElse("Um maluco no pedacao");
            System.out.println(optionalString);*/
            optionalString.orElseThrow(IllegalStateException::new);
            System.out.println(optionalString); 
        
    }
}
