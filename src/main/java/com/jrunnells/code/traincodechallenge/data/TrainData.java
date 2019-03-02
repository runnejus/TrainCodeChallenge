package com.jrunnells.code.traincodechallenge.data;

import java.util.HashMap;
import java.util.Map;

public class TrainData {

    //Graph: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
    Map<String, Integer> routesWithDistance;

    public TrainData() {
        routesWithDistance = new HashMap<>();

        loadData();
    }

    private void loadData() {
        routesWithDistance.put("AB", 5);
        routesWithDistance.put("BC", 4);
        routesWithDistance.put("CD", 8);
        routesWithDistance.put("DC", 8);
        routesWithDistance.put("DE", 6);
        routesWithDistance.put("AD", 5);
        routesWithDistance.put("CE", 2);
        routesWithDistance.put("EB", 3);
        routesWithDistance.put("AE", 7);
    }

    public Integer getRouteDistance(String origin, String destination) {
        return routesWithDistance.get(origin + destination);
    }
}