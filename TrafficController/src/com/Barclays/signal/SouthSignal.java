/**
 * 
 */
package com.Barclays.signal;

import com.Barclays.road.Road;
import com.Barclays.signal.Signal.SignalState;

/**
 * @author Aditya
 *
 */
public class SouthSignal extends Signal {

	private SignalState signalState;

	@Override
	public void setSignalState(SignalState signalState) {
		// TODO Auto-generated method stub
		this.signalState=signalState;
		
		// Notify road registered to this signal
		for(Road road : signalRoad)
		{
			road.SignalChangeListener(signalState);
		}
		
	}

	@Override
	public SignalState getSignalState() {
		// TODO Auto-generated method stub
		return signalState;
	}



}
