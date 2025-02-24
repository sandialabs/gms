package gms.core.featureprediction.plugins.implementations.signalfeaturepredictor;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AzimuthUncertaintyModel1dTest {

  @Test
  void testThrowsExceptionForNullDistances() throws IOException {

    //P file in this folder only has one distance value, which should
    //return a null distance array.

    Assertions.assertEquals("Uncertainty distance array cannot be null",
        Assertions.assertThrows(NullPointerException.class,
            () -> AzimuthUncertaintyModel1D.from("testinguncertainties/weirdearth")).getMessage());

  }

}
