package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.control.Label;

/**
 * The {@code ZeldaController2} class is the controller for the second view in the Zelda-themed JavaFX application.
 * It handles the display of monster details, such as name, image, and description.
 */
public class ZeldaController2 {

    /**
     * The {@code ImageView} component that displays the monster's image.
     */
    @FXML
    private ImageView viewed;

    /**
     * The {@code TextArea} component that displays the monster's description.
     */
    @FXML
    private TextArea description;

    /**
     * The {@code Button} component that navigates back to the main view.
     */
    @FXML
    private Button backBtn;

    /**
     * The {@code Label} component that displays the monster's name.
     */
    @FXML
    private Label nameMonster;

    /**
     * Initializes the controller after its root element has been completely processed.
     * This method displays the monster's name, image, and description.
     */
    @FXML
    public void initialize() {
        showImage();
        showDescription();
        showName();
    }

    /**
     * Displays the monster's name in the {@code Label} component.
     * This method fetches data from the Zelda API and sets the text of the {@code nameMonster} label.
     */
    public void showName() {
        ZeldaAPI zeldaAPI = new ZeldaAPI();
        String monName = zeldaAPI.fetchTeams().data.name;
        nameMonster.setText("Monster name is " + monName);
    }

    /**
     * Displays the monster's image in the {@code ImageView} component.
     * This method fetches data from the Zelda API and sets the image of the {@code viewed} image view.
     */
    public void showImage() {
        ZeldaAPI zeldaAPI = new ZeldaAPI();
        String urlImage = zeldaAPI.fetchTeams().data.image;
        Image image = new Image(String.valueOf(urlImage));
        viewed.setImage(image);
    }

    /**
     * Displays the monster's description in the {@code TextArea} component.
     * This method fetches data from the Zelda API and sets the text of the {@code description} text area.
     */
    public void showDescription() {
        ZeldaAPI zeldaAPI = new ZeldaAPI();
        String monDescription = zeldaAPI.fetchTeams().data.description;
        description.setVisible(true);
        description.setText(monDescription);
    }

    /**
     * Handles the action when the back button is clicked.
     * It navigates back to the main view of the application.
     *
     * @param event The action event triggered by the user.
     */
    @FXML
    void onBackBtn(ActionEvent event) {
        System.out.println("Move to main page!");
        try {
            HelloApplication.loadZeldaView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    /**
//     * Main method for testing the fetching and display of monster details.
//     * This method is commented out and intended for testing purposes.
//     *
//     * @param args Command line arguments.
//     */
//    public static void main(String[] args) {
//        ZeldaAPI zeldaAPI = new ZeldaAPI();
//        zeldaAPI.fetchTeams();
//        description.setVisible(true);
//        String monDescription = zeldaAPI.fetchTeams().data.description;
//        System.out.println(monDescription);
//    }
}
