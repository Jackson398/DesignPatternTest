package com.aite.proxydesignpatterntest.observer

interface WeatherObserver {
    fun update(currentWeather: WeatherType)
}