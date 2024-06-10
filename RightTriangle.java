package mvctextview;

import java.util.Observable;

public class RightTriangle extends Observable {
    private double base;
    private double height;
    private double hypotenuse;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        setHypotenuse();
    }

    public void setBase(double newBase){
        this.base = newBase;
        setHypotenuse();
    }

    public double getBase (){
        return this.base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
        setHypotenuse();
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse() {
        this.hypotenuse = Math.sqrt(
                (base*base) + (height*height));
        setChanged();
        notifyObservers();
    }
} // end RightTriangle
