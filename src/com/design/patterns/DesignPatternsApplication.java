package com.design.patterns;

import com.design.patterns.factory.InterfaceOs;
import com.design.patterns.factory.OperatingSystemFactory;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryDesign();
	}
	
	public static void FactoryDesign() {
		OperatingSystemFactory OsFact = new OperatingSystemFactory();
		InterfaceOs Os = OsFact.getInstance("CentOs");
		Os.specification();
	}

}
