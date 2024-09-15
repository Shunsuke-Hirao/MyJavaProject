package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * The {@code HelloApplication} class is the main entry point for the JavaFX application.
 * It sets up the primary stage and loads different views based on the methods called.
 */
public class HelloApplication extends Application {
    /**
     * The primary stage of the application.
     */
    private static Stage primaryStage;

    /**
     * The {@code start} method is called when the JavaFX application is launched.
     * It sets up the primary stage and loads the initial view.
     *
     * @param stage The primary stage provided by the JavaFX runtime.
     * @throws IOException If the FXML file cannot be loaded.
     */
    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.primaryStage = stage;
        primaryStage.setTitle("Search Monster!");
        primaryStage.setResizable(false);
        loadZeldaView();
        primaryStage.show();
    }

    /**
     * Loads the Zelda view and sets it as the current scene.
     *
     * @throws IOException If the FXML file cannot be loaded.
     */
    public static void loadZeldaView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("zelda-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        scene.getStylesheets().add(HelloApplication.class.getResource("app.css").toExternalForm());
        Image icon = new Image(Objects.requireNonNull(HelloApplication.class.getResourceAsStream("/project/images/icon.png")));
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(scene);
    }

    /**
     * Loads another view and sets it as the current scene.
     *
     * @throws IOException If the FXML file cannot be loaded.
     */
    public static void loadAnotherView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("zelda2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        scene.getStylesheets().add(HelloApplication.class.getResource("app.css").toExternalForm());
        Image icon = new Image(Objects.requireNonNull(HelloApplication.class.getResourceAsStream("/project/images/icon.png")));
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(scene);
    }

    /**
     * The main method is the entry point of the application.
     * It launches the JavaFX application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        launch();
    }
}
