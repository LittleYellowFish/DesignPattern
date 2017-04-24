package pattern.factory.abstracts.factory;

import pattern.factory.abstracts.brake.IBrake;
import pattern.factory.abstracts.engine.IEngine;
import pattern.factory.abstracts.tire.ITire;

public abstract class CarFactory {

	/**
	 * 生产轮胎
	 * @return
	 */
	public abstract ITire createTire();
	/**
	 * 生产发动机
	 * @return
	 */
	public abstract IEngine createEngine();
	/**
	 * 生产制动系统
	 * @return
	 */
	public abstract IBrake createBrake();
}
