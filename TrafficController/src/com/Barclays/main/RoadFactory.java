/**
 *  Road Factory class, returns Road type
 */
package com.Barclays.main;

import com.Barclays.road.EastRoad;
import com.Barclays.road.NorthRoad;
import com.Barclays.road.Road;
import com.Barclays.road.SouthRoad;
import com.Barclays.road.WestRoad;
import com.Barclays.signal.Signal;

/**
 * @author Aditya
 *
 */
public class RoadFactory extends AbstractFactory {

	@Override
	public Road getRoad(String roadType) {
		// TODO Auto-generated method stub
		if (roadType == null) {
			return null;
		}

		if (roadType.equalsIgnoreCase("North")) {
			return new NorthRoad();
		} else if (roadType.equalsIgnoreCase("South")) {
			return new SouthRoad();

		} else if (roadType.equalsIgnoreCase("East")) {
			return new EastRoad();
		} else if (roadType.equalsIgnoreCase("West")) {
			return new WestRoad();
		}

		return null;
	}

	@Override
	public Signal getSignal(String signal) {
		// TODO Auto-generated method stub
		return null;
	}

}
