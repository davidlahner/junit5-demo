import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class TestInfoTestReporterDemo {

    @DisplayName("Injection Test")
    @Test
    void testInfoAndReporter(TestInfo info, TestReporter reporter) {
        reporter.publishEntry("display name", info.getDisplayName());
    }
}
