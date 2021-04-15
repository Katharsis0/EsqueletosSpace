package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/*/Creación de la ventana de ajustes.
public class Settings {
    public static void iniciarVentanaConfig(Stage configStage) throws FileNotFoundException {
        //Título de la ventana
        configStage.setTitle("Settings");
        //
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        configStage.setScene(new Scene(root, 600, 300));

        configStage.show();

        stage.showAndWait();



    }
 }
}
/*/
