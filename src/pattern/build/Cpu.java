package pattern.build;

/**
 * 优点：良好的封装性，对外隐藏细节
 * 缺点：会产生多余的builder对象，消耗内存
 * @author yl
 *
 */
public class Cpu {

	public int id;
	public String name;

	static class CpuBuilder extends BaseBuilder<Cpu> {
		private Cpu cpu=new Cpu();
		
		public CpuBuilder setCpuName(String name) {
			cpu.name=name;
			return this; 
		}

		@Override
		public Cpu create() {

			return cpu;
		}

	}
}
