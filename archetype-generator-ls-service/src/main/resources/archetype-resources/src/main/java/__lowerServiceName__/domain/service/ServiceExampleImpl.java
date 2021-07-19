package ${groupId}.${lowerServiceName}.domain.service;

import ${groupId}.${lowerServiceName}.domain.ServiceExample;
import ${groupId}.${lowerServiceName}.domain.gateway.Gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceExampleImpl implements ServiceExample {

    @Autowired
    Gateway operationExampleLoggerProxy;

    /**
     * service layer for this service
     *
     * */


    @Override
    public void exampleMethodOnServiceLayer() {

        operationExampleLoggerProxy.methodExampleCaller();

    }
}
