package com.aite.proxydesignpatterntest.observer

enum class WeatherType {
    SUNNY, RAINY, WINDY, COLD;

    override fun toString(): String = this.name.toLowerCase()
}