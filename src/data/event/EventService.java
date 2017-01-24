package data.event;

import java.util.ArrayList;
import java.util.Date;

public class EventService {

	static EventDao eventDao = new EventDao();
	
	public static ArrayList<Event> getAllEvents() {
		// TODO
		ArrayList<Event> events = new ArrayList<>();
		
		events.add(
				new Event(1, "Koncert Kabanos", new Date(1485145716), 18, "Jestem glodny wiece daje kabanosa", "Koncert", 1, 1));
		events.add(
				new Event(2, "Dawid Podsiadlo w Krakowie", new Date(1485145721), 18, "Jestem glodny wiece daje kabanosa", "Koncert", 1, 1));
		events.add(
				new Event(3, "Karrrrrrrancha", new Date(1485144716), 18, "Jestem glodny wiece daje kabanosa", "Koncert", 1, 1));
		events.add(
				new Event(4, "Ziemniaki pyry kartofle", new Date(1485145516), 18, "Jestem glodny wiece daje kabanosa", "Koncert", 1, 1));
		
		
		return events;
	}
	
	public static Event getEvent(int id) {
		Event ev = eventDao.getEventById(id);
		
		return ev;
	}

}
