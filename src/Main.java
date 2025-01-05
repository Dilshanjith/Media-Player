import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("My Video Player");
            primaryStage.setScene(new Scene(root, 801, 448));
            primaryStage.show();
        } catch (Exception e) {
            // Handle any exceptions and print the stack trace for debugging
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
