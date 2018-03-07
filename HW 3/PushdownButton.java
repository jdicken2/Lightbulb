/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttons;
import lightbulbs.Lightbulb;

/**
 *
 * @author julian
 */
//String stdout="nothing";
public class PushdownButton extends Lightbulb
{
	boolean push=true;
	public void PushdownButton()
	{

	}

	public void PushButton()
	{
	 	if(push)
	 	{
			System.out.println("Push Button switched to ON");
                        on();
			push=false;
		}
		else
		{
			System.out.println("Push Button switched to OFF");
                        off();
			push=true;
		}
		//return stdout;

	}

}