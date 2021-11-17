package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	private String message;

	/*
	 * used default as well as parameterized constructor and defined the function
	 * which return the value as happy and sad.
	 */
	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {

			if (this.message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
