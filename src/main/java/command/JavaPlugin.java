package command;

public class JavaPlugin {
    public static Build aplyJavaPlugin() {
        Compile compile = new Compile();
        Test test = new Test();
        test.addTask(compile);
        Package aPackage = new Package();
        aPackage.addTask(test);
        Build build = new Build();
        build.addTask(aPackage);
        return build;
    }
}
