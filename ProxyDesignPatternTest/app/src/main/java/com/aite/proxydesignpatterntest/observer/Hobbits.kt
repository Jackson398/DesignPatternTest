package com.aite.proxydesignpatterntest.observer

import com.aite.commonlib.ConsoleUtil

class Hobbits:WeatherObserver {
    override fun update(currentWeather: WeatherType) {
        when (currentWeather) {
            WeatherType.COLD -> ConsoleUtil.out("The hobbits are shivering in the cold weather.")
            WeatherType.RAINY -> ConsoleUtil.out("The hobbits look for cover from the rain.")
            WeatherType.SUNNY -> ConsoleUtil.out("The happy hobbits bade in the warm sun.")
            WeatherType.WINDY -> ConsoleUtil.out("The hobbits hold their hats tightly in the windy weather.")
        }
    }
}