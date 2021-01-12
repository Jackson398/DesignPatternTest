package com.aite.proxydesignpatterntest.observer

import com.aite.commonlib.ConsoleUtil

class Weather {
    private var currentWeather: WeatherType? = null
    private var observers: ArrayList<WeatherObserver>? = null

    init {
        observers = ArrayList()
        currentWeather = WeatherType.SUNNY
    }

    fun addObserver(obs: WeatherObserver) {
        observers!!.add(obs)
    }

    fun removeObserver(obs: WeatherObserver) {
        observers!!.remove(obs)
    }

    fun timePasses() {
        var enumValues = WeatherType.values()
        currentWeather =  enumValues[(currentWeather!!.ordinal + 1) % enumValues.size]
        ConsoleUtil.out("The weather changed to $currentWeather.")
        notifyObservers()
    }

    private fun notifyObservers() {
        for (obs in observers!!) {
            obs.update(currentWeather!!)
        }
    }
}