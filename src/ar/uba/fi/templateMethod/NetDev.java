package ar.uba.fi.templateMethod;

public class NetDev extends Dev {

	@Override
	protected void develop() {
		System.out.println("Develop using .NET (Visual Studio is your only way to go.)");
	}

	@Override
	protected void commit() {

		System.out.println("Commit to remote repository using Git. Then, push your changes.");

	}

}
