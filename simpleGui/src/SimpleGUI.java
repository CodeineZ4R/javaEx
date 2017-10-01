import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {

    private JButton jButton = new JButton("Press");
    private JTextField jTextField = new JTextField("", 5);
    private JLabel jLabel = new JLabel("input");
    private JRadioButton jRadioButton = new JRadioButton("Select this");
    private JRadioButton jRadioButton2 = new JRadioButton("Select that");
    private JCheckBox jCheckBox = new JCheckBox("CheckBox", false);

    public SimpleGUI() {
        super("simple GUI");
        this.setBounds(250, 250, 250, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(jLabel);
        container.add(jTextField);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton2);
        container.add(jRadioButton);
        jRadioButton.setSelected(true);
        container.add(jRadioButton2);
        container.add(jCheckBox);
        jButton.addActionListener(new ButonEventListener());
        container.add(jButton);

    }


    class ButonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + jTextField.getText();
            message += (jRadioButton.isSelected() ? "jRadioButton"
                    : "jRadioButton2") + "is select\n";
            message += "is CheckBox" + (jCheckBox.isSelected() ?
                    "check" : "uncheck");
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
