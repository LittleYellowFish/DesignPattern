
package pattern.factory.abstracts.factory;

import pattern.factory.abstracts.brake.IBrake;
import pattern.factory.abstracts.brake.SeniorBrake;
import pattern.factory.abstracts.engine.IEngine;
import pattern.factory.abstracts.engine.ImportEngine;
import pattern.factory.abstracts.tire.ITire;
import pattern.factory.abstracts.tire.SUVTire;

public class Q7Factory extends CarFactory{

	@Override
	public ITire createTire() {
		return new SUVTire();
	}

	@Override
	public IEngine createEngine() {
		return new ImportEngine();
	}

	@Override
	public IBrake createBrake() {
		return new SeniorBrake();
	}

}
