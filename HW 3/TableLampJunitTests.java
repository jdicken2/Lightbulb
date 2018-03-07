/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import buttons.Button;
import buttons.PushdownButton;
import lamps.TableLamp;
import lightbulbs.Lightbulb;

/**
 *
 * @author julian
 */

public class TableLampJunitTests
{
    private ByteArrayOutputStream println=new ByteArrayOutputStream();
    private PrintStream oldSystemout=System.out;

    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(println));
    }
    
    @After
    public void cleanupStreams() 
    {
        System.setOut(oldSystemout);
    }
    //Test to see if Lightbulb turns on
    @Test
    public void lightbulbOnTest()
    {
        Lightbulb lb=new Lightbulb();
        lb.on();
        assertEquals("Lightbulb on\n", println.toString());
    }
    
    //Test to see if Lightburb turns off
    @Test
    public void lightbulbOffTest()
    {
        Lightbulb lb=new Lightbulb();
        lb.off();
        assertEquals("Lightbulb off\n", println.toString());
    }
    
     //Test to see if Lightbulb turns on if Lightbulb on() is called by a button object.
    @Test
    public void buttonLightbulbOnTest()
    {
        Button bu=new Button();
        bu.on();
        assertEquals("Lightbulb on\n", println.toString());
    }
    
    //Test to see if Lightbulb turns off if Lightbulb off() is called by a button object.
    @Test
    public void buttonOffLightbulbOffTest()
    {
        Button bu=new Button();
        bu.off();
        assertEquals("Lightbulb off\n", println.toString());
    }
    
    //Test to see if button and lightbulb turns on if bulb is switched on
    @Test
    public void buttonOnTest()
    {
        Button bu=new Button();
        bu.switchOn();
        assertEquals("Button switched to ON\n" + "Lightbulb on\n", println.toString());
    }
    
    //Test to see if push down button and lightbulb turns on
    @Test
    public void pushDownButtonOnTest()
    {
        PushdownButton pd=new PushdownButton();
        pd.PushButton();
        assertEquals("Push Button switched to ON\n" + "Lightbulb on\n", println.toString());
    }
    
    //Test to see if push down button and Lightbulb turns off
    @Test
    public void pushDownButtonOffTest()
    {
        PushdownButton pd=new PushdownButton();
        pd.PushButton();
        println.reset();
        pd.PushButton();
        assertEquals("Push Button switched to OFF\n" + "Lightbulb off\n", println.toString());
    }
    
    
    
    //Tablelamp turns on, button turns on, lightbulb turns on
    @Test
    public void TableLampOnTest()
    {
        TableLamp tb=new TableLamp();
        tb.switchOn();
        assertEquals("TableLamp switched to ON\n" + "Button switched to ON\n" + "Lightbulb on\n", println.toString());
    }
    
    //TableLamps turns off, button turns off, lightbulb turns off
    @Test
    public void TableLampOffTest()
    {
        TableLamp tb=new TableLamp();
        tb.switchOff();
        assertEquals("TableLamp switched to OFF\n" + "Button switched to OFF\n" + "Lightbulb off\n", println.toString());
    }
    
    
  
}
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
