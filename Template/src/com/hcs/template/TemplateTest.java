package com.hcs.template;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 11:07
 */
public class TemplateTest {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
