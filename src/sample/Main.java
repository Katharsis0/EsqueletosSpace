package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage settingsStage){
        try {

            Stage stage= new Stage(StageStyle.DECORATED);
            stage.setTitle("Settings");
            BorderPane root= new BorderPane();
            Scene scene= new Scene(root,800,750);
            stage.setScene(scene);
            //settingsStage.show();
            stage.show();

        }catch (Exception e){

            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);}
}
