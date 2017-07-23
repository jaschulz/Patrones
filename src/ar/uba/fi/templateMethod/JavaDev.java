package ar.uba.fi.templateMethod;

public class JavaDev extends Dev {

	@Override
	protected void develop() {
		System.out.println("Develop using JAVA (Eclipse or IntelliJ)");
	}

	@Override
	protected void commit() {

		System.out.println("Commit to remote repository using SVN.");

	}

}
