package ${groupId}.${lowerServiceName}.presentation;

import ${groupId}.${lowerServiceName}.domain.ServiceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleApiDelegateImpl {

    @Autowired
    ServiceExample serviceExampleLoggerProxy;

    public void methodApiDelegateExample(){

        serviceExampleLoggerProxy.exampleMethodOnServiceLayer();

    }

    @GetMapping("hola-mundo")
    public String getEndPointTest(){

        return "hola mundo";
    }

    @GetMapping("error-test")
    public String getErrorTest(){

        Assert.isNull(new String() , "this is a controller advice configurations");
        return "error";
    }


}
