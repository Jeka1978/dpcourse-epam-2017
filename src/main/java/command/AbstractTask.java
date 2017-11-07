package command;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTask implements Task {
    private List<Task> dependencyTask = new ArrayList<>();

    public void addTask(Task task) {
        dependencyTask.add(task);
    }

    public void removeTask(Task task) {
        dependencyTask.remove(task);
    }

    @Override
    public void execute() {
        dependencyTask.forEach(Task::execute);
        executeMySelf();
    }

    protected abstract void executeMySelf();


}
