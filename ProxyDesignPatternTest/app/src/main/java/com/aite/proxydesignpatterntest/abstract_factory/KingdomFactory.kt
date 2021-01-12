package com.aite.proxydesignpatterntest.abstract_factory

interface KingdomFactory {
    fun createCastle():Castle

    fun createKing():King

    fun createArmy():Army
}