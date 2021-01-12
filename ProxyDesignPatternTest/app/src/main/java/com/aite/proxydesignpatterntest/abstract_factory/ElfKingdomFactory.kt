package com.aite.proxydesignpatterntest.abstract_factory

class ElfKingdomFactory : KingdomFactory {
    override fun createCastle() = ElfCastle()
    override fun createKing() = ElfKing()
    override fun createArmy() = ElfArmy()
}