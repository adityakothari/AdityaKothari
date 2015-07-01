/**
 *  FactoryProducer class, returns Factory type
 */
package com.Barclays.main;

/**
 * @author Aditya
 *
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) 
	{

		if (choice.equalsIgnoreCase("Road"))
		{
			return new RoadFactory();

		} 
		else if (choice.equalsIgnoreCase("Signal"))
		{
			return new SignalFactory();
		}

		return null;
	}

}
