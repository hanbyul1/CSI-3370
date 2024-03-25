/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitordrawingproblem;

/**
 *
 * @author kim2
 */
public class Rectangle extends Shape {
	
    public Rectangle(String name) {
            this.name = name;
    }

    public void draw() {

            while (pts.hasMoreElements()) {
                    pts.nextElement().draw();
            }

            System.out.println(name + " is created");
    }
	
}
