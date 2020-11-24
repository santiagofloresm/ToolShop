package Client.View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutGUI {
    private JPanel rootPanel;
    private JPanel clientPanel;
    private JPanel toolPanel;
    private JPanel leftPanel;
    private JLabel searchLabel;
    private JCheckBox clientIDCheckBox;
    private JCheckBox lastNameCheckBox;
    private JCheckBox clientTypeCheckBox;
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
    private JButton holaButton;
    private JButton adiosButton;

    public CardLayoutGUI() {
        CardLayout cardLayout = (CardLayout) rootPanel.getLayout();
        holaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(rootPanel, "Card2");
            }
        });
        adiosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(rootPanel, "Card1");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayoutGUI");
        frame.setContentPane(new CardLayoutGUI().rootPanel);
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
        rootPanel.setPreferredSize(new Dimension(500, 500));
        clientPanel = new JPanel();
        clientPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(clientPanel, "Card1");
        holaButton = new JButton();
        holaButton.setText("Hola");
        clientPanel.add(holaButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        toolPanel = new JPanel();
        toolPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(toolPanel, "Card2");
        adiosButton = new JButton();
        adiosButton.setText("Adios");
        toolPanel.add(adiosButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}
