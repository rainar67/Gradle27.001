package TestPet;

import bo.PetBO;
import builder.TagBuilder;
import model.Tag;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;

public class Test2 {

    private PetBO petBO = new PetBO();

    @Test
    public void test2() {
        String petId = "8";
        String response = petBO.findPetByID(petId, Response.Status.OK);
        System.out.println(response);
    }
@Test
    public  void test3(){
        Integer x =2423;
    Tag tag =new TagBuilder().setId(x).setName("Wqeewes").build();
}


}
