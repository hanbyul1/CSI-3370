/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitordrawingsolution;

/**
 *
 * @author kim2
 */
import java.util.Enumeration;
import java.util.Vector;

public class VisitorDrawingSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            ObjectStructure os = new ObjectStructure();
            Picture p1 = new Picture ("Picture1");
            Line l1 = new Line ("Line1");
            Line l2 = new Line ("Line2");
            Point pt1 = new Point ("Point1");
            Point pt2 = new Point ("Point2");
            Point pt3 = new Point ("Point3");
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

            Visitor v = new DrawVisitor();

            while (elems.hasMoreElements())
            {
                    elems.nextElement().accept(v);
            }
    }
    
}
