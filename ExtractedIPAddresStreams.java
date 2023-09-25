package com.sep.it;

import java.util.regex.*;
import java.util.stream.*;

public class ExtractedIPAddresStreams {

	public static void main(String[] args) {
		String org = "Pipeline-process-10.123.12.1-base";

		String ipAddress = org.codePoints().mapToObj(c -> Character.toString((char) c))
				.collect(StringBuilder::new, (sb, c) -> {
					if (sb.length() > 0 && c.equals("-")) {
						sb.append(c);
					} else if (c.matches("[0-9.]")) {
						sb.append(c);
					}
				}, StringBuilder::append).toString();

		System.out.println("Extracted IP address: " + ipAddress);
	}
}
