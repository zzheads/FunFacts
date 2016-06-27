package com.example.zzhea.funfacts;

import android.graphics.Color;

import java.io.StringBufferInputStream;
import java.util.Random;

/**
 * Created by zzhea on 22.06.2016.
 */
public class ColorBook {
    // Fields (Member Variables) - Propierties about the object
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Methods - Actions the object can take

    public int getColor() {
        // Randomly select a fact
        Random randomGenerator = new Random() ;
        int randomNumber  = randomGenerator.nextInt(mColors.length);
        int colorAsInt = Color.parseColor(mColors[randomNumber]);

        return (colorAsInt);
    }

}
