/*
* File: App.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-04-04
* Github: https://github.com/AdamSulan/testterfogat.git
* Licenc: GNU GPL
*/

import controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        System.out.println("Sulan Ádám, SZOFT I-1-N, 2023.04.04.");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController=new MainController();
        Scene scene = new Scene(mainController.getMainPanel(),400,300);
        stage.setScene(scene);
        stage.show();        
        
    }
}
