package predefinedfi;

public class run {
	public static void main(String[] args) {
		String s = "Gagan";
		String[] g = { "gagan", "manoj", "jai", "Bhargav", "vaani" };
		/*
		 * Runnable r = () -> { System.out.println(s); }; r.run();
		 */
		Runnable f = () -> {
			System.out.println(g[3]);
		};
		f.run();
	}
}
