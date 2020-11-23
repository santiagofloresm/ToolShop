package Server.Controller.ModelController;

import Server.Controller.DBController.DBController;
import Server.Controller.ServerController.ServerController;
import Server.Model.Shop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelController implements Runnable {

    ServerController serverController;
    DBController dbController;
    Shop theShop;
    private ResultSet rs;

    public ModelController(ServerController serverController,DBController dbController, Shop theShop) {
        setTheShop(theShop);
        setDbController(dbController);
        setServerController(serverController);
    }

    public void setServerController(ServerController serverController) {
        this.serverController = serverController;
    }

    public void setDbController(DBController dbController) {
        this.dbController = dbController;
    }

    public void setTheShop(Shop theShop) {
        this.theShop = theShop;
    }

    @Override
    public void run() {

        while (true) {
            String [] query = serverController.listenForQuery();
            if (query[0].equals("tool")){
                rs = dbController.searchToolById(Integer.parseInt(query[1])); //query in the form of "id tableName idType"
                try {
                    if (rs.next()) {
                        if (rs.getString("type").equals("non-electrical")) {
                            System.out.println(rs.getInt("toolId") + " " +
                                    rs.getString("name") + " " +
                                    rs.getString("type") + " " +
                                    rs.getInt("quantity") + " " +
                                    rs.getFloat("price") + " " +
                                    rs.getString("supplierId"));
                        } else {
                            System.out.println(rs.getInt("toolId") + " " +
                                    rs.getString("name") + " " +
                                    rs.getString("type") + " " +
                                    rs.getInt("quantity") + " " +
                                    rs.getFloat("price") + " " +
                                    rs.getString("supplierId") + " " +
                                    rs.getString("powerType"));
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
