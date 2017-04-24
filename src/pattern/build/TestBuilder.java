package pattern.build;

import pattern.build.Cpu.CpuBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		Cpu cpu=new CpuBuilder().setCpuName("inter").create();
		System.out.println(cpu.name);
	}
}
