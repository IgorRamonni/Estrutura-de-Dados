module br.com.martins {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.martins to javafx.fxml;
    exports br.com.martins;
}
