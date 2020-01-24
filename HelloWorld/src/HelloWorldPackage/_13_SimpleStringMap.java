package HelloWorldPackage;

/** This class implements a simplified version of a Map class for strings. */

public class _13_SimpleStringMap {
	
	private static final int N_BUCKETS = 7;
	private HashEntry[] bucketArray;
	
	public _13_SimpleStringMap() {
		bucketArray = new HashEntry[N_BUCKETS];
	}

	public void put(String key, String value) {
		int bucket = Math.abs(key.hashCode()) % N_BUCKETS;
		HashEntry entry = findEntry(bucketArray[bucket], key);
		if (entry == null) {
			entry = new HashEntry(key, value);
			entry .setLink (bucketArray [bucket] ) ;
			bucketArray[bucket] = entry;
		} else {
			entry .setValue(value) ;
		}
	}
	
	public String get (String key) {
		int bucket = Math.abs(key.hashCode()) % N_BUCKETS;
		HashEntry entry = findEntry(bucketArray[bucket], key);
		if (entry == null) {
			return null;
		} else {
			return entry.getValue();
		}
	}
	
	private HashEntry findEntry(HashEntry entry, String key) {
		while (entry != null) {
			if (entry.getKey().equals(key)) return entry;
			entry = entry.getLink();
		}
		return null;
	}

}


class HashEntry {
	
	/* Creates a new HashEntry for the specified key/value pair */
	public HashEntry(String key, String value) {
		entryKey = key;
		entryValue = value;
	}
	/* Returns the key component of a HashEntry */
	public String getKey() {
		return entryKey;
	}
	/* Returns the value component of a BashPrtry */
	public String getValue() {
		return entryValue;
	}
	/* Sets the value component of a HashEntry to a new value */
	public void setValue(String value) {
		entryValue = value;
	}
	/* Returns the next link in the ontry chain */
	public HashEntry getLink() {
		return entryLink;
	}
	/* Sets the link to the next entry in the chain */
	public void setLink(HashEntry nextEntry) {
		entryLink = nextEntry;
	}
	/* Private instance variables */
	private String entryKey; // The key component for this HashEntry af
	private String entryValue; // The value component for this HaeshEntry “f
	private HashEntry entryLink; // A reference to the next entry in the chain */
	
}
