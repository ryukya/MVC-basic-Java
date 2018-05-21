/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v1;
import view.v2;

/**
 *
 * @author S855
 */
public class c1 {

    v1 start = new v1();
    v2 out = new v2();

    public c1() {
        start.setVisible(true);
        this.start.ListenerMulai(new tombolStart());
    }

    class tombolStart implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            start.setVisible(false);
            c2 sistem = new c2();
        }

    }

}
