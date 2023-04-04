/*
* File: MainPanel.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-04-04
* Github: https://github.com/AdamSulan/testterfogat.git
* Licenc: GNU GPL
*/

package views;

import com.github.suli2022.inputlib.ButtonPanel;
import com.github.suli2022.inputlib.InputPanel;
import com.github.suli2022.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
    TitlePanel titlePanel;
    InputPanel spaceDiagonalPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;

    public MainPanel(){
        this.titlePanel=new TitlePanel();
        this.spaceDiagonalPanel=new InputPanel();
        this.buttonPanel=new ButtonPanel();
        this.volumePanel=new InputPanel();

        this.titlePanel.setText("Kocka térfogata");
        this.spaceDiagonalPanel.setText("A kocka testátlója");
        this.buttonPanel.setCalcButtonText("Számít");
        this.volumePanel.setText("Terület");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.spaceDiagonalPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);
    }
    
    public TitlePanel getTitlePanel() {
        return titlePanel;
    }
    public InputPanel getSpaceDiagonalPanel() {
        return spaceDiagonalPanel;
    }
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public InputPanel getVolumePanel() {
        return volumePanel;
    }
}
