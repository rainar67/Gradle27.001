package TestUser;
import bo.PetBO;
import builder.PetCreatorRQ;
import data.PetData;
import model.Pet;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;


public class Test3 {
    private PetBO petBO=new PetBO();

    @Test
    public void  testPetCreation(){
        PetData petData =new PetData();
        petData.namePet="NewPet";
       Pet newPetToCreate= new PetCreatorRQ(petData).createPet();
      petBO.addNewPet(newPetToCreate, Response.Status.OK);
    }

}
