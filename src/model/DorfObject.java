package model;

import java.awt.*;

public class DorfObject implements ImageObject{

    private String name;
    protected double x, y, width, height;
    private Image image;
    protected Dorf dorf;

    protected boolean dead;


    public DorfObject(String name, double x, double y, double width, double height, Image image, Dorf dorf){
        super();
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = image;
        this.dorf = dorf;

    }

    public void shot(int x, int y){
        //überprüfen liegt x und y in der hitbox, wenn ja dead auf true setzen
    }



    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public Image getImage() {
        return image;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void move() {

    }
}