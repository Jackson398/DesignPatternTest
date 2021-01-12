package com.aite.proxydesignpatterntest.abstract_factory

class OrcCastle: Castle {
    companion object {
        const val DESCRIPTION = "This is the Orc castle!"
    }
    override fun getDescription() = DESCRIPTION
}