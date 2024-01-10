import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Ex {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new Record(90, "FFF"));
        System.out.println(json);

        Record record = gson.fromJson(json, new TypeToken<Record>() {}.getType());

        System.out.println(record);

    }
}
