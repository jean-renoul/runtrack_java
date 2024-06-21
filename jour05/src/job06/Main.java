package job06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

public class Main extends Application {
    public void start(Stage stage) {
        try {
            stage.setTitle("FlowPane");

            Label label = new Label("Nom : ");

            TextField textField = new TextField();

            Button button = new Button("Envoyer");

            ComboBox<String> itemsComboBox = new ComboBox<>();
            itemsComboBox.getItems().addAll("Label", "TextField", "Button");

            ComboBox<String> colorsComboBox = new ComboBox<>();
            colorsComboBox.getItems().addAll("Red", "Green", "Blue");

            // Set the color chosen to the item

            button.setOnAction(e -> {
                String item = itemsComboBox.getValue();
                String color = colorsComboBox.getValue();

                if (item.equals("Label")) {
                    label.setStyle("-fx-background-color: " + color);
                } else if (item.equals("TextField")) {
                    textField.setStyle("-fx-background-color: " + color);
                } else if (item.equals("Button")) {
                    button.setStyle("-fx-background-color: " + color);
                }
                try {
                System.out.println(itemsComboBox.getValue() + " " + colorsComboBox.getValue());
                } catch (Exception ex) {
                    System.out.println("No item selected");
                }
            });

            FlowPane flowPane = new FlowPane(itemsComboBox, colorsComboBox, label, textField, button);

            Scene scene = new Scene(flowPane, 400, 300);

            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

            stage.setScene(scene);

            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
