import java.awt.*;
 class Question {
    public static void main (String args[]) {
        Frame f= new Frame();
        GridLayout gl= new GridLayout(6,0);
        f.setLayout(gl);
        Label l1= new Label("Q: Capital of Rajasthan?");
        f.add(l1);
        FlowLayout fl= new FlowLayout(FlowLayout.LEFT,10,10);
        Panel p1= new Panel(fl);
        CheckboxGroup cityGroup = new CheckboxGroup();
        Label l2= new Label("A.");
        Checkbox cb1= new Checkbox("Ajmer",cityGroup,false);
        p1.add(l2); p1.add(cb1);
        f.add(p1);
        Panel p2= new Panel(fl);
        Label l3= new Label("B.");
        Checkbox cb2= new Checkbox("Jaipur",cityGroup,true);
        p2.add(l3); p2.add(cb2);
        f.add(p2);
        Panel p3= new Panel(fl);
        Label l4= new Label("C.");
        Checkbox cb3= new Checkbox("Delhi",cityGroup,false);
        p3.add(l4); p3.add(cb3);
        f.add(p3);
        Panel p4= new Panel(fl);
        Label l5= new Label("D.");
        Checkbox cb4= new Checkbox("Jodhpur",cityGroup,false);
        p4.add(l5); p4.add(cb4);
        f.add(p4);
        FlowLayout flow= new FlowLayout(FlowLayout.CENTER,10,10);
        Panel p5= new Panel(flow);
        Button B1= new Button ("previous");
        Button B2= new Button ("Next");
        p5.add(B1); p5.add(B2);
        f.add(p5);
        f.setVisible(true);

        


    }
 }