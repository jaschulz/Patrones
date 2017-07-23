package ar.uba.fi.mediator;

public class User implements Participant {

	private ChatRoom chatRoom = new ChatRoomImpl();
	private String name;

	public User(ChatRoom room, String name){
		this.chatRoom = room;
		this.name = name;
		this.chatRoom.addParticipant(this);
	}
	
	@Override
	public void send(String message) {
		System.out.println(this.getName() + " is sending a message " + message);
		chatRoom.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.getName() + " Received Message " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}