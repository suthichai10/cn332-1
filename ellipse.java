
import java.util.HashSet;
import java.util.Set;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class ellipse extends shapeObserver{
    private Ellipse e;
    public ellipse(shape s ,double centerX , double centerY , double radiusX , double radiusY , Color stroke , Color fill) {
        e = new Ellipse();
        e.setCenterX(centerX);
        e.setCenterY(centerY);
        e.setRadiusX(radiusX);
        e.setRadiusY(radiusY);
        this.setStroke(stroke);
        this.setFill(fill);
        s.addShape(e);
    }
    @Override
    void setStroke(Color c) {
        e.setStroke(c);
    }

    @Override
    void setFill(Color c) {
        e.setFill(c);
    }
}
