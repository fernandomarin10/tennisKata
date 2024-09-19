package com.sergiotrapiello.cursotesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class KataTennisTest {

    @Test
    void whenStartedGame_PointsShoudlBe0(){

        KataTennis kataTennis = new KataTennis();

        Assertions.assertEquals(0, kataTennis.getPlayerPoint());
        Assertions.assertEquals(0, kataTennis.getServerPoint());

    }

    @Test
    void whenServerMakePoint_PointServerShouldBe15(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.serverMakePoint();

        Assertions.assertEquals(0, kataTennis.getPlayerPoint());
        Assertions.assertEquals(15, kataTennis.getServerPoint());
    }
    @Test
    void whenServerMakePoint_PointServerShouldBe30(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();

        Assertions.assertEquals(0, kataTennis.getPlayerPoint());
        Assertions.assertEquals(30, kataTennis.getServerPoint());
    }
    @Test
    void whenServerMakePoint_PointServerShouldBe40(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();

        Assertions.assertEquals(0, kataTennis.getPlayerPoint());
        Assertions.assertEquals(40, kataTennis.getServerPoint());
    }

    @Test
    void whenServerMakePoint_PointServerShouldBeA(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();


        Assertions.assertEquals(0, kataTennis.getPlayerPoint());
        Assertions.assertEquals(50, kataTennis.getServerPoint());
        Assertions.assertEquals(true, kataTennis.isServerIsWinner());
    }

    @Test
    void whenServerMakePoint_PointServerShouldBeAInfo(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();
        kataTennis.serverMakePoint();


        Assertions.assertEquals(0, kataTennis.getPlayerPoint());
        Assertions.assertEquals(50, kataTennis.getServerPoint());
        Assertions.assertEquals(true, kataTennis.isServerIsWinner());
        Assertions.assertEquals("Game is 40:0", kataTennis.getGameStatus());

    }

    @Test
    void whenPlayerMakePoint_PointServerShouldBe15(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.playerMakePoint();

        Assertions.assertEquals(15, kataTennis.getPlayerPoint());
        Assertions.assertEquals(0, kataTennis.getServerPoint());
    }

    @Test
    void whenPlayerMakePoint_PointServerShouldBe30(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.playerMakePoint();
        kataTennis.playerMakePoint();

        Assertions.assertEquals(30, kataTennis.getPlayerPoint());
        Assertions.assertEquals(0, kataTennis.getServerPoint());
    }

    @Test
    void whenPlayerMakePoint_PointServerShouldBe40(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.playerMakePoint();
        kataTennis.playerMakePoint();
        kataTennis.playerMakePoint();


        Assertions.assertEquals(40, kataTennis.getPlayerPoint());
        Assertions.assertEquals(0, kataTennis.getServerPoint());
    }

    @Test
    void whenServerMakePoint_PointPlayerShouldBeAInfo(){
        KataTennis kataTennis = new KataTennis();

        kataTennis.playerMakePoint();
        kataTennis.playerMakePoint();
        kataTennis.playerMakePoint();
        kataTennis.playerMakePoint();


        Assertions.assertEquals(0, kataTennis.getServerPoint());
        Assertions.assertEquals(50, kataTennis.getPlayerPoint());
        Assertions.assertEquals(true, kataTennis.isPlayerIsWinner());
        Assertions.assertEquals("Game is 0:40", kataTennis.getGameStatus());

    }

}
