package pattern.agent;

public class Lawyer implements ILawsuit {

	private ILawsuit xiaoMin;

	public Lawyer(ILawsuit xiaoMin) {
		super();
		this.xiaoMin = xiaoMin;
	}

	@Override
	public void submit() {
		xiaoMin.submit();
	}

	@Override
	public void burden() {
		xiaoMin.burden();
	}

	@Override
	public void defend() {
		xiaoMin.defend();
	}

	@Override
	public void finish() {
		xiaoMin.finish();
	}

}
