package test.pages;

import javax.inject.Inject;

import org.apache.tapestry5.internal.services.PageSource;
import org.apache.tapestry5.util.TextStreamResponse;

public class ClearPageCache
{
    @Inject
    private PageSource source;
    public void onActivate()
    {
        System.err.println("Clearing Cache");
        source.clearCache();
    }
}
