package mySpring;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {


    private Map<Class, Class> ifc2Impl = new HashMap<>();


    public JavaConfig(){
        ifc2Impl.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Impl.put(Cleaner.class, PowerCleaner.class);
    }










    @Override
    public <T> Class<T> getImplClass(Class<T> ifc) {
        return ifc2Impl.get(ifc);
    }
}
