package pattern.agent;

public class Test {

	public static void main(String[] args) {
		ILawsuit xiaoMin=new XiaoMin();
		ILawsuit lawyer=new Lawyer(xiaoMin);
		lawyer.submit();
		lawyer.burden();
		lawyer.defend();
		lawyer.finish();
		
	}
}
