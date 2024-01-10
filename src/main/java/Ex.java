import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class Ex {

    private final static TxtDataBase txtDataBase = new TxtDataBase();

    public static void main(String[] args) {
            init();

    }

    public static void init(){
        Person person = Utils.readFromJson(txtDataBase.read());
        System.out.println("read: "+person);
        if (person==null){
            person = new Person("Darth",22);
            txtDataBase.save(Utils.saveToJson(person));
            System.out.println("create new Person and save it");
        }


    }



}
