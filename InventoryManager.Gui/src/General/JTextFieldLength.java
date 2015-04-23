/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import javax.swing.JTextField;

/**
 *
 * @author GlobalDev
 */
public class JTextFieldLength extends JTextField {    

    public JTextFieldLength()
    {
        super();
    }
    public JTextFieldLength(int size)
    {
        super(size);
    }   
    private int Length;

    /**
     * @return the Length
     */
    public int getLength() {
        return Length;
    }

    /**
     * @param Length the Length to set
     */
    public void setLength(int Length) {
        this.Length = Length;
    }
    
    

  
    
}
