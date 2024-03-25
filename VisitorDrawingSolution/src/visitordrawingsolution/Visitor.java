/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingsolution;

/**
 *
 * @author kim2
 */
public abstract class Visitor {
    public abstract void visitPicture(DrawObject o);
    public abstract void visitLine(DrawObject o);
    public abstract void visitRectangle(DrawObject o);
    public abstract void visitPoint(DrawObject o);
}

