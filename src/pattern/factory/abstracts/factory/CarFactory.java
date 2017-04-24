package pattern.factory.abstracts.factory;

import pattern.factory.abstracts.brake.IBrake;
import pattern.factory.abstracts.engine.IEngine;
import pattern.factory.abstracts.tire.ITire;

public abstract class CarFactory {

	/**
	 * ������̥
	 * @return
	 */
	public abstract ITire createTire();
	/**
	 * ����������
	 * @return
	 */
	public abstract IEngine createEngine();
	/**
	 * �����ƶ�ϵͳ
	 * @return
	 */
	public abstract IBrake createBrake();
}
