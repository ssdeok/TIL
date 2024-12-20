package org.example;

import org.w3c.dom.css.Rect;

class Rectangle {

    static  int angleCount = 4;

    int width;
    int height;

    Rectangle() {
//        this.width = 10;
//        this.height = 10;
        this(10, 10);
    }
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int calculateArea(){
        return width * height;
    }

    int function(){
        int value = 3;
        String word = "hha";
        return 1;
    }

}