import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class King {

    public static void main(String[] args) {
        // 1. JFrame መፍጠር
        JFrame j = new JFrame("Login Page");
        j.setSize(350, 450);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);

        // 2. JPanel መፍጠር
        JPanel p = new JPanel();
        p.setBackground(Color.RED);
        p.setBounds(0, 0, 350, 450);
        p.setLayout(null);

        // 3. ርዕስ (Title Label)
        JLabel title = new JLabel("Login System");
        title.setForeground(Color.WHITE);
        title.setBounds(130, 30, 120, 30);
        p.add(title);

        // 4. Username (የተጠቃሚ ስም ማቀበያ)
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(50, 90, 100, 25);
        p.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(50, 120, 230, 30);
        p.add(userText);

        // 5. Password (የሚስጥር ቁጥር ማቀበያ)
        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(50, 170, 100, 25);
        p.add(passLabel);

        // **እዚህ ጋር JPasswordField ተጠቀመን**
        JPasswordField passText = new JPasswordField();
        passText.setBounds(50, 200, 230, 30);
        p.add(passText);

        // ፓነሉን ወደ  JFrame እናስገባለን
        j.add(p);

        // ዊንዶው እንዲታይ ማድረግ
        j.setVisible(true);
    }
}