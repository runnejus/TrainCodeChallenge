package com.jrunnells.code.traincodechallenge.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainDataTest {

    TrainData trainData;

    @Before
    public void setup() {
        trainData = new TrainData();
    }

    @Test
    public void distanceBetweenAandBandC_equals9() {
        Integer distanceBetweenAandB = trainData.getRouteDistance("A", "B");
        Integer distanceBetweenBandC = trainData.getRouteDistance("B", "C");

        Integer totalDistance = distanceBetweenAandB + distanceBetweenBandC;

        Assert.assertEquals(totalDistance.intValue(), 9);
    }

    @Test
    public void distanceBetweenAandD_equals5() {
        Integer distance = trainData.getRouteDistance("A", "D");
        Assert.assertEquals(distance.intValue(), 5);
    }

    @Test
    public void distanceBetweenAandDandC_equals13() {
        Integer distanceBetweenAandD = trainData.getRouteDistance("A", "D");
        Integer distanceBetweenDandC = trainData.getRouteDistance("D", "C");

        Integer totalDistance = distanceBetweenAandD + distanceBetweenDandC;

        Assert.assertEquals(totalDistance.intValue(), 13);
    }

    @Test
    public void distanceBetweenAandEandBandCandD_equals22() {
        Integer distanceBetweenAandE = trainData.getRouteDistance("A", "E");
        Integer distanceBetweenEandB = trainData.getRouteDistance("E", "B");
        Integer distanceBetweenBandC = trainData.getRouteDistance("B", "C");
        Integer distanceBetweenCandD = trainData.getRouteDistance("C", "D");
        
        Integer totalDistance = distanceBetweenAandE + distanceBetweenEandB + distanceBetweenBandC + distanceBetweenCandD;

        Assert.assertEquals(totalDistance.intValue(), 22);
    } 

    @Test
    public void distanceBetweenAandEandD_notFound() {
        Integer distanceBetweenAandE = trainData.getRouteDistance("A", "E");
        Integer distanceBetweenEandD = trainData.getRouteDistance("E", "D");

        Assert.assertNotNull(distanceBetweenAandE);
        Assert.assertNull(distanceBetweenEandD);
    }
    

}