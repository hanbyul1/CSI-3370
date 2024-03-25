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

public class Picture extends DrawObject{
		
    Vector<DrawObject> elems = new Vector<DrawObject>();
    Enumeration<DrawObject> objs = elems.elements();

    public Picture(String name) {
            this.name = name;
    }

    public void draw() {

            while (objs.hasMoreElements()) {
                    objs.nextElement().draw();
            }

            System.out.println(name + " is created");
    }

    public void add(DrawObject o)
    {
            elems.addElement(o);
    }

    public Enumeration<DrawObject> getObjs() {
            return objs;
    }
	
}
