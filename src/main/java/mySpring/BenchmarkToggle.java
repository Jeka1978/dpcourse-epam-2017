package mySpring;

import lombok.Data;
import lombok.SneakyThrows;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

@Data
public class BenchmarkToggle implements BenchmarkToggleMBean {
    private boolean enabled;

    @SneakyThrows
    public BenchmarkToggle() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(this,new ObjectName("epamMBEANS","name","benchmark"));
    }

    @Override
    public void shutDown(int code) {
        System.out.println("Идите обедать!!!");
        System.exit(code);
    }
}
