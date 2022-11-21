/*
 * File: StatusBar.java
 * Created Date: 2021-09-24 10:39:45
 * Author: Serényi Zsolt Ödön
 * Github: https://github.com/OneBoyTwoGirl
 * -----
 * Last Modified: 2022-11-21
 * Modified By: Serényi Zsolt Ödön
 * -----
 * Copyright (c) 2022 Serényi Zsolt Ödön
 * 
 * GNU GPL v2
 */

package views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class StatusBar extends JPanel {

    JLabel statusLabel;

    
    public StatusBar(int width) {        
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        size(width, 25);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        statusLabel = new JLabel("Kész");
        this.setm("Kész");
        this.add(statusLabel);
    } 
    
    
    public void size(int x, int y) {
        
        setMaximumSize(new Dimension(x, y));
        setMinimumSize(new Dimension(x, y));
        setPreferredSize(new Dimension(x, y));
    } 

    
    public void setm(String message) {
       
        this.statusLabel.setText(message);
    } 
}
