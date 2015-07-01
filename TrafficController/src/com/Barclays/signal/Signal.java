/**
 * 
 */
package com.Barclays.signal;

import java.util.ArrayList;
import java.util.List;

import com.Barclays.road.Road;

/**
 * @author Aditya
 *
 */
public abstract class Signal {

	public static final int GREEN_SIGNAL_DURATION = 3;
	public static final int RED_SIGNAL_DURATION = 1;
	
	List<Road> signalRoad = new ArrayList<Road>();
	
	public enum SignalState
	{
		NONE,GREEN,RED
	}
	
	public abstract void setSignalState(SignalState state);
	public abstract SignalState getSignalState();
	
	public void registerRoad (Road roadType)
	{
		signalRoad.add(roadType);
	}
	
	public void deRegisterRoad (Road roadType)
	{
		signalRoad.remove(roadType);
	}
}
