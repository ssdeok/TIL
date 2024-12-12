package org.example;

class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int calculateArea(){
        return width * height;
    }

}