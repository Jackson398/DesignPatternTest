package com.aite.proxydesignpatterntest.observer;

import com.aite.commonlib.ConsoleUtil;

import org.junit.Test;

public class Main {

    @Test
    public void updateTest() {
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // Generic observer inspired by Java Generics and Collection by Naftalin & Wadler
        ConsoleUtil.out("\n--Running generic version--");
//        GWeather gWeather = new GWeather();
//        gWeather.addObserver(new GOrcs());
//        gWeather.addObserver(new GHobbits());
//
//        gWeather.timePasses();
//        gWeather.timePasses();
//        gWeather.timePasses();
//        gWeather.timePasses();
    }
}
