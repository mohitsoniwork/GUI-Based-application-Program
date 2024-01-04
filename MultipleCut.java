import java.awt.*;

class MultipleCut {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setLayout(new GridLayout(2, 2));

        Panel p1 = new Panel(new GridLayout(2, 1, 0, 0));
        p1.add(new Button("1"));
        p1.add(new Button("2"));
        f.add(p1);

        Panel p2 = new Panel(new GridLayout(1, 3, 0, 0));
        p2.add(new Button("3"));
        p2.add(new Button("4"));
        p2.add(new Button("5"));
        f.add(p2);

        Panel p3 = new Panel(new GridLayout(1, 2, 0, 0));
        Panel p3Left = new Panel(new GridLayout(2, 1, 0, 0));
        p3Left.add(new Button("6"));
        p3Left.add(new Button("7"));
        p3.add(p3Left);

        Panel p3Right = new Panel(new GridLayout(3, 1, 0, 0));
        p3Right.add(new Button("8"));
        p3Right.add(new Button("9"));
        p3Right.add(new Button("10"));
        p3.add(p3Right);

        f.add(p3);

        Panel p4 = new Panel(new GridLayout(2, 1, 0, 0));
        Panel p4Upper = new Panel(new GridLayout(1, 2, 0, 0));
        p4Upper.add(new Button("11"));
        p4Upper.add(new Button("12"));
        p4.add(p4Upper);

        Panel p4Lower = new Panel(new GridLayout(1, 3, 0, 0));
        p4Lower.add(new Button("13"));
        p4Lower.add(new Button("14"));
        p4Lower.add(new Button("15"));
        p4.add(p4Lower);

        f.add(p4);

        
        f.setVisible(true);
    }
}
