package test.services;

import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.ioc.annotations.Primary;
import org.apache.tapestry5.services.transform.ComponentClassTransformWorker2;

public class TapestryModule
{
    @Contribute(ComponentClassTransformWorker2.class)
    @Primary
    public static void provideTransformWorkers(
            OrderedConfiguration<ComponentClassTransformWorker2> configuration)
    {
        
//        configuration.overrideInstance("Import", ImportWorkerReplacement.class);
    }
}
