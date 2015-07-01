/**
 *  
 */
package com.Barclays.road;

import com.Barclays.signal.Signal.SignalState;

/**
 * @author Aditya
 *
 */
public abstract class Road 
{

	SignalState lastState;
	
	public Road()
	{
		lastState = SignalState.NONE;
	}
	
	public abstract int getCount();
	public abstract void SignalChangeListener(SignalState signalState);
}
