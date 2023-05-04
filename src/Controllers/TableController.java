package Controllers;

import Interfaces.IConnector;

public class TableController{
    private static TableController controller;
    IConnector database = ConnectionController.getInstance();

    public static TableController getInstance(){
        if(controller == null){
            controller = new TableController();
        }
        return controller;
    }

}
