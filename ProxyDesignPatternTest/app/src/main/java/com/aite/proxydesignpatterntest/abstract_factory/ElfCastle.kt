package com.aite.proxydesignpatterntest.abstract_factory

class ElfCastle: Castle {
    companion object {
        const val  DESCRIPTION = "This is the Elven castle!"
    }
    override fun getDescription() = DESCRIPTION
}