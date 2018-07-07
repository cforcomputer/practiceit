public class LastFirst {
	public static String lastFirst(String name) {
		return name.substring(name.indexOf(" ") + 1, name.length()) + ", " + name.charAt(0) + ".";
	}
}
