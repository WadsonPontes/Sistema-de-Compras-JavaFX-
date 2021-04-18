package app.utils;

import app.models.Base;

public class Serial {
	private static long serial = 0L;
	
	public static void gerarIdUnico(Base obj) {
		++Serial.serial;
		obj.id = Serial.serial;
	}
}
