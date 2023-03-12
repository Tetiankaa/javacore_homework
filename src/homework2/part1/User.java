package homework2.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company  company;

//    public User(int id, String name, String username, String email, String street,String suite,String city,String zipcode,  String phone, String website,String companyName,String catchPhrase,String bs ) {
//        this.id = id;
//        this.name = name;
//        this.username = username;
//        this.email = email;
//        this.address = new Address(street,suite,city,zipcode);
//        this.phone = phone;
//        this.website = website;
//        this.company = new Company(companyName,catchPhrase,bs);
//    }
}
