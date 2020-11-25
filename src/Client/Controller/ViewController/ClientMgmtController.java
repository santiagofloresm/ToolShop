package Client.Controller.ViewController;

import Client.Controller.ClientController.ClientController;
import Client.View.ToolShopGUI;
import Server.Model.Customer;
import Server.Model.CustomerList;
import Server.Model.Message;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMgmtController {

    private ToolShopGUI gui;
    private CardLayout cardLayout;
    private ClientController clientController;

    public ClientMgmtController(ToolShopGUI gui, ClientController clientController) {
        setGui(gui);
        setClientController(clientController);
        cardLayout = (CardLayout) gui.getRootPanel().getLayout();
        gui.addButtonActionListener(gui.getGoToToolsButton(), new ToolCardListener());
        gui.addButtonActionListener(gui.getClearButton1(), new ClearButton1());
        gui.addButtonActionListener(gui.getClearButton(), new ClearButton());
        gui.addButtonActionListener(gui.getSearchButton(), new SearchButton());
    }

    public void updateGUIResults(CustomerList customerList) {
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Customer customer : customerList.getCustomerList())
            model.addElement(customer.toString());

        gui.getList2().setModel(model);
    }

    public void setGui(ToolShopGUI gui) {
        this.gui = gui;
    }

    public ClientController getClientController() {
        return clientController;
    }

    public void setClientController(ClientController clientController) {
        this.clientController = clientController;
    }

    class ToolCardListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            cardLayout.show(gui.getRootPanel(), "ToolCard");
        }
    }

    class ClearButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            gui.getTextField8().setText("");
            DefaultListModel<String> model = new DefaultListModel<>();
            gui.getList2().setModel(model);
            gui.getButtonGroup().clearSelection();
        }
    }

    class ClearButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            gui.getTextField1().setText("");
            gui.getTextField2().setText("");
            gui.getTextField3().setText("");
            gui.getTextField4().setText("");
            gui.getTextField5().setText("");
            gui.getTextField6().setText("");
            gui.getTextField7().setText("");
        }
    }

    class SearchButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (gui.getCustomerIDRadioButton().isSelected()) {
                String message = "customerId-" + gui.getTextField8().getText();
                clientController.sendMessage(new Message(message));
            }
            else if (gui.getLastNameRadioButton().isSelected()) {
                String message = "customerLName-" + gui.getTextField8().getText();
                clientController.sendMessage(new Message(message));
            }
            else if (gui.getClientTypeRadioButton().isSelected()) {
                String message = "customerType-" + gui.getTextField8().getText();
                clientController.sendMessage(new Message(message));
            }
        }
    }
}
