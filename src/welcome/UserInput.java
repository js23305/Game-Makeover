
import javax.swing.*; // creates GUI and provides JFrame, JTextField, JButton, JPanel, etc
import java.awt.event.*; // import for ActionListener

public class UserInput {
    
    public static void main(String[] args) {
      
       // Create the main frame (window)
       JFrame frame = new JFrame("User Input Form");

       // Create text fields for username, email, and password
       JTextField usernameField = new JTextField(20);  // Username input
       JTextField emailField = new JTextField(20);     // Email input
       JPasswordField passwordField = new JPasswordField(20);  // Password input

       // Create labels to describe the text fields
       JLabel usernameLabel = new JLabel("Username:");
       JLabel emailLabel = new JLabel("Email:");
       JLabel passwordLabel = new JLabel("Password:");

       // Create a button to submit the form
       JButton submitButton = new JButton("Submit");

       // Create a panel to organize the fields and labels
       JPanel panel = new JPanel();
       
       // Add the labels and text fields to the panel in order
       panel.add(usernameLabel);
       panel.add(usernameField);
       
       panel.add(emailLabel);
       panel.add(emailField);
       
       panel.add(passwordLabel);
       panel.add(passwordField);
       
       // Add the button to the panel
       panel.add(submitButton);

       // Add the panel to the frame
       frame.add(panel);

       // Set the frame settings
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit on close
       frame.pack();  // Adjust the window size to fit components
       frame.setVisible(true);  // Make the window visible

       // Add AtionListener to the submit button
       // We need this listener to perform some actions when the button is clicked
       submitButton.addActionListener(new ActionListener() {
        @Override
           public void actionPerformed(ActionEvent e) {
               // Store the username entered in the text field
               // We want to get the value the user inputted so we can use it later, like storing it or displaying it
               String username = usernameField.getText();
               String email = emailField.getText();
               String password = passwordField.getText();

               if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Submitted:\nUsername: " + username + "\nEmail: " + email);
            }


               }
       });



   }


}

