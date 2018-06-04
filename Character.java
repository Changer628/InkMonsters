package com.shelfspace.michael.inkmonsters;

import java.util.ArrayList;

/**
 * Created by Michael on 21/03/2018.
 */

public class Character {
    public ArrayList<MyObject> cards;

    static public class MyObject {
        public String name;
        public int baseValue;
        public String type;
        public String color;
        public String[] attributes;
    }
}
