package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		//write a code that will give you placeId
		//execute this code only when placeId is null
		
		StepDefinition m = new StepDefinition();
		if(StepDefinition.place_id==null) {
			m.add_place_payload("Kononov", "French", "Asia");
			m.user_calls_with_post_http_request("addPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Kononov", "getPlaceAPI");
		}
		
	}
}
