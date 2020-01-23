package classList;

public class room {
	public int R_ID;
	public String Room_Details;
	public String Room_Type;
	public int Room_Rent;
	
	public room(int r_ID, String room_Details, String room_Type, int room_Rent) {
		R_ID = r_ID;
		Room_Details = room_Details;
		Room_Type = room_Type;
		Room_Rent = room_Rent;
	}
	
	public void display(int RoomID) {
		if(RoomID==R_ID) {
			System.out.println("Room Number : "+R_ID);
			System.out.println("Room Details : "+Room_Details);
			System.out.println("Room Type : "+Room_Type);
			System.out.println("Room Rent : "+Room_Rent);
		}
	}
	
}
