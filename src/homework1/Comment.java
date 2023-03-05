package homework1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Comment {
    public int id;
    public  String name;
    public String email;
    public String body;

    ArrayList<String> titles;
}
