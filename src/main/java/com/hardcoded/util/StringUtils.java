package com.hardcoded.util;

public final class StringUtils {
	// $auto-bumper-line
	public static final String A_TEST = "0.0.13";
	
	// $auto-bumper-line
	public static final String B_TEST = "0.0.13";
	
	// Nothing
	public static final String C_TEST = "0.0.12";
	
	
	public static final String B = "0.0.13"; // $auto-bumper
	public static final String C = "0.0.1";
	public static final String D = "0.0.13"; // $auto-bumper
	public static final String E = "0.0.1";
	public static final String F = "0.0.13"; // $auto-bumper
	public static final String G = "0.0.1";
	public static final String VERSION_TEST = "0.0.1";
	
	// $auto-bumper-line
	public static final String[] ALLOWED_VERSIONS = new String[] {
			LATEST_VERSION,
			"1.9.6",
			"1.9.5",
			"1.9.4",
			"1.9.3",
			"1.9.2",
			"1.9.1",
			"1.9",
			"1.8.2",
			"1.8.1",
			"1.8",
			"1.7.5",
			"1.7.4",
			"1.7.3",
			"1.7.2",
			"1.7.1",
			"1.7",
			"1.6.2",
			"1.6.1",
			"1.6",
			"1.5.2",
			"1.5.1",
			"1.5",
			"1.4.2",
			"1.4.1",
			"1.4",
			"1.3.4",
			"1.3.3",
			"1.3.2",
			"1.3.1",
			"1.3"

	};
	
	public static String removeComments(String string) {
		return string.replaceAll("//.*?[\r\n]+", "\r\n");
	}
	
	public static String getHexString(byte[] bytes, int maxLength, int lineLength) {
		StringBuilder sb = new StringBuilder();
		int a = 1;
		for(int i = 0; i < Math.min(bytes.length, maxLength); i++) {
			sb.append(String.format("%02x", bytes[i]));
			if((a ++) % lineLength == 0) sb.append('\n');
		}
		
		return sb.toString();
	}
	
	public static String getHexString(int[] ints, int maxLength, int lineLength) {
		StringBuilder sb = new StringBuilder();
		int a = 1;
		for(int i = 0; i < Math.min(ints.length, maxLength); i++) {
			sb.append((ints[i] > 0) ? '#':'.').append(" ");
			if((a ++) % lineLength == 0) sb.append('\n');
		}
		
		return sb.toString();
	}
}
