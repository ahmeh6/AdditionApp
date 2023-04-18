module huzaifa.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens huzaifa.mavenproject1 to javafx.fxml;
    exports huzaifa.mavenproject1;
}
