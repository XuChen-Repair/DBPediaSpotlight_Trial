import java.util.List;


class Extractor {
	private String query;
	private DB db;
	
	public Extractor(String tweet) {
		query = tweet;
		db = new DB ();
	}
	
	public List<String> getNameList() {
		db.configiration(0.0, 0, "non", "CoOccurrenceBasedSelector", "Default", "yes");
	    try {
			db.evaluate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    List<String> temp = db.getResu();
	    
	    return temp;
	}
}
