/**
 *  Signal Factory class, returns Signal Type
 */
package com.Barclays.main;

import com.Barclays.road.Road;
import com.Barclays.signal.EastSignal;
import com.Barclays.signal.NorthSignal;
import com.Barclays.signal.Signal;
import com.Barclays.signal.SouthSignal;
import com.Barclays.signal.WestSignal;

/**
 * @author Aditya
 *
 */
public class SignalFactory extends AbstractFactory {

	@Override
	public Road getRoad(String road) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Signal getSignal(String signalType) {
		// TODO Auto-generated method stub
		if (signalType == null) {
			return null;
		}

		if (signalType.equalsIgnoreCase("North")) 
		{
			return new NorthSignal();
		} 
		else if (signalType.equalsIgnoreCase("South")) 
		{
			return new SouthSignal();
		} 
		else if (signalType.equalsIgnoreCase("East"))
		{
			return new EastSignal();
		} 
		else if (signalType.equalsIgnoreCase("West")) 
		{
			return new WestSignal();
		}
		return null;
	}
}
