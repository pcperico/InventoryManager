/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Data.Entities.Provider;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    
    protected void clearFields(Container container)
    {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) { 
               ((JTextField)c).setText("");
            }
        }
    }
}
