import java.applet.*;
import java.awt.*;

// <applet code = "myapplet.class" width="200" height="100"></applet>

public class myapplet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(20,20,180,80); // line will be made
    }
}