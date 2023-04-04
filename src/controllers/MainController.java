/*
* File: MainController.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-04-04
* Github: https://github.com/AdamSulan/testterfogat.git
* Licenc: GNU GPL
*/

package controllers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    
    MainModel mainModel;
    public MainController(){
        this.mainPanel=new MainPanel();
        this.mainModel=new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            double spaceDiagonal=Double.parseDouble(this.mainPanel.getSpaceDiagonalPanel().getValue());
            double volume=this.mainModel.calcVolume(spaceDiagonal);
            mainPanel.getVolumePanel().setValue(String.valueOf(volume));
        });
    }
}
