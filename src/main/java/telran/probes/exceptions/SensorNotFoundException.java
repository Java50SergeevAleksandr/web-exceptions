package telran.probes.exceptions;

import static telran.probes.exceptionMessages.ExceptionMessages.*;

@SuppressWarnings("serial")
public class SensorNotFoundException extends NotFoundException {

	public SensorNotFoundException() {
		super(SENSOR_NOT_FOUND);

	}

}
