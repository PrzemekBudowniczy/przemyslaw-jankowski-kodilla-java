package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemp() {
        double averageTemp;
        int numberOfObservations = 0;
        double temperatureSum = 0;
//        Map<String, Double> allTemperatures = temperatures.getTemperatures();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureSum += temperature.getValue();
            numberOfObservations += 1;
        }

        averageTemp = temperatureSum/numberOfObservations;

        return  averageTemp;
    }

    public double calculateMedianTemp() {
        double median = 0;
        double average = 0;
        List<Double> allTemp = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            allTemp.add(temperature.getValue());
        }

        Collections.sort(allTemp);

        if (allTemp.size() % 2 == 0) {
            median = allTemp.get(allTemp.size()/2 - 1) + allTemp.get(allTemp.size()/2);
            return median;
        } else {
            median = allTemp.get(allTemp.size()/2);
            return  median;
        }
    }
}
