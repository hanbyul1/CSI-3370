/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingproblem;

/**
 *
 * @author kim2
 */
import java.util.Vector;

public class ObjectStructure {
    Vector<DrawObject> os = new Vector<DrawObject>();

    public void add(DrawObject o) {
            os.addElement(o);
    }

    public void remove(DrawObject o) {
            os.removeElement(o);
    }

    public Vector<DrawObject> getObjectStructure() {
            return os;
    }
}
