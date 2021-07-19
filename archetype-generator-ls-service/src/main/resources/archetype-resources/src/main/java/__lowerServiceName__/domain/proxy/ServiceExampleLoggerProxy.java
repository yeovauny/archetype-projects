package ${groupId}.${lowerServiceName}.domain.proxy;

import ${groupId}.${lowerServiceName}.domain.ServiceExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceExampleLoggerProxy implements ServiceExample {

    @Autowired
    ServiceExample serviceExampleImpl;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceExampleLoggerProxy.class);

    /**
     * proxy pattern for call the service layer.
     *
     * */

    @Override
    public void exampleMethodOnServiceLayer() {
            try{
                LOGGER.info("loggear request");
                serviceExampleImpl.exampleMethodOnServiceLayer();
            }catch(RuntimeException e){
                LOGGER.error(e.getMessage());
            }

    }
}
