/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingproblem;

/**
 *
 * @author kim2
 */
import java.util.Enumeration;
import java.util.Vector;

public abstract class Shape extends DrawObject{
    Vector<Point> elems = new Vector<Point>();
    Enumeration<Point> pts = elems.elements();

    public void add(Point p) {
            elems.addElement(p);
    }

    public Enumeration<Point> getPts(){
            return pts;
    }
}
