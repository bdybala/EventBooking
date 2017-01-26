package data.event;

import java.util.ArrayList;
import java.util.Date;

public class EventService {

	static EventDao eventDao = new EventDao();
	
	public static ArrayList<Event> getAllEvents() {
		ArrayList<Event> events = new ArrayList<>();
		events = (ArrayList<Event>) eventDao.getAllEvents();
		
		return events;
	}
	
	public static Event getEvent(int id) {
		Event ev = eventDao.getEventById(id);
		
		return ev;
	}

}
