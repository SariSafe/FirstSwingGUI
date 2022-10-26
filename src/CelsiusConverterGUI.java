import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//  First Use Of Swing GUI
// https://docs.oracle.com/javase/tutorial/uiswing/learn/index.html
public class CelsiusConverterGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField CelsiusTextField;
    private JLabel CelsiusJlabel;
    private JButton Convert;
    private JLabel Fahrenheit;

    public CelsiusConverterGUI(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        Convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //grab the text from the celsiusTextField
                //convert to a Double
                //update the fahrenheitLabel
                int tempferh = (int)(Double.parseDouble(CelsiusTextField.getText()) + 1.8+32);

                Fahrenheit.setText("Fahrenheit : " + tempferh);

            }
        });
    }

    public static void main(String [] args)
    {
    JFrame frame = new CelsiusConverterGUI("Celsius Convert");
    frame.setVisible(true);
    }
}
