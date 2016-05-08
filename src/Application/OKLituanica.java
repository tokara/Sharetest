/*
 You can comment here
 */
package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rolandas
 */
public class OKLituanica extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Resources/fxml/Member/LoginPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Orienteering Club Kristianstad");//changed here from liituanica till Kristianstad//
        stage.setScene(scene);
        stage.show();
    }  
}
