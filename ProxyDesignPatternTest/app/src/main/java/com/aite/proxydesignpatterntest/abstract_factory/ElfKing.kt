package com.aite.proxydesignpatterntest.abstract_factory

class ElfKing : King{
    companion object {
        const val DESCRIPTION = "This is the Elven king!"
    }
    override fun getDescription() = DESCRIPTION
}