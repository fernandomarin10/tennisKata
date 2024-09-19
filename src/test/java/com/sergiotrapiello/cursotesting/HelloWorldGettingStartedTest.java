package com.sergiotrapiello.cursotesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class HelloWorldGettingStartedTest {

    @Test
    void gettingStarted(){
        HelloWorld hw = new HelloWorld();
        String result = hw.greet();
        assertEquals("Hello World!", result);
        
    }
}
