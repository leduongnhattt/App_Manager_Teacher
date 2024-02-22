/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 84818
 */
public class DeleteController implements ActionListener{

    public DeleteController(Home home) {
        this.home = home;
    }

    private Home home;
    @Override
    public void actionPerformed(ActionEvent e) {
        home.DeleteCBGV();
    }
    
}
