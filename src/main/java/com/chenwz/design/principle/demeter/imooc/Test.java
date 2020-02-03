package com.chenwz.design.principle.demeter.imooc;

/**
 * 迪米特法则
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
