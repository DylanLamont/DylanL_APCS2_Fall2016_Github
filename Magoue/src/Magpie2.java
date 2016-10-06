
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if(statement.indexOf("Dreyer") >= 0){
			response = "Isn't Mrs. Dreyer the best teacher?";
		} else if( statement.indexOf("deHeer")>=0){
			response = "Where would that class be without Mr. Deheer's help?";
		} else if (statement.indexOf("Lamont")>=0){
			response = "Mr. Lamont is a good teacher, but his greatest accomplishment is probably his son.";
		} else if (statement.indexOf("java")>=0){
			response = "Do you like the programming language?";
		} else if (statement.indexOf("Mills")>=0){
			response = "Mills is much better than any other high school.";
		} else if (statement.indexOf("robotics")>=0){
			response = "Speaking of robotics, Mills High School I heard has a good team.";
		} else {
			response = getRandomResponse();
		} if (statement.trim().length()<1){
			response = "Say something, please.";
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "That sounds fantastic.";
		} else if (whichResponse == 5) {
			response = "What do you mean?";
		}

		return response;
	}
}
