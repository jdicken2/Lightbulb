package lamps;
import lightbulbs.Lightbulb;
public class TableLamp extends Lightbulb implements LampInterface
{
	String stdout="nothing";
	public TableLamp() 
	{

	}

    @Override
	public void switchOn()
	{
		System.out.println("TableLamp switched to ON");
                System.out.println("Button switched to ON");
                on();
	}

	@Override
	public void switchOff()
	{
		System.out.println("TableLamp switched to OFF");
                System.out.println("Button switched to OFF");
                off();
	}

	/*
	//@Override
	public String PushButton()
	{
	 	if(push)
	 	{
			stdout="Push Button switched to ON";
			push=false;
		}
		else
		{
			stdout="Push Button switched to OFF";
			push=true;
		}
		return stdout;

	}*/

}