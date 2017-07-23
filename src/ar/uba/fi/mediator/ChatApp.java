package ar.uba.fi.mediator;

public class ChatApp {

	public static void main(String args[]) {
		ChatRoom chatRoom = new ChatRoomImpl();
		Participant prasad = new User(chatRoom, "Prasad");
		Participant aniket = new User(chatRoom, "Aniket");
		Participant harish = new User(chatRoom, "Harish");
		Participant amol = new User(chatRoom, "Amol");
		
		prasad.send("Hello friends");
		System.out.println();
		ChatRoom chatRoom2 = new ChatRoomImpl2();
		Participant juan = new User(chatRoom2, "Juan");
		Participant jose = new User(chatRoom2, "Jose");
		Participant javier = new User(chatRoom2, "Javier");
		Participant jorge = new User(chatRoom2, "jorge");
		
		javier.send("hola jotas!!!");
	}

}