
import java.awt.*;

class Calculator {
    public static void main (String args[]) {
        Frame f= new Frame();
        //f.setSize(600,400);
        GridLayout bl= new GridLayout(5,1);
        f.setLayout(bl);
        Label l1 = new Label();
        f.add(l1);

        GridLayout gl= new GridLayout(0,4);
       
        Panel p1 = new Panel(gl);
        Button l5= new Button("1");
        Button l6= new Button("2");
        Button l7= new Button("3");
        Button l8= new Button("+");
        p1.add(l5);p1.add(l6); p1.add(l7); p1.add(l8);
        f.add(p1);

        Panel p2= new Panel(gl);
        Button l9= new Button("4");
        Button l10= new Button("5");
        Button l11= new Button("6");
        Button l12= new Button("-");
        p2.add(l9);p2.add(l10); p2.add(l11); p2.add(l12);
        f.add(p2);

        Panel p3= new Panel(gl);
        Button l13= new Button("7");
        Button l14= new Button("8");
        Button l15= new Button("9");
        Button l16= new Button("*");
        p3.add(l13);p3.add(l14); p3.add(l15); p3.add(l16);
        f.add(p3);

        Panel p4= new Panel(gl);
        Button l17= new Button("C");
        Button l18= new Button("0");
        Button l19= new Button("/");
        Button l20= new Button("=");
        p4.add(l17);p4.add(l18); p4.add(l19); p4.add(l20);
        f.add(p4); 
        



        f.setVisible(true);

    } 
}