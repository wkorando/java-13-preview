package com.ibm.developer;

public class PreviewJavaFeatures {

	public static void main(String args[]) {
		
		String season = args[0];
		int yieldResult = switch (season) {
		case "FALL" -> 4;
		case "SPRING", "SUMMER", "WINTER" -> 6;
		default -> {
			int k = season.toString().length();
			int result = k;
			yield result;
		}
		};
		
		String jsonMessage = String.format(
		"""
        {
                "season" : "%s",
                "wordLength" : "%d"
        }
        """, season, yieldResult);
        System.out.println(jsonMessage);
	}
}
