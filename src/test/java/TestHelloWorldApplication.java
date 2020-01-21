import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.example.helloworld.HelloWorldApplication;

public class TestHelloWorldApplication {

    @Test
    public void testGetName(){
        // Setup
        HelloWorldApplication app = new HelloWorldApplication();

        // Run
        assertEquals(app.getName(), "hello-world");
    }
}