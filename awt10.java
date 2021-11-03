import java.awt.*;
import java.awt.event.*;
class MyDrawingPad extends Canvas
{
private int lastX,lastY;
MyDrawingPad()
{
setBackground(new Color(100,200,120));
setForeground(Color.black);
}
public boolean mouseDown(Event e,int x,int y)
{
lastX=x;
lastY=y;
return true;
}
public boolean mouseDrag(Event e,int x,int y)
{
Graphics g=getGraphics();
g.drawLine(lastX,lastY,x,y);
lastX=x;
lastY=y;
return true;
}
}
class awt10 extends Frame 
{
MyDrawingPad mpd;
awt10()
{
mpd=new MyDrawingPad();
setLayout(new BorderLayout());
add(mpd,BorderLayout.CENTER);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent ev)
{
System.exit(0);
}
});
setLocation(100,100);
setSize(600,600);
setVisible(true);
}
}
class awt10psp
{
public static void main(String gg[])
{
awt10 a=new awt10();
}
}