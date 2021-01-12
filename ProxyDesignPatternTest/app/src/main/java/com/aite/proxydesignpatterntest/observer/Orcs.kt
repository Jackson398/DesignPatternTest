package com.aite.proxydesignpatterntest.observer

import com.aite.commonlib.ConsoleUtil

class Orcs : WeatherObserver {
    override fun update(currentWeather: WeatherType) {
        when (currentWeather) {
            WeatherType.COLD -> ConsoleUtil.out("The orcs are freezing cold.")
            WeatherType.RAINY -> ConsoleUtil.out("The orcs are dripping wet.")
            WeatherType.SUNNY -> ConsoleUtil.out("The sun hurts the orcs' eyes.")
            WeatherType.WINDY -> ConsoleUtil.out("The orc smell almost vanishes in the wind.")
        }
    }
}