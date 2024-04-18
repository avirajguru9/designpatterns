package com.design.patterns.factory;

/*
 * this class will return specific class required using factory design pattern
 */
public class OperatingSystemFactory {
	public InterfaceOs getInstance(String str) {
		switch (str) {
		case "Windows": {
			return new Windows();
		}
		case "Ubuntu": {
			return new Ubuntu();
		}
		case "CentOs": {
			return new CentOs();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + str);
		}
	}
}
