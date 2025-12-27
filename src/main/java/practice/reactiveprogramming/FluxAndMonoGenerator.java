package practice.reactiveprogramming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static reactor.core.publisher.Flux.just;

public class FluxAndMonoGenerator {

    public Mono<String> getMonoName() {
        return Mono.just("Sudip");
    }

    public Flux<String> getFluxNames() {
//        retun Flux.just("Amar", "Prajakta", "Pratiksha", "Prachi");
        return Flux.fromIterable(List.of("Amar", "Prajakta", "Pratiksha", "Prachi"))
                .map(String::toUpperCase).filter(e -> e.startsWith("A")).log();
    }

    //flatMap with Flux -- return Flux of characters
    public Flux<String> getFluxNames_flatMap(){
        return Flux.fromIterable(List.of("Amar", "Prajakta", "Pratiksha", "Prachi", "Anil"))
                .filter(e-> e.length()==4)
                .flatMap(this:: getFluxNames_split).log();
    }

    public Flux<String> getFluxNames_split(String s){
        return Flux.just(s.split("")) ;
    }

    //concatMap
    public Flux<String> getFluxNames_concatMap(){
        return Flux.fromIterable(List.of("Amar", "Prajakta", "Pratiksha", "Prachi", "Anil"))
                .filter(e-> e.length()==4)
                .concatMap(this:: getFluxNames_split).log();
    }
    // transform


    public static void main(String[] args) {
        FluxAndMonoGenerator fluxAndMonoGenerator = new FluxAndMonoGenerator();

       /* fluxAndMonoGenerator.getMonoName()
                .subscribe(e -> System.out.println("Mono Name is : " + e));*/

        fluxAndMonoGenerator.getFluxNames_concatMap()
                .subscribe(e -> System.out.println("Name from Flux : " + e));

    }


}
