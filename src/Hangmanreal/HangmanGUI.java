package Hangmanreal;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanGUI {
    private JPanel Mainpanel;
    private JLabel Label;
    private JTextField Erraten;
    private JTextField Raten;
    private JButton B;
    private JButton Button;
    private JLabel Regeln;
    private JButton u;
    private JButton p;
    private JButton s;
    private JButton r;
    private JButton v;
    private JButton q;
    private JButton w;
    private JButton x;
    private JButton y;
    private JButton t;
    private JButton o;
    private JButton n;
    private JButton m;
    private JButton l;
    private JButton k;
    private JButton j;
    private JButton i;
    private JButton h;
    private JButton g;
    private JButton f;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton z;
    private JButton aButton;
    private JTextArea Grafik;
    String wort = "orangutan";
    int a = wort.length();
    String[] wort1;
    String[] buchstabe;
 int fehler = 0;

    public HangmanGUI() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafik.setText("\n\n\n\n\n\n\n\n====================");
                Raten.setText("");
                wort1 = new String[wort.length()];
                for(int i = 0; i<a;i++){
                    wort1[i] = "_ ";
                }
                Erraten.setText("");
                for(int i = 0; i<a;i++){
                    Erraten.setText(Erraten.getText()+wort1[i]);

                }
            }
        });

        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String g = Raten.getText();
                if(g.length()>=2){
                    Raten.setText("Nur EINEN Buchstaben,Neustart!");
                }
                Raten.setText("");

                String buchstabe = "";
                for (int i = 0; i < a; i++) {
                    buchstabe = String.valueOf(wort.charAt(i));
                    if (buchstabe.equals(g)) {
                        wort1[i] = g;

                    }
                    else{

                    }
                    if(fehler==1){
                        Grafik.setText("\n\n\n\n\n\n\n\n=====================");
                    }
                    if(fehler==2){
                        Grafik.setText("\n\n\n\n\n\n\n\nmoinsen");
                    }
                    if(fehler==3){
                        Grafik.setText("\n\n\n\n\n\n\n\npri");
                    }
                    if(fehler==4){
                        Grafik.setText("\n\n\n\n\n\n\n\nhallo");
                    }
                    if(fehler==5){
                        Grafik.setText("\n\n\n\n\n\n\n\nmoin");
                    }





                }
                Erraten.setText("");

                for (int i = 0; i<a;i++){

                    Erraten.setText(Erraten.getText()+wort1[i]);
                }

                if(wort.equals(Erraten.getText()))
                {

                    Erraten.setText("");
                    Erraten.setText( Erraten.getText()+"Super,geschafft!");

                }
            }


        });


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("b");
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("c");
            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("d");
            }
        });
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("e");
            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("f");
            }
        });
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("g");
            }
        });
        h.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("h");
            }
        });
        i.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("i");
            }
        });
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("j");
            }
        });
        k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("k");
            }
        });
        l.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("l");
            }
        });
        m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("m");
            }
        });
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("n");
            }
        });
        o.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("o");
            }
        });
        p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("p");
            }
        });
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("q");
            }
        });
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("r");
            }
        });
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("s");
            }
        });
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("t");
            }
        });
        u.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("u");
            }
        });
        v.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("v");
            }
        });
        w.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("w");
            }
        });
        x.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("x");
            }
        });
        y.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("y");
            }
        });
        z.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("z");
            }
        });

        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("a");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HangmanGUI");
        frame.setContentPane(new HangmanGUI().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}

