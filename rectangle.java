
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class rectangle extends shapeObserver{
    private Rectangle r;
    
    public rectangle(shape s ,double x , double y , double width , double height , Color stroke , Color fill) {
        r = new Rectangle();
        r.setX(x);
        r.setY(y);
        r.setWidth(width);
        r.setHeight(height);
        this.setStroke(stroke);
        this.setFill(fill);
        s.addShape(r);
    }
    
    @Override
    void setStroke(Color c) {
        r.setStroke(c);
    }

    @Override
    void setFill(Color c) {
        r.setFill(c);
    }

    
}
