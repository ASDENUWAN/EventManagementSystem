package booking;

public class book {
	private int bid;
	private String type;
	private String venue;
	private String time;
	private String date;
	private String stat;
	
	
	public book() {}
	
	public book(int bid, String type, String venue, String time, String date, String stat) {
		
		this.bid = bid;
		this.type = type;
		this.venue = venue;
		this.time = time;
		this.date = date;
		this.stat = stat;
	}
	
	public int getBid() {
		return bid;
	}
	public String getType() {
		return type;
	}
	public String getVenue() {
		return venue;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public String getStat() {
		return stat;
	}
	
}
