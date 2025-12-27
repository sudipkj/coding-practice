package practice.code;

import org.junit.jupiter.api.Test;
import practice.reactiveprogramming.FluxAndMonoGenerator;
import reactor.test.StepVerifier;

public class FluxAndMonoGeneratorTest {
    FluxAndMonoGenerator fluxAndMonoGenerator = new FluxAndMonoGenerator();

    @Test
    public void testGetFluxNames(){
        var namesFlux = fluxAndMonoGenerator.getFluxNames();
        StepVerifier.create(namesFlux)
                .expectNext("Amar")
                .expectNextCount(3)
                .verifyComplete();
    }
}
