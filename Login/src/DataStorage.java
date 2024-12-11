import java.util.HashMap;

public class DataStorage {

    public static HashMap<String, String> usernamesAndPasswords = new HashMap<>(); //create hashmap of existing users and passwords
    public static HashMap<String, String> adminUsernamesAndPasswords = new HashMap<>(); //add new admin users to this hashmap

    public static void initialiseAccountHashMap() { //fills in existing user credentials
        usernamesAndPasswords.put("mattthematt", "Mattisthebest33");
        usernamesAndPasswords.put("john_frusciante", "RedHot");
        usernamesAndPasswords.put("keidisanthony", "ChiliPeppers");
        usernamesAndPasswords.put("thomyorke", "karmaPolice");
    }

    public static void initialiseAdminHashMap() { //fills in existing admin credentials
        adminUsernamesAndPasswords.put("admin", "root");
    }
}
