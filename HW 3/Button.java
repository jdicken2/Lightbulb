/*package ~.Desktop."Fall 2017".cs445-fall-2017/"HW 3".buttons;
import ~.Desktop."Fall 2017".cs445-fall-2017/"HW 3".lightbulbs.Lightbulb;*/

package buttons;
import lightbulbs.Lightbulb;
import lamps.*;
public class Button extends Lightbulb implements LampInterface
{
	//String stdout="nothing";
	public Button()
	{
			
	}

	@Override
	public void switchOn()
	{
		
		
		/*stdout="Button switched to ON";
		return stdout;*/
		System.out.println("Button switched to ON");
                on();
	}

	@Override 
	
	public void switchOff()
	{
		/*stdout="Button switched to OFF";
		return stdout;*/
		System.out.println("Button switched to OFF");
                off();
	}

}