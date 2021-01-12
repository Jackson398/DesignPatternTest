package com.aite.proxydesignpatterntest.abstract_factory

class OrcKing : King {
    companion object {
        const val DESCRIPTION = "This is the Orc king!"
    }
    override fun getDescription() = DESCRIPTION
}