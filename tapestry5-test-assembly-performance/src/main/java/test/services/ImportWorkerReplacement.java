package test.services;

import org.apache.tapestry5.internal.transform.ImportWorker;
import org.apache.tapestry5.ioc.services.SymbolSource;
import org.apache.tapestry5.model.MutableComponentModel;
import org.apache.tapestry5.plastic.PlasticClass;
import org.apache.tapestry5.services.AssetSource;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import org.apache.tapestry5.services.transform.TransformationSupport;

public class ImportWorkerReplacement extends ImportWorker
{

    public ImportWorkerReplacement(JavaScriptSupport javascriptSupport, SymbolSource symbolSource, AssetSource assetSource)
    {
        super(javascriptSupport, symbolSource, assetSource);
    }
    
    @Override
    public void transform(PlasticClass componentClass, TransformationSupport support, MutableComponentModel model)
    {
//        super.transform(componentClass, support, model);
        System.err.println("skipped");
    }
}
