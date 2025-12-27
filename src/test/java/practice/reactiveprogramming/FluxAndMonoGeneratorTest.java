package practice.reactiveprogramming;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class FluxAndMonoGeneratorTest {

    @Test
    void getFluxNames_flatMap() {
        FluxAndMonoGenerator fluxAndMonoGenerator = new FluxAndMonoGenerator();
        StepVerifier.create(fluxAndMonoGenerator.getFluxNames_flatMap())
                .expectNextCount(8);
    }
}