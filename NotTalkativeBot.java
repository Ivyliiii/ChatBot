public class NotTalkativeBot extends ChatBot{

	@Override
	public void sayHi() {
		System.out.println("Hi");
		
	}

	@Override
	public void sayBye() {
		System.out.println("Byeee");
		
	}

	@Override
	public void startConversation() {
		System.out.println("Sooo, how is life");
		
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("Great. What do you like to do?");
		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("Nice! How old are you?");
		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("Cool. Do you like talking with me?");
		
	}

}
