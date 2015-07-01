/**
 *  Class having main Traffic Controller Logic  
 */
package com.Barclays.main;

import com.Barclays.road.Road;
import com.Barclays.signal.Signal;
import com.Barclays.signal.Signal.SignalState;

/**
 * @author Aditya
 *
 */
public class TrafficMain {

	/**
	 * @param args
	 */
	
	public static final int NO_OF_CYCLES =20;
	
	Road northRoad, southRoad, eastRoad, westRoad;
	Signal northSignal, southSignal, eastSignal, westSignal;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TrafficMain().startControlling();
	}

	public void startControlling()
	{
		AbstractFactory roadFactory = FactoryProducer.getFactory("Road");
		northRoad = roadFactory.getRoad("North");
		southRoad = roadFactory.getRoad("South");
		eastRoad  = roadFactory.getRoad("East");
		westRoad  = roadFactory.getRoad("West");

		AbstractFactory signalFactory = FactoryProducer.getFactory("Signal");
		northSignal = signalFactory.getSignal("North");
		southSignal = signalFactory.getSignal("South");
		eastSignal  = signalFactory.getSignal("East");
		westSignal  = signalFactory.getSignal("West");
		
		northSignal.registerRoad(northRoad);
		southSignal.registerRoad(southRoad);
		eastSignal.registerRoad(eastRoad);
		westSignal.registerRoad(westRoad);
		
		int i = 0 ;
		int northRoadCount, southRoadCount, eastRoadCount, westRoadCount;
		
		northRoadCount = northRoad.getCount();
		southRoadCount = southRoad.getCount();
		eastRoadCount  = eastRoad.getCount();
		westRoadCount  = westRoad.getCount();
		
		System.out.println(i + ":" + " N = " + northRoadCount + "; S = " + southRoadCount + "; E = " + eastRoadCount + "; W = " + westRoadCount );
	
		SignalState stateOne = SignalState.GREEN;
		SignalState stateTwo = SignalState.RED;
		SignalState stateThree = SignalState.NONE;
		
		i++;
		
		boolean signalTurn = true;
		
		int j = 0;
		
		for ( i=1; i <= NO_OF_CYCLES ; i++)
		{
			// Time duration when both signals are RED
			if (j!=0 && j%3==0)
			{
				signalTurn = true;
				j=0;
			}
			else
			{
				j++;
				if(signalTurn == true)
				{
					stateThree = stateOne;
					stateOne = stateTwo;
					stateTwo = stateThree;
					signalTurn = false;
				}
			}
			
			northSignal.setSignalState(signalTurn == true ? SignalState.RED : stateTwo);
			southSignal.setSignalState(signalTurn == true ? SignalState.RED : stateTwo);
			eastSignal.setSignalState(signalTurn == true ? SignalState.RED : stateOne);
			westSignal.setSignalState(signalTurn == true ? SignalState.RED : stateOne);
			
			northRoadCount = northRoad.getCount();
			southRoadCount = southRoad.getCount();
			eastRoadCount  = eastRoad.getCount();
			westRoadCount  = westRoad.getCount();
			
			System.out.println(i + ":" + " N = " + northRoadCount + "; S = " + southRoadCount + "; E = " + eastRoadCount + "; W = " + westRoadCount );
		
		}
	}
}

