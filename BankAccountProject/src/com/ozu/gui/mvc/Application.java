package com.ozu.gui.mvc;

public class Application {

	public static void main(String[] args) {
			Model m = new Model();
			View v = new View("Simple Banking App");
			Controller c = new Controller(m, v);
			c.initView();
			c.defineHandlerMethods();
		}
	}


