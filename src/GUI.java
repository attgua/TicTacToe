import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int counts=0;
    private JLabel label;
    private JLabel label2;
    private JFrame frame;
    private JPanel panel;


    public GUI(){
        frame = new JFrame();

        JButton button = new JButton("Click me");
        JButton button2 = new JButton("Don't Click me");

        button.addActionListener(this);
        button2.addActionListener(this);

        label = new JLabel("Number of clicks: 0");
        label2 = new JLabel("Number of clicks sinistreo");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,300));
        panel.setLayout(new GridLayout(0,1));

        panel.add(button);
        panel.add(button2);

        panel.add(label);
        panel.add(label2);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       // System.out.println(e.getActionCommand().equals("Click me"));
       // System.out.println();

        if(e.getActionCommand().equals("Click me")) {
            counts++;
        }
        if(e.getActionCommand().equals("Don't Click me")){
            counts--;
        }
        label.setText("number of clicks:" + counts);
        if(counts %2 ==0) {
            label2.setText("number of clicks destreo");
        } else{
            label2.setText("number of clicks sinistreo");
        }
    }
}