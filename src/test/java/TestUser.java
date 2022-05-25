import com.example.T2009m1_WCD_SEM4.model.MySqlUserModel;
import com.example.T2009m1_WCD_SEM4.model.User;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    public void TestCreateUser(){
        User user = new User();
        user.setFullName("chinh");
        user.setUsername("chinh");
        user.setEmail("chinh@gmail.com");
        user.setPasswordHash("123");
        user.setStatus(1);

        MySqlUserModel mySqlUserModel = new MySqlUserModel();
        boolean result = mySqlUserModel.save(user);
        System.out.println(result);
    }
}
