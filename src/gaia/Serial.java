/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gaia;

/**
 *
 * @author leandropessoa
 */

import javax.swing.JOptionPane;
import jssc.SerialPort;
import jssc.SerialPortException;



public class Serial {
    
    private byte buffer;
    private SerialPort serial;
    
    public Serial(String porta, int bauds, int dataLenght, int stopBits, int parity) throws SerialPortException
    {
        try{
            serial = new SerialPort(porta);
            serial.openPort();
        serial.setParams(bauds, dataLenght, stopBits, parity);
        }
        catch(SerialPortException e)
        {
             JOptionPane.showMessageDialog(null,e.toString());
        }
        
    }
  

  
    
    public void sendByte() throws SerialPortException
    {
       if(!serial.isOpened()) 
       serial.writeBytes("b".getBytes()); 
    }
    
    public void closePort() throws SerialPortException
    {
       try{
             serial.closePort();
       }
          catch(SerialPortException e)
          {
              
              JOptionPane.showMessageDialog(null,e.toString());
              
          }
    
    }
    
}
