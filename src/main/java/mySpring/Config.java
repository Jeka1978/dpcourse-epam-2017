package mySpring;

public interface Config {
    <T> Class<T> getImplClass(Class<T> ifc);
}
