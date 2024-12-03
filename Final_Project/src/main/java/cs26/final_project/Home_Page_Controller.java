package cs26.final_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;
import javafx.scene.input.MouseEvent;

public class Home_Page_Controller {

    String title = "Dayaw Online Gift Shop";
    @FXML
    private ImageView Ad1;

    @FXML
    private ImageView ad2;

    @FXML
    private ImageView ad3;

    @FXML
    private ImageView ad4;

    @FXML
    private ImageView ad5;

    @FXML
    void logoImageClicked(MouseEvent event) {
        // Wrap the MouseEvent's source into an ActionEvent
        Node source = (Node) event.getSource();
        ActionEvent actionEvent = new ActionEvent(source, source);
        openPage(actionEvent, "Home_Page.fxml", title);
    }

    @FXML
    void shirt_button_click(ActionEvent event) {
        openPage(event, "Shirts_Page.fxml", title);
    }

    @FXML
    void barong_button_click(ActionEvent event) {
        openPage(event, "Barong_Page.fxml", title);
    }

    @FXML
    void bags_button_click(ActionEvent event) {
        openPage(event, "Bags_Page.fxml", title);
    }

    @FXML
    void accessories_button_click(ActionEvent event) {
        openPage(event, "Accessories_Page.fxml", title);
    }

    @FXML
    void delicacies_button_click(ActionEvent event) {
        openPage(event, "Delicacies_Page.fxml", title);
    }

    private void openPage(ActionEvent event, String fxmlFile, String title) {
        try {
            // Load the specified FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load());

            // Set up a new Stage
            Stage newStage = new Stage();
            newStage.setTitle(title);
            newStage.setScene(scene);
            newStage.show();

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



