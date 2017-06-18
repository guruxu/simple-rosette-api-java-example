import com.basistech.rosette.api.HttpRosetteAPI;
import com.basistech.rosette.apimodel.DocumentRequest;
import com.basistech.rosette.apimodel.EntityMention;
import com.basistech.rosette.apimodel.EntitiesOptions;
import com.basistech.rosette.apimodel.EntitiesResponse;

import java.io.IOException;

public final class Example {
    public static void main(String[] args) {
        try {
            String data = "Washington D.C. is the capital of USA";
            HttpRosetteAPI rosetteApi = new HttpRosetteAPI.Builder()
                .key(System.getProperty("api.key"))
                .build();
            DocumentRequest<EntitiesOptions> request =
                new DocumentRequest.Builder<EntitiesOptions>().content(data).build();
            EntitiesResponse response = rosetteApi.perform(
                HttpRosetteAPI.ENTITIES_SERVICE_PATH, request, EntitiesResponse.class);
            for (EntityMention e: response.getEntities()) {
                System.out.println(String.format("%s (%s) - %s",
                    e.getMention(), e.getEntityId(), e.getType()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
