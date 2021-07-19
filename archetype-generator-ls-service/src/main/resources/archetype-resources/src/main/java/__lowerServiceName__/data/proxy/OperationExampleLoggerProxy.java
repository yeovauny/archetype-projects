package ${groupId}.${lowerServiceName}.data.proxy;

import ${groupId}.${lowerServiceName}.domain.gateway.Gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperationExampleLoggerProxy implements Gateway {

    @Autowired
    Gateway gatewayOperationExample;

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationExampleLoggerProxy.class);

    /**
     * proxy patter for caller the gatewayoperations for get external data
     *
     * */

    @Override
    public void methodExampleCaller() {

        try{
            LOGGER.info("logger request");
            gatewayOperationExample.methodExampleCaller();
        }catch (RuntimeException e){
            LOGGER.error(e.getMessage());
        }


    }
}
