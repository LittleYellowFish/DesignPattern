package pattern.factory.abstracts.brake;

public class SeniorBrake implements IBrake{

	@Override
	public void brake() {
		System.out.println("高级制动");
	}

}
