package pattern.factory.abstracts.factory;

import pattern.factory.abstracts.brake.IBrake;
import pattern.factory.abstracts.brake.NormalBrake;
import pattern.factory.abstracts.engine.DomestEngine;
import pattern.factory.abstracts.engine.IEngine;
import pattern.factory.abstracts.tire.ITire;
import pattern.factory.abstracts.tire.NormalTire;

public class Q3Factory extends CarFactory {


	@Override
	public ITire createTire() {
		return new NormalTire();
	}

	@Override
	public IEngine createEngine() {
		
		return new DomestEngine();
	}

	@Override
	public IBrake createBrake() {
		return new NormalBrake();
	}

}
