import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame{
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public HelloDemo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, "Hello, " + txtName.getText() + ". My name is Tom Riddle" );
                // states that when JButton 'btnClick' is clicked, then text associated with JTextField 'txtName' will be printed
                // in new JOptionPane
            }
        });
    }

    public static void main(String[] args) {
        HelloDemo h = new HelloDemo();
        h.setContentPane(h.panelMain);
        h.setTitle("Hello");
//        h.setSize(300,100);
        h.setBounds(700,400,300,100); // set point in screen where pane opens + size of pane
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// right click --> preview. will display preview of text box
// right click button --> create listener --> action listener. Will autopopulate constructor