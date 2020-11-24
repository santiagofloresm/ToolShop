package Client.View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

public class ClientMgmtGUI extends JFrame{

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel searchLabel;
    private JLabel clientLabel;
    private JCheckBox clientIDCheckBox;
    private JCheckBox lastNameCheckBox;
    private JCheckBox clientTypeCheckBox;
    private JLabel clientIdLabel;
    private JLabel fNameLabel;
    private JLabel addressLabel;
    private JLabel postalCodeLabel;
    private JLabel numberLabel;
    private JLabel LNameLabel;
    private JLabel clientTypeLabel;
    private JButton saveButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JLabel parameterLabel;
    private JTextField textField8;
    private JButton searchButton;
    private JButton clearButton1;

    public ClientMgmtGUI() {
//        JFrame frame = new JFrame("Tool Shop App");
//        JPanel mainPanel = new JPanel();
//        JPanel leftPanel = new JPanel();
//        JPanel rightPanel = new JPanel();
//
//        frame.setSize(500, 500);
//        frame.setLocation(300,100);
//
//        // Left panel
//        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
//        // Title label "Search Clients
//        JLabel search = new JLabel("Search Clients");
//        search.setAlignmentX(JLabel.CENTER_ALIGNMENT);
//        search.setFont(search.getFont().deriveFont(20f));
//        leftPanel.add(search);
//        // Select type label
//        JLabel type = new JLabel("Select type of search to be performed:");
//        leftPanel.add(type);
//        // Client ID option
//        JCheckBox id = new JCheckBox("Client ID");
//        leftPanel.add(id);
//        // Last Name option
//        JCheckBox name = new JCheckBox("Last Name");
//        leftPanel.add(name);
//        // Client Type option
//        JCheckBox clientType = new JCheckBox("Client Type");
//        leftPanel.add(clientType);
//        // Search parameters label
//        JLabel param = new JLabel("Enter the search parameters below:");
//        leftPanel.add(param);
//
//        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
//        JLabel client = new JLabel("Client Information");
//        client.setHorizontalTextPosition(JLabel.CENTER);
//        client.setFont(client.getFont().deriveFont(20f));
//        rightPanel.add(client);
//
//        mainPanel.add(leftPanel);
//        mainPanel.add(rightPanel);
//
//        frame.add(mainPanel);
//        frame.setVisible(true);
        $$$setupUI$$$();
    }

    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        Font mainPanelFont = this.$$$getFont$$$(null, -1, -1, mainPanel.getFont());
        if (mainPanelFont != null) mainPanel.setFont(mainPanelFont);
        mainPanel.setMinimumSize(new Dimension(500, 500));
        mainPanel.setPreferredSize(new Dimension(700, 500));
        mainPanel.setRequestFocusEnabled(false);
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayoutManager(11, 4, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(leftPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        searchLabel = new JLabel();
        Font searchLabelFont = this.$$$getFont$$$(null, -1, 22, searchLabel.getFont());
        if (searchLabelFont != null) searchLabel.setFont(searchLabelFont);
        searchLabel.setText("Search Clients");
        leftPanel.add(searchLabel, new GridConstraints(0, 0, 1, 4, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, -1, 16, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Select type of search to be performed:");
        leftPanel.add(label1, new GridConstraints(2, 0, 1, 4, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clientIDCheckBox = new JCheckBox();
        Font clientIDCheckBoxFont = this.$$$getFont$$$(null, -1, 14, clientIDCheckBox.getFont());
        if (clientIDCheckBoxFont != null) clientIDCheckBox.setFont(clientIDCheckBoxFont);
        clientIDCheckBox.setText("Client ID");
        leftPanel.add(clientIDCheckBox, new GridConstraints(3, 0, 1, 4, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lastNameCheckBox = new JCheckBox();
        Font lastNameCheckBoxFont = this.$$$getFont$$$(null, -1, 14, lastNameCheckBox.getFont());
        if (lastNameCheckBoxFont != null) lastNameCheckBox.setFont(lastNameCheckBoxFont);
        lastNameCheckBox.setText("Last Name");
        leftPanel.add(lastNameCheckBox, new GridConstraints(4, 0, 1, 4, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clientTypeCheckBox = new JCheckBox();
        Font clientTypeCheckBoxFont = this.$$$getFont$$$(null, -1, 14, clientTypeCheckBox.getFont());
        if (clientTypeCheckBoxFont != null) clientTypeCheckBox.setFont(clientTypeCheckBoxFont);
        clientTypeCheckBox.setText("Client Type");
        leftPanel.add(clientTypeCheckBox, new GridConstraints(5, 0, 1, 4, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        leftPanel.add(spacer1, new GridConstraints(1, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(-1, 40), null, 0, false));
        final Spacer spacer2 = new Spacer();
        leftPanel.add(spacer2, new GridConstraints(6, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 20), null, 0, false));
        parameterLabel = new JLabel();
        Font parameterLabelFont = this.$$$getFont$$$(null, -1, 16, parameterLabel.getFont());
        if (parameterLabelFont != null) parameterLabel.setFont(parameterLabelFont);
        parameterLabel.setText("Enter the search parameter below:");
        leftPanel.add(parameterLabel, new GridConstraints(7, 0, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        leftPanel.add(scrollPane1, new GridConstraints(10, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(-1, 200), null, 0, false));
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayoutManager(9, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(rightPanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        clientLabel = new JLabel();
        Font clientLabelFont = this.$$$getFont$$$(null, -1, 22, clientLabel.getFont());
        if (clientLabelFont != null) clientLabel.setFont(clientLabelFont);
        clientLabel.setText("Client Information");
        rightPanel.add(clientLabel, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        saveButton = new JButton();
        saveButton.setText("Save");
        rightPanel.add(saveButton, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField1 = new JTextField();
        rightPanel.add(textField1, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        clientIdLabel = new JLabel();
        clientIdLabel.setText("Client ID:");
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
        clientTypeLabel.setText("Client Type:");
        rightPanel.add(clientTypeLabel, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear");
        rightPanel.add(clearButton, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deleteButton = new JButton();
        deleteButton.setText("Delete");
        rightPanel.add(deleteButton, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ManagementGUI");
        frame.setContentPane(new ClientMgmtGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        new ClientMgmtGUI();
    }
}
