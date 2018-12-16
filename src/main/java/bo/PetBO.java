package bo;

import client.JerseyClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import model.Pet;
import org.testng.Assert;

import javax.ws.rs.core.Response;

public class PetBO {

    public String findPetByID(String petID, Response.Status status) {
        ClientResponse clientResponse = JerseyClient.findPetByID(petID);
        Assert.assertEquals(clientResponse.getStatus(), status.toString());
        String output = clientResponse.getEntity(String.class);
        Assert.assertNotNull(output);
        return output;
    }
    public String addNewUser(String userID, Response.Status status) {
        ClientResponse clientResponse = JerseyClient.addNewUser(userID);
        Assert.assertEquals(clientResponse.getStatus(), status.toString());
        String output = clientResponse.getEntity(String.class);
        Assert.assertNotNull(output);
        return output;
    }
    public String addNewPet(Pet pet , Response.Status status) {
     //   ObjectMapper objectMapper
        ClientResponse clientResponse = JerseyClient.addNewPet(pet.toString());
        Assert.assertEquals(clientResponse.getStatus(), status.getStatusCode());
        String output = clientResponse.getEntity(String.class);
   //     Assert.assertNotNull(output);
        return output;
    }
}
