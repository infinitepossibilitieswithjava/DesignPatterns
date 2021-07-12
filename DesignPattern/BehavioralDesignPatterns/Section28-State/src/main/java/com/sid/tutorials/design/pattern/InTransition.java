/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class InTransition implements IPackageState {
	// Singleton
	private static InTransition instance = new InTransition();

	private InTransition() {
	}

	public static InTransition instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is in transition !!");
		ctx.setCurrentState(OutForDelivery.instance());
	}
}
