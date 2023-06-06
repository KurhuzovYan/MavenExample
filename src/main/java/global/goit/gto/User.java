package global.goit.gto;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class User {
    private String name;
    private String lastName;

    public User parser(String example){
        return  new Gson().fromJson(example, User.class);
    }

    @Override
    public String toString() {
        return name + System.lineSeparator() + lastName;
    }
}
