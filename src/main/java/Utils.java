import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class Utils {
    private final static Gson gson = new Gson();



    public static String saveToJson(Person person){
        return gson.toJson(person);
    }

    public static Person readFromJson(String json){

        return gson.fromJson(json, new TypeToken<Person>() {}.getType());
    }

}
