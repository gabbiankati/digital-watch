package com.digitalwatch;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WatchController {

    @FXML
    private Label textTime;

    @FXML
    public void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formattedDate = time.format(formatterTime);
            textTime.setText(formattedDate);
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

}
