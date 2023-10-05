package Practice16.task3;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {

    HashMap<String, HashMap<String, String>> services;

    public boolean add(String service, String username, String password){
        HashMap<String, String> tempHm;
        if (services.containsKey(service)){
            tempHm = services.get(service);
            if (tempHm.containsKey(username)){
                return false;
            }
            else{
                tempHm.put(username, password);
                return true;
            }
        }
        else{
            tempHm = new HashMap<>();
            tempHm.put(username, password);
            services.put(service, tempHm);
            return true;
        }
    }

    public Boolean check(String service, String username, String password){
        if (!services.containsKey(service))
            return false;
        if (!services.get(service).containsKey(username)){
            return false;
        }
        return (services.get(service).get(username).equals(password));

    }
    public Database() {
        services = new HashMap<>();
    }
}
