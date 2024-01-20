package springframework.spring6DIdemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CtorInjectedControllerTest {
    @Autowired//this annotation is mandatory, without it controller field would be null because its not instantiated
            //anywhere in my test
            //It enables Spring to inject the CtorInjectedController bean into my test class preventing null pointer exc
            //when I try to use controller field (thats how Springs DI works)
CtorInjectedController controller;
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}