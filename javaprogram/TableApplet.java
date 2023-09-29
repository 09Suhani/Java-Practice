import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TableApplet extends JApplet {
private JTextField numberField;
private JTextArea tableArea;
public void init() {
setLayout(new BorderLayout());
// Create a panel for input components
JPanel inputPanel = new JPanel();
inputPanel.setLayout(new FlowLayout());
JLabel numberLabel = new JLabel("Enter a number:");
numberField = new JTextField(10);
JButton generateButton = new JButton("Generate Table");
// Add components to the input panel
inputPanel.add(numberLabel);
inputPanel.add(numberField);
inputPanel.add(generateButton);
// Create a text area for displaying the table
tableArea = new JTextArea(10, 20);
tableArea.setEditable(false);
// Add components to the applet
add(inputPanel, BorderLayout.NORTH);
add(new JScrollPane(tableArea), BorderLayout.CENTER);
// Add action listener to the button
generateButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
generateTable();
}
});
}
private void generateTable() {
// Clear the text area
tableArea.setText("");
try {
// Get the input number from the text field
int number = Integer.parseInt(numberField.getText());
// Generate the table and display it in the text area
for (int i = 1; i <= 10; i++) {
int result = number * i;
tableArea.append(number + " x " + i + " = " + result + "\n");
}
} catch (NumberFormatException ex) {
tableArea.setText("Invalid input. Please enter a valid number.");
}
}
}
/*
<applet code="TableApplet.class" width="400" height="300"></applet>
*/