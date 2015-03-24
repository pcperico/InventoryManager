/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.awt.Point;

/**
 *
 * @author GlobalDev
 */
public class JInternalFrameCenter extends javax.swing.JInternalFrame{
    public void Centrar()
    {
        Point p = new Point();
        p.x = (this.getParent().getWidth()-this.getWidth())/2;
        p.y=(this.getParent().getHeight()-this.getHeight())/2;
        this.setLocation(p);
    }
}
