/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.pbo.sistemperkuliahanmain;
import asia.pbo.sistemperkuliahan.ui.TextUI;
import asia.pbo.sistemperkuliahan.sistemlogic.SistemPerkuliahan;
/**
 *
 * @author A-15
 */
public class Main {
    public static void main(String[] args) {
        SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
        TextUI ui = new TextUI();
        ui.run();
    }
}
