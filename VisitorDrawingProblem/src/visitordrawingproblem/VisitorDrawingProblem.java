/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitordrawingproblem;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author kim2
 */
public class VisitorDrawingProblem {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            ObjectStructure os = new ObjectStructure();
            Picture p1 = new Picture ("piture1");
            Line l1 = new Line ("line1");
            Line l2 = new Line ("line2");
            Point pt1 = new Point ("point1");
            Point pt2 = new Point ("point2");
            Point pt3 = new Point ("point3");
            Point pt4 = new Point ("point4");

            l1.add(pt1);
            l1.add(pt2);
            l2.add(pt3);
            l2.add(pt4);
            p1.add(l1);
            p1.add(l2);
            os.add(p1);

            Vector<DrawObject> drawObjs = os.getObjectStructure();

            Enumeration<DrawObject> elems = drawObjs.elements();

            System.out.println("The object structure contains");

            while (elems.hasMoreElements())
            {
                    elems.nextElement().draw();
            }
    }
    
}
