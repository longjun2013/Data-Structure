package com.lukeliu.sandbox.com.lukeliu.sandbox.graph;

import com.lukeliu.sandbox.TrainStops;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class TrainStopsTest {
    @Test
    public void should_generate_5_stops() {
        TrainStops trainStops = new TrainStops();
        Assert.assertThat(trainStops.getStopsCount(), Matchers.is(5));
    }
}
