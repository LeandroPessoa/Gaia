/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gaia;

import java.text.DecimalFormat;

/**
 *
 * @author leandropessoa
 */



public class Temperatura {
    
private byte lowByte;
private byte highByte;
private float k;
private char rawTemperatura;
Temperatura(byte lowbyte, byte highbyte)
{
        this.k = 0.02F;
    this.lowByte = (byte)lowbyte;
    this.highByte = (byte)highbyte;
    
    rawTemperatura = (char) ((((int)this.highByte & (int) 0xFF) << 8) | ((int)this.lowByte & (int) 0xFF));
    
    
}

public float Celsius()
{
float temperatura = 0;
//rotina de conversão para graus celsius.
//DecimalFormat df = new DecimalFormat(",00"); 
temperatura = (((int)rawTemperatura)*this.k) - (float)273.15 ;
//return Float.parseFloat(df.format(temperatura));
return temperatura;
}

public float Kelvin()
{
float temperatura = 0;
//rotina de conversão para graus kelvin.

temperatura = ((float)rawTemperatura*k);
return temperatura;
}

public float Farenheirt()
{
float temperatura = 0;
//rotina de conversão para graus farenheirt.
return temperatura;
}



}
