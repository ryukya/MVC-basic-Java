/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m1;
import view.v2;

/**
 *
 * @author S855
 */
public class c2 {

    m1 ac = new m1();
    v2 sistem = new v2();
    
    public c2() {
        sistem.setVisible(true);
       sistem.setawal();
        this.sistem.Listenerreset(new tombolReset());
        this.sistem.ListenerTambah(new tombolTambah());
        this.sistem.ListenerOut(new tombolOut());
    }
    
    class tombolReset implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            sistem.setawal();
        }
    }
    
    class tombolOut implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            sistem.setVisible(false);
            c1 miaow = new c1();
        }
    }
    
    class tombolTambah implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = sistem.getdata();
            int b = ac.tanbahdata(a);
            sistem.setdata(b);
        }
        
    }
}
