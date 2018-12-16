package TestUser;

import bo.PetBO;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;

public class Test1 {

    private PetBO petBO = new PetBO();

    @Test
    public void test1() {
        String userID = "0";
        String response = petBO.addNewUser(userID, Response.Status.OK);
        System.out.println(response);
    }
}
