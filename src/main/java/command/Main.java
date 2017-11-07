package command;

public class Main {
    public static void main(String[] args) {
        Build build = JavaPlugin.aplyJavaPlugin();
        build.addTask(new AbstractTask() {
            @Override
            protected void executeMySelf() {
                System.out.println("cleaning");
            }
        });
        build.execute();
    }
}
