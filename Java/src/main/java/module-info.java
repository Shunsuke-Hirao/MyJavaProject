module practicegroup.assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens project to javafx.fxml;
    exports project;
}