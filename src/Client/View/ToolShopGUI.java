package Client.View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ToolShopGUI extends JFrame{
    private JPanel rootPanel;
    private JPanel clientPanel;
    private JPanel toolPanel;
    private JPanel leftPanel;
    private JLabel searchLabel;
    private JLabel parameterLabel;
    private JTextField textField8;
    private JButton searchButton;
    private JButton clearButton1;
    private JPanel rightPanel;
    private JLabel clientLabel;
    private JButton saveButton;
    private JTextField textField1;
    private JLabel clientIdLabel;
    private JTextField textField2;
    private JLabel fNameLabel;
    private JTextField textField3;
    private JLabel LNameLabel;
    private JTextField textField4;
    private JLabel addressLabel;
    private JTextField textField5;
    private JLabel postalCodeLabel;
    private JTextField textField6;
    private JLabel numberLabel;
    private JTextField textField7;
    private JLabel clientTypeLabel;
    private JButton clearButton;
    private JButton deleteButton;
    private JButton goToToolsButton;
    private JLabel typeSearchLabel;
    private JTextField textField9;
    private JButton searchButton1;
    private JButton clearButton2;
    private JButton goToCustomersButton;
    private JButton sellButton;
    private JRadioButton toolNameRadioButton;
    private JRadioButton toolIDRadioButton;
    private JRadioButton customerIDRadioButton;
    private JRadioButton lastNameRadioButton;
    private JRadioButton clientTypeRadioButton;
    private JRadioButton listAllToolsRadioButton;
    private JList list1;
    private JList list2;

    public void addButtonActionListener(JButton button, ActionListener actionListener) {
        button.addActionListener(actionListener);
    }

    public JButton getGoToToolsButton() {
        return goToToolsButton;
    }

    public JButton getGoToCustomersButton() {
        return goToCustomersButton;
    }

    public JButton getSearchButton1() {
        return searchButton1;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getClearButton1() {
        return clearButton1;
    }

    public JButton getClearButton2() {
        return clearButton2;
    }

    public JRadioButton getToolNameRadioButton() {
        return toolNameRadioButton;
    }

    public JRadioButton getToolIDRadioButton() {
        return toolIDRadioButton;
    }

    public JRadioButton getListAllToolsRadioButton() {
        return listAllToolsRadioButton;
    }

    public JTextField getTextField1() {
        return textField1;
    }
    public JTextField getTextField2() {
        return textField2;
    }
    public JTextField getTextField3() {
        return textField3;
    }
    public JTextField getTextField4() {
        return textField4;
    }
    public JTextField getTextField5() {
        return textField5;
    }
    public JTextField getTextField6() {
        return textField6;
    }
    public JTextField getTextField7() {
        return textField7;
    }
    public JTextField getTextField8() {
        return textField8;
    }
    public JTextField getTextField9() {
        return textField9;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JList getList1() {
        return list1;
    }

    public ToolShopGUI() {
        JFrame frame = new JFrame("CardLayoutGUI");
        frame.setContentPane(this.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
        // GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new CardLayout(0, 0));
        rootPanel.setMaximumSize(new Dimension(700, 500));
        rootPanel.setMinimumSize(new Dimension(500, 500));
        rootPanel.setOpaque(true);
        rootPanel.setPreferredSize(new Dimension(700, 500));
        clientPanel = new JPanel();
        clientPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        clientPanel.setMaximumSize(new Dimension(700, 500));
        clientPanel.setMinimumSize(new Dimension(700, 500));
        clientPanel.setPreferredSize(new Dimension(700, 500));
        rootPanel.add(clientPanel, "ClientCard");
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayoutManager(12, 3, new Insets(0, 0, 0, 0), -1, -1));
        clientPanel.add(leftPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(350, 500), new Dimension(350, 500), new Dimension(350, 500), 0, false));
        searchLabel = new JLabel();
        Font searchLabelFont = this.$$$getFont$$$(null, -1, 22, searchLabel.getFont());
        if (searchLabelFont != null) searchLabel.setFont(searchLabelFont);
        searchLabel.setText("Search Customers");
        leftPanel.add(searchLabel, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, -1, 16, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Select type of search to be performed:");
        leftPanel.add(label1, new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        leftPanel.add(spacer1, new GridConstraints(1, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(-1, 40), null, 0, false));
        final Spacer spacer2 = new Spacer();
        leftPanel.add(spacer2, new GridConstraints(6, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 20), null, 0, false));
        parameterLabel = new JLabel();
        Font parameterLabelFont = this.$$$getFont$$$(null, -1, 16, parameterLabel.getFont());
        if (parameterLabelFont != null) parameterLabel.setFont(parameterLabelFont);
        parameterLabel.setText("Enter the search parameter below:");
        leftPanel.add(parameterLabel, new GridConstraints(7, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField8 = new JTextField();
        leftPanel.add(textField8, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        searchButton = new JButton();
        searchButton.setText("Search");
        leftPanel.add(searchButton, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton1 = new JButton();
        clearButton1.setText("Clear");
        leftPanel.add(clearButton1, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, -1, 16, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("Search Results:");
        leftPanel.add(label2, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        leftPanel.add(scrollPane1, new GridConstraints(10, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(-1, 250), null, 0, false));
        list2 = new JList(new DefaultListModel());
        scrollPane1.setViewportView(list2);
        goToToolsButton = new JButton();
        goToToolsButton.setText("Go To Tools");
        leftPanel.add(goToToolsButton, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        customerIDRadioButton = new JRadioButton();
        Font customerIDRadioButtonFont = this.$$$getFont$$$(null, -1, 14, customerIDRadioButton.getFont());
        if (customerIDRadioButtonFont != null) customerIDRadioButton.setFont(customerIDRadioButtonFont);
        customerIDRadioButton.setText("Customer ID");
        leftPanel.add(customerIDRadioButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lastNameRadioButton = new JRadioButton();
        Font lastNameRadioButtonFont = this.$$$getFont$$$(null, -1, 14, lastNameRadioButton.getFont());
        if (lastNameRadioButtonFont != null) lastNameRadioButton.setFont(lastNameRadioButtonFont);
        lastNameRadioButton.setText("Last Name");
        leftPanel.add(lastNameRadioButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clientTypeRadioButton = new JRadioButton();
        Font clientTypeRadioButtonFont = this.$$$getFont$$$(null, -1, 14, clientTypeRadioButton.getFont());
        if (clientTypeRadioButtonFont != null) clientTypeRadioButton.setFont(clientTypeRadioButtonFont);
        clientTypeRadioButton.setText("Client Type");
        leftPanel.add(clientTypeRadioButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayoutManager(9, 3, new Insets(0, 0, 0, 0), -1, -1));
        clientPanel.add(rightPanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(350, 500), new Dimension(350, -1), null, 0, false));
        clientLabel = new JLabel();
        Font clientLabelFont = this.$$$getFont$$$(null, -1, 22, clientLabel.getFont());
        if (clientLabelFont != null) clientLabel.setFont(clientLabelFont);
        clientLabel.setText("Customer Information");
        rightPanel.add(clientLabel, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        saveButton = new JButton();
        saveButton.setText("Save");
        rightPanel.add(saveButton, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField1 = new JTextField();
        rightPanel.add(textField1, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        clientIdLabel = new JLabel();
        clientIdLabel.setText("Customer ID:");
        rightPanel.add(clientIdLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField2 = new JTextField();
        rightPanel.add(textField2, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        fNameLabel = new JLabel();
        fNameLabel.setText("First Name:");
        rightPanel.add(fNameLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField3 = new JTextField();
        rightPanel.add(textField3, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        LNameLabel = new JLabel();
        LNameLabel.setText("Last Name:");
        rightPanel.add(LNameLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField4 = new JTextField();
        rightPanel.add(textField4, new GridConstraints(4, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        addressLabel = new JLabel();
        addressLabel.setText("Address:");
        rightPanel.add(addressLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField5 = new JTextField();
        rightPanel.add(textField5, new GridConstraints(5, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        postalCodeLabel = new JLabel();
        postalCodeLabel.setText("Postal Code:");
        rightPanel.add(postalCodeLabel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField6 = new JTextField();
        rightPanel.add(textField6, new GridConstraints(6, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        numberLabel = new JLabel();
        numberLabel.setText("Phone Number:");
        rightPanel.add(numberLabel, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField7 = new JTextField();
        rightPanel.add(textField7, new GridConstraints(7, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        clientTypeLabel = new JLabel();
        clientTypeLabel.setText("Customer Type:");
        rightPanel.add(clientTypeLabel, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear");
        rightPanel.add(clearButton, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deleteButton = new JButton();
        deleteButton.setText("Delete");
        rightPanel.add(deleteButton, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        toolPanel = new JPanel();
        toolPanel.setLayout(new BorderLayout(0, 0));
        toolPanel.setMaximumSize(new Dimension(500, 500));
        toolPanel.setPreferredSize(new Dimension(252, 338));
        rootPanel.add(toolPanel, "ToolCard");
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(12, 7, new Insets(0, 0, 0, 0), -1, -1));
        toolPanel.add(panel1, BorderLayout.CENTER);
        final JLabel label3 = new JLabel();
        label3.setAlignmentY(0.0f);
        Font label3Font = this.$$$getFont$$$(null, -1, 22, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setText("Inventory Manager");
        label3.setVerifyInputWhenFocusTarget(true);
        panel1.add(label3, new GridConstraints(0, 0, 1, 7, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 30), null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(1, 0, 1, 7, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(250, 40), null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(6, 0, 1, 7, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(250, 20), null, 0, false));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, -1, 16, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setText("Enter the search parameter below:");
        panel1.add(label4, new GridConstraints(7, 0, 1, 7, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 22), null, 0, false));
        textField9 = new JTextField();
        panel1.add(textField9, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, 26), null, 0, false));
        final JScrollPane scrollPane2 = new JScrollPane();
        panel1.add(scrollPane2, new GridConstraints(10, 0, 1, 7, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(100, 250), null, 0, false));
        list1 = new JList(new DefaultListModel());
        scrollPane2.setViewportView(list1);
        goToCustomersButton = new JButton();
        goToCustomersButton.setText("Go To Customers");
        panel1.add(goToCustomersButton, new GridConstraints(11, 0, 1, 7, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        toolIDRadioButton = new JRadioButton();
        Font toolIDRadioButtonFont = this.$$$getFont$$$(null, -1, 14, toolIDRadioButton.getFont());
        if (toolIDRadioButtonFont != null) toolIDRadioButton.setFont(toolIDRadioButtonFont);
        toolIDRadioButton.setText("Tool ID");
        panel1.add(toolIDRadioButton, new GridConstraints(4, 0, 1, 7, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, -1, 16, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setText("Status");
        panel1.add(label5, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        typeSearchLabel = new JLabel();
        Font typeSearchLabelFont = this.$$$getFont$$$(null, -1, 16, typeSearchLabel.getFont());
        if (typeSearchLabelFont != null) typeSearchLabel.setFont(typeSearchLabelFont);
        typeSearchLabel.setText("Select type of search:");
        panel1.add(typeSearchLabel, new GridConstraints(2, 0, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(250, 22), null, 0, false));
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, -1, 12, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setText("  ");
        panel1.add(label6, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        toolNameRadioButton = new JRadioButton();
        Font toolNameRadioButtonFont = this.$$$getFont$$$(null, -1, 14, toolNameRadioButton.getFont());
        if (toolNameRadioButtonFont != null) toolNameRadioButton.setFont(toolNameRadioButtonFont);
        toolNameRadioButton.setText("Tool Name");
        panel1.add(toolNameRadioButton, new GridConstraints(3, 0, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        searchButton1 = new JButton();
        searchButton1.setText("Search");
        panel1.add(searchButton1, new GridConstraints(8, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton2 = new JButton();
        clearButton2.setText("Clear");
        panel1.add(clearButton2, new GridConstraints(8, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        sellButton = new JButton();
        sellButton.setText("Sell");
        panel1.add(sellButton, new GridConstraints(9, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$(null, -1, 16, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setText("Search Results:");
        panel1.add(label7, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        panel1.add(spacer5, new GridConstraints(8, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        listAllToolsRadioButton = new JRadioButton();
        Font listAllToolsRadioButtonFont = this.$$$getFont$$$(null, -1, 14, listAllToolsRadioButton.getFont());
        if (listAllToolsRadioButtonFont != null) listAllToolsRadioButton.setFont(listAllToolsRadioButtonFont);
        listAllToolsRadioButton.setText("List All Tools");
        panel1.add(listAllToolsRadioButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(customerIDRadioButton);
        buttonGroup.add(lastNameRadioButton);
        buttonGroup.add(clientTypeRadioButton);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(toolIDRadioButton);
        buttonGroup.add(toolNameRadioButton);
        buttonGroup.add(listAllToolsRadioButton);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}
