package My_Pack;

public class GetSet {
	public static long trainnum;
	public static String email;


	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		GetSet.email = email;
	}

	public static long getTrainnum() {
		return trainnum;
	}

	public static void setTrainnum(long trainnum) {
		GetSet.trainnum = trainnum;
	}

	public GetSet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
