package com.example.root.latihanstackwidget;

import java.util.Random;

public class NumberGenerator {
    public static int Generate(int max){

        Random random = new Random();
        int randomInt = random.nextInt(max);
        return randomInt;
    }
}
