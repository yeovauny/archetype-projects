package ${groupId}.${lowerServiceName}.controller;

import ${groupId}.${lowerServiceName}.presentation.ExampleApiDelegateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ${serviceName}ControllerResources {

    @Autowired
    ExampleApiDelegateImpl exampleApiDelegate;

    @GetMapping("hola")
    public String metodo(){

        exampleApiDelegate.methodApiDelegateExample();

        return "hola mundo";
    }


}
