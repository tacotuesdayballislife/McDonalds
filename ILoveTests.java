public class ILoveTests {
	private static int numberOfTests;
	
	public ILoveTests(int numberOfTests) {
		this.numberOfTests = numberOfTests;
		System.out.println(“I LOVE ” + numberOfTests +  “TESTS”);
	}

	public void printNumberOfTests() {
		System.out.println(“Much test!”);
		System.out.print(numberOfTests);
	}

	public void loveTests() {
		this.numberOfTests += 1;
	}
}
