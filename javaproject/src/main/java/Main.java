import Model.Europa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// how can I make a maven project integrated with javafx ????

public class Main  extends Application {

    Europa e  = new Europa();


    public void start (Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Test");
        primaryStage.setScene(new Scene(root));

        //javafx manually made
        //in progress

    }
}
