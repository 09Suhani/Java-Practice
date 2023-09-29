import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class app1 extends Applet implements ActionListener
{
Button b1;
public void init()
{
b1=new Button("Click to draw Circle");
b1.addActionListener(this);
add(b1);
}
public void actionPerformed(ActionEvent e)
{
repaint();
}
public void paint(Graphics g1)
{
g1.drawLine(180,150,180,370);
g1.drawLine(180,150,440,370);
g1.drawLine(180,370,440,370);
}
}
/*
<applet code = "app1.class" width = "500" height = "500"></applet>
*/