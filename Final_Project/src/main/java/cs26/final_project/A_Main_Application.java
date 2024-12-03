package cs26.final_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class A_Main_Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(A_Main_Application.class.getResource("Home_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Dayaw Online Gift Shop");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}