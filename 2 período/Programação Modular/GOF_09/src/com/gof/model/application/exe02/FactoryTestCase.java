package com.gof.model.application.exe02;

import junit.framework.TestCase;

public class FactoryTestCase {

	public TestCase Factory(String chave) {
		if (chave.equals("DOM"))
			return new DOMBuilderTest();
		else if (chave.equals("XML"))
			return new XMLBuilderTest();
		return null;
	}
}