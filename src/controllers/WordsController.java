/*
 * File: WordsController.java
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

package controllers;

import views.MainWindow;

public class WordsController {
    MainWindow mainWindow;
    
    public WordsController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitButton.addActionListener(event ->{
            System.exit(0);
        });
    }
    
}

