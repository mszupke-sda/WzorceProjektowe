import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import singleton.Singleton;

public class SingletonTest {

    @Test
    void testSingleton(TestInfo testInfo, TestReporter testReporter) {
        Singleton singleton = Singleton.createSingletonInstance();

        testReporter.publishEntry(singleton.getValue());
        singleton.setValue(testInfo.getDisplayName());
    }

    @Test
    void testSingleton2(TestInfo testInfo, TestReporter testReporter) {
        Singleton singleton = Singleton.createSingletonInstance();

        testReporter.publishEntry(singleton.getValue());
        singleton.setValue(testInfo.getDisplayName());
    }
}
