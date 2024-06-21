package job04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Main extends Application {
    public void start(Stage stage) {
        try {
            stage.setTitle("FlowPane");

            Label label = new Label("Nom : ");

            TextField textField = new TextField();

            Button button = new Button("Envoyer");

            button.setOnAction(e -> System.exit(0));

            FlowPane flowPane = new FlowPane(label, textField, button);

            Scene scene = new Scene(flowPane, 400, 300);

            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

            stage.setScene(scene);

            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
