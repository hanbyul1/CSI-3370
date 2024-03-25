/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingsolution;

/**
 *
 * @author kim2
 */
public class Point extends DrawObject {
	
    public Point(String name) {
            this.name = name;
    }

    public void accept(Visitor v) {
            v.visitPoint(this);
    }

}

