package ar.uba.fi.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl2 implements ChatRoom {

	private List<Participant> participants = new ArrayList<Participant>();

	@Override
	public void sendMessage(String message, Participant participant) {
		for(Participant p : participants){
			if(p != participant){
				p.receive(message.toUpperCase());
			}
		}
	}

	@Override
	public void addParticipant(Participant participant) {
		participants.add(participant);
	}

}