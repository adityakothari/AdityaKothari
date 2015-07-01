/**
 * 
 */
package com.Barclays.road;

import com.Barclays.signal.Signal.SignalState;

/**
 * @author Aditya
 *
 */
public class NorthRoad extends Road  {

	private int vehicleCount =0;
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return vehicleCount;
	}


	@Override
	public void SignalChangeListener(SignalState signalState) {
		// TODO Auto-generated method stub
		
		if (signalState == SignalState.GREEN)
		{
			if (lastState == SignalState.RED)
			{
				vehicleCount++; // Increment count when signals toggles from red to green
			}
		}
		else if (signalState == SignalState.RED)
		{
			vehicleCount++;
		}
		lastState=signalState;
	}

}
