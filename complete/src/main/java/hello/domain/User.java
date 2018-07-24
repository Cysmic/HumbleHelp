package hello.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNum;

    public User(String name, String lastName, String email, String phone){
        this.firstName = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phone;
    }

    @Override
    public String toString(){
        return String.format(
                "User[id=%d, firstName='%s', lastName='%s', email='%s', " +
                        "phone='%s']",
                id, firstName, lastName, email, phoneNum);
    }



}