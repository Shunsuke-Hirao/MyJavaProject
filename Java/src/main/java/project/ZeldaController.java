package project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import java.util.ArrayList;

/**
 * The {@code ZeldaController} class is the controller for the Zelda-themed JavaFX application.
 * It handles the user interactions and updates the UI accordingly.
 */
public class ZeldaController {

    /**
     * The button that triggers an action when clicked.
     */
    @FXML
    private Button click;

    /**
     * The anchor pane that holds UI components.
     */
    @FXML
    private AnchorPane clicked;

    /**
     * The label that displays the description of the selected monster.
     */
    @FXML
    private Label description;

    /**
     * The label that displays the name of the selected monster.
     */
    @FXML
    private Label monsterName;

    /**
     * The button that resets the selection.
     */
    @FXML
    private Button reseted;

    /**
     * The ComboBox that allows users to select a location from a list.
     */
    @FXML
    private ComboBox<String> select;

    /**
     * Handles the selection action in the ComboBox.
     * This method is currently set up to display common locations from {@code ZeldaFetchData}.
     */
    @FXML
    public void selection() {
        // Display common_locations from ZeldaFetchData in the select ComboBox
//        select.getItems().addAll(zeldaFetchData..common_locations);
    }

    /**
     * Initializes the controller after its root element has been completely processed.
     * This method populates the ComboBox with data and sets up any necessary event handlers.
     */
    @FXML
    public void initialize() {
        populateComboBox();
//        selective();
    }

    /**
     * Populates the ComboBox with common locations fetched from the API.
     */
    private void populateComboBox() {
        ZeldaAPI zeldaAPI = new ZeldaAPI();
        ArrayList<String> common_locations = zeldaAPI.fetchTeams().data.common_locations;
        select.getItems().addAll(common_locations);
    }

    /**
     * Handles the action when an item is selected from the ComboBox.
     * This method is currently set up for future use.
     *
     * @param event The action event triggered by the user.
     */
    @FXML
    void onSelect(ActionEvent event) {
//        ZeldaAPI zeldaAPI = new ZeldaAPI();
//        ArrayList<String> common_locations = zeldaAPI.fetchTeams().data.common_locations;
//        select.getItems().addAll(common_locations);

    }

    /**
     * Handles the action when the button is clicked.
     * If a location is selected from the ComboBox, it loads another view.
     *
     * @param event The action event triggered by the user.
     */
    @FXML
    void onClick(ActionEvent event) {
        System.out.println("Button clicked! but select location first");
        String selectedOption = select.getSelectionModel().getSelectedItem();
        if (selectedOption != null) {
            System.out.println("Succeeded!");
            try {
                HelloApplication.loadAnotherView();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    /**
//     * Main method for testing the fetching of common locations.
//     * It fetches the data from the API and prints the common locations.
//     *
//     * @param args Command line arguments.
//     */
//    public static void main(String[] args) {
//        ZeldaAPI zeldaAPI = new ZeldaAPI();
//        zeldaAPI.fetchTeams();
//        ArrayList<String> common_locations = zeldaAPI.fetchTeams().data.common_locations;
//        System.out.println(common_locations);
//    }

}
