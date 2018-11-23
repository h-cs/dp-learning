package com.hcs.flyweight;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 11:40
 */
public class FlyweightTest {

    private static final String[] COLORS = {
            "Red", "Green", "Blue", "White", "Black"
    };

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            System.out.print("-------" + i + "-------");
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
