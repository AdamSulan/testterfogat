/*
* File: MainModel.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-04-04
* Github: https://github.com/AdamSulan/testterfogat.git
* Licenc: GNU GPL
*/

package models;

public class MainModel {
    public double calcVolume(double testAtlo){
        double volume=Math.pow(testAtlo, 3)/Math.pow(27, 1/2);
        return volume;
    }
}
