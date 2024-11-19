package org.example.deathcount;

import org.example.deathcount.Counter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class CounterController {
    @FXML
    private Label deathLabel;
    @FXML
    private Button addDeath, resetDeath;
    private Counter counter = new Counter();

    @FXML
    public void initialize(){
        deathLabel.setVisible(false);
        addDeath.setOnAction(event -> handleAddButton());
        resetDeath.setOnAction(event -> handleResetButton());
    }

    @FXML
    public void handleAddButton(){
        deathLabel.setVisible(true);
        counter.addDeaths();

        deathLabel.setText(counter.toString());

    }

    @FXML
    public void handleResetButton(){
        counter.resetDeaths();
        deathLabel.setText(counter.toString());
    }

}
