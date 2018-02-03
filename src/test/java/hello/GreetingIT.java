package hello;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GreetingIT {
    @Test
    public void firstEchoTest() {
        get("/greeting").then().assertThat().body("content", equalTo("Hello, World!"));
    }

    @Test
    public void secondEchoTest() {
        get("/greeting?name=Christopher").then().assertThat().body("content", equalTo("Hello, Christopher!"));
    }
}
