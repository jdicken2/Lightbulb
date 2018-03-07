package lamps;
import buttons.Button;
import buttons.PushdownButton;
import lightbulbs.Lightbulb;
public class TableLampClient
{
	public static void main (String [] args)
	{
		System.out.println("Normal button is switched on and off");
		Button b=new Button();
		b.switchOn();
		b.switchOff();
		System.out.println(" ");
                
                

		
		System.out.println("Table Lamp button is switched on and off");
		TableLamp tb=new TableLamp();
		tb.switchOn();
		tb.switchOff();
		System.out.println(" ");

		System.out.println("Push down button is switched on and off");
		PushdownButton pd=new PushdownButton();
		pd.PushButton();
		pd.PushButton();
                pd.PushButton();
                pd.PushButton();
		System.out.println(" ");

	}
}