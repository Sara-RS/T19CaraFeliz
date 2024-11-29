package com.mycompany.t19.carafeliz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.QuadCurve;

public class PrimaryController {
    
     @FXML
    private QuadCurve boca;

    @FXML
    void Sonreir(ActionEvent event) {
        boca.setLayoutY(255);
        boca.setControlY(33);
    }
    
    
}
