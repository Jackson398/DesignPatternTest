package com.aite.proxydesignpatterntest.abstract_factory;

import com.aite.commonlib.ConsoleUtil;

import org.junit.Test;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.*;

public class Main {
    @Mock
    private King king;
    @Mock
    private Castle castle;
    @Mock
    private Army army;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    private void createKingdom(final KingdomFactory factory) {
        king = factory.createKing();
        castle = factory.createCastle();
        army = factory.createArmy();
    }

    @Test
    public void  getDescriptionTest() {
        createKingdom(new ElfKingdomFactory());
        ConsoleUtil.out(king.getDescription());
        ConsoleUtil.out(castle.getDescription());
        ConsoleUtil.out(army.getDescription());
        createKingdom(new OrcKingdomFactory());
        ConsoleUtil.out(king.getDescription());
        ConsoleUtil.out(castle.getDescription());
        ConsoleUtil.out(army.getDescription());
    }
}
