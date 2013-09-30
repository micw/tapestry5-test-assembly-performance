import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.tapestry5.dom.Document;
import org.apache.tapestry5.test.PageTester;
import org.junit.Test;


public class PerformanceTest
{
    @Test
    public void test()
    {
        PageTester tester=new PageTester("test", "Tapestry","src/main/webapp");
        renderPage(tester);
        tester.renderPage("ClearPageCache");
        
        startLogging();
        renderPage(tester);
    }
    
    protected void startLogging()
    {
//        ConsoleAppender console = new ConsoleAppender();
//        String PATTERN = "%d [%p|%c|%C{1}] %m%n";
//        console.setLayout(new PatternLayout(PATTERN)); 
//        console.setThreshold(Level.DEBUG);
//        console.activateOptions();
//        Logger.getLogger("org.apache.tapestry5").addAppender(console);
        
        FileAppender fa = new FileAppender();
        fa.setName("FileLogger");
        fa.setFile("target/PageAssembly.log");
        fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
        fa.setThreshold(Level.DEBUG);
        fa.setAppend(true);
        fa.activateOptions();
        Logger.getLogger("org.apache.tapestry5").addAppender(fa);
        
    }
    
    protected long renderPage(PageTester tester)
    {
        long start=System.currentTimeMillis();
        Document doc = tester.renderPage("Start");
        long duration=System.currentTimeMillis()-start;
        System.err.println("Duration: "+duration+" ms");
        return duration;
    }

}
