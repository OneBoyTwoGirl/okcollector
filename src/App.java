/*
 * File: App.java
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


import controllers.CollectorController;
import controllers.MainController;
import controllers.WordsController;
import views.MainWindow;

public class App {
public static void main(String[] args) throws Exception {
MainWindow mainWindow = new MainWindow();
new MainController(mainWindow);
new CollectorController(mainWindow);
new WordsController(mainWindow);
mainWindow.setVisible(true);
}
}
