module com.lehuuhau.fxenglishapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lehuuhau.fxenglishapp to javafx.fxml;
    exports com.lehuuhau.fxenglishapp;
}
