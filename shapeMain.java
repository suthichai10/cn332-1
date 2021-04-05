
import javafx.application.Application;
import javafx.stage.Stage;
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
public class shapeMain extends Application{
    
    public void start(Stage stage) {
        shape s = new shape();
        new ellipse(s ,100 , 120, 20,20 , Color.BLUE , Color.RED);
        new rectangle(s,80 , 70, 20,20 , Color.GREEN , Color.BLACK);
        s.reShape(100,130);
        stage.setScene(s.getScene());
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
