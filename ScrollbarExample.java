import java.awt.*;
class ScrollbarExample {
    public static void main (String args[]) {
        Frame f=new Frame();
       
        BorderLayout bl= new BorderLayout();
        f.setLayout(bl);
        GridLayout gl= new GridLayout(0,3);
        Panel p1= new Panel(gl);
        Scrollbar sb1= new Scrollbar(Scrollbar.VERTICAL,25,5,0,100);
        Scrollbar sb2= new Scrollbar(Scrollbar.VERTICAL,50,5,0,100);
        Scrollbar sb3= new Scrollbar(Scrollbar.VERTICAL,75,5,0,100);
        p1.add(sb1); p1.add(sb2); p1.add(sb3);
        f.add(p1, BorderLayout.EAST);
        f.setVisible(true);
    }
}