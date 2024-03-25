/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingsolution;

/**
 *
 * @author kim2
 */
public class DrawVisitor extends Visitor{
	
    DrawObject e;

    public void visitPicture(DrawObject o) {
            Picture p = (Picture) o;

            while (p.getObjs().hasMoreElements()) {

                    e = p.getObjs().nextElement();

                    if (e instanceof Rectangle) 
                            e.accept(this);
                    else if (e instanceof Line) 
                            e.accept(this);
                    else 
                            e.accept(this);
            }

            System.out.println(p.getName() + " is created");
    }

    public void visitLine(DrawObject o) {
            Line l = (Line) o;

            while (l.getPts().hasMoreElements()) {
                    l.getPts().nextElement().accept(this);;
            }

            System.out.println(l.getName() + " is created");

    }
    public void visitRectangle(DrawObject o) {
            Rectangle r = (Rectangle) o;

            while (r.getPts().hasMoreElements()) {
                    r.getPts().nextElement().accept(this);;
            }

            System.out.println(r.getName() + " is created");

    }
    public void visitPoint(DrawObject o) {
                    System.out.println(o.getName() + " is created");
    }
	
}

