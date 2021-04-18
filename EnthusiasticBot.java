
public class EnthusiasticBot extends ChatBot{

	@Override
	public void sayHi() {
		System.out.println("Hi, it is great to meet you! I am the enthusiastic bot!");
	}

	@Override
	public void sayBye() {
		System.out.println("Wow! That's cool. It was really nice to talk to you! I hoep I'll see you again soon!");		
	}

	@Override
	public void startConversation() {
		System.out.println("So! How do you like St. Mark's? Do you find it pretty different from your old school?");
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("That's very true! I hope you could really enjoy your time here! What is your name?");		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("That's very cool! That's a great name! Is this your first time visiting the school?");		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("That is very nicee! Also, which grade are you currently in right now?");
		
	}
	
}
