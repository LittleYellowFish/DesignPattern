package pattern.build;

/**
 * �ŵ㣺���õķ�װ�ԣ���������ϸ��
 * ȱ�㣺����������builder���������ڴ�
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
