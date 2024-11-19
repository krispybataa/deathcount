module org.example.deathcount {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.deathcount to javafx.fxml;
    exports org.example.deathcount;
}