public class SarcasticBot extends ChatBot{

	@Override
	public void sayHi() {
		System.out.println("Hi, I hope you are doing REALLY REALLY WELL.");
	}

	@Override
	public void sayBye() {
		System.out.println("Bye, it was just SO NICE to talk to you. I hope that we will talk soon.");
		
	}

	@Override
	public void startConversation() {
		System.out.println("I heard ur 'really' good at coding. Are you?");
		
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("I guessed that too");
		System.out.println("To be honest, so many people nowadays brag about themselves. Do you think so?");
		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("That's true!");
		System.out.println("You are SO TALKATIVE, are you usually like this?");
		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("AH, I see. I mean you are such a nice peson! Right?");
		
	}

}
