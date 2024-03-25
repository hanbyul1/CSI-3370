/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingsolution;

/**
 *
 * @author kim2
 */
public class Line extends Shape{
	
    public Line(String name) {
            this.name = name;
    }

    public void accept(Visitor v) {
            v.visitLine(this);
    }

}

