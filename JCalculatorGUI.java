import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCalculatorGUI extends JFrame implements ActionListener {
    private JTextField firstNumberField, secondNumberField, thirdNumberField;
    private JButton calculateButton;
    private JComboBox<String> operationComboBox;

    public JCalculatorGUI() {
        setTitle("JCalculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField();
        JLabel thirdNumberLabel = new JLabel("Third Number:");
        thirdNumberField = new JTextField();
        JLabel operationLabel = new JLabel("Operation:");
        String[] operations = {"Addition", "Subtraction", "Multiplication", "Division", "Circle Area", "AP Nth Number", "AP Nth Sum"};
        operationComboBox = new JComboBox<>(operations);
        calculateButton = new JButton("Calculate");

        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(thirdNumberLabel);
        add(thirdNumberField);
        add(operationLabel);
        add(operationComboBox);
        add(new JLabel()); // Empty label for spacing
        add(calculateButton);

        calculateButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            double firstNumber = Double.parseDouble(firstNumberField.getText());
            double secondNumber = Double.parseDouble(secondNumberField.getText());
            double thirdNumber = Double.parseDouble(thirdNumberField.getText());
            int operationIndex = operationComboBox.getSelectedIndex();

            switch (operationIndex) {
                case 0:
                    JOptionPane.showMessageDialog(this, "Sum = " + (firstNumber + secondNumber));
                    break;
                case 1:
                    JOptionPane.showMessageDialog(this, "Difference = " + (firstNumber - secondNumber));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Product = " + (firstNumber * secondNumber));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(this, "Quotient = " + (firstNumber / secondNumber));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(this, "Circle Area = " + (Math.PI * Math.pow(firstNumber, 2)));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(this, "Nth Term = " + (firstNumber + (thirdNumber - 1) * secondNumber));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(this, "Nth Sum = " + ((thirdNumber / 2) * ((2 * firstNumber) + (thirdNumber - 1) * secondNumber)));
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid operation");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JCalculatorGUI::new);
    }
}
