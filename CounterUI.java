import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterUI {
    CounterUI()
    {
        Frame f = new Frame("Counter App");

        Label title = new Label("COUNTER APPLICATION");
        title.setBounds(60,100,400,20);
        title.setFont(new Font("Serif", Font.BOLD,30));
        title.setForeground(Color.DARK_GRAY);
        f.add(title);

        TextField display = new TextField("0");
        display.setBounds(150,170,200,50);
        f.add(display);

        Button increment = new Button("Increment");
        increment.setFont(new Font("Serif", Font.CENTER_BASELINE, 15));
        increment.setBounds(150,250,90,40);
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(display.getText());
                ++num;
                display.setText(String.valueOf(num));
            }
        });
        f.add(increment);

        Button reset = new Button("Reset");
        reset.setFont(new Font("Serif", Font.CENTER_BASELINE, 15));
        reset.setBounds(255,250,90,40);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        f.add(reset);

        f.setBackground(Color.LIGHT_GRAY);
        f.setLayout(null);
        f.setSize(500,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CounterUI();
    }
}