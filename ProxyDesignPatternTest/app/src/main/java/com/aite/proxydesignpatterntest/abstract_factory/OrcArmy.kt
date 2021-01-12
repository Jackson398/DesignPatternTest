package com.aite.proxydesignpatterntest.abstract_factory

class OrcArmy: Army {
    companion object {
        const val DESCRIPTION = "This is the Orc Army!"
    }
    override fun getDescription() = DESCRIPTION
}