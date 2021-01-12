package com.aite.proxydesignpatterntest.abstract_factory

class ElfArmy : Army {
    companion object {
        const val DESCRIPTION = "This is the Elven Army!"
    }
    override fun getDescription() = DESCRIPTION
}