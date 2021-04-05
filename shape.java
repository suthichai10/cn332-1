
import java.util.ArrayList;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class shape {
    private Group group;
    private Scene scene;
    public shape() {
        group = new Group();
        scene = new Scene(group,450,450,Color.AQUA);
    }
    public void addShape(Shape s) {
        group.getChildren().add(s);        
    }
    
    public Scene getScene() {
        return scene;
    }
    
    public void reShape(double x , double y) {
        for(Node n : group.getChildren()) {
            if(n instanceof Ellipse) {
                Ellipse c = (Ellipse)n;
                c.setRadiusX(x);
                c.setRadiusY(y);
            }
            else if(n instanceof Rectangle) {
                Rectangle r = (Rectangle)n;
                r.setWidth(x);
                r.setHeight(y);
            }
        }
    }
}
