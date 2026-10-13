package todo;

/**
 * The To-Do Item Class that represent each individual to-do.
 * @author socrates
 */
public class Task {
    private int id;
    private String title;
    private String completedAt;
    private String createdAt;


    /**
     *
     * @param id the id of the individual
     * @param title the actual list item
     * @param completedAt the date/time the item was completed
     * @param createdAt the date and time the item was created at.
     */
    public Task(int id, String title, String completedAt, String createdAt) {
        this.id = id;
        this.title = title;
        this.completedAt = completedAt;
        this.createdAt = createdAt;
    }

    /**
     * ID of the task, that decided the order displayed of the task
     * @return the ID of the task
     */
    public int getId() {
        return id;
    }

    /**
     *  The Title of the task( just the actual task)
     * @return Title of the Task
     */
    public String getTitle() {
        return title;
    }

    /**
     * The Completed At date to show completed tasks for the day.
     * @return The CompletedAt date.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * The CreatedAt Date that is displayed with every task.
     * @return  The CreatedAt date.
     */
    public String getCreatedAt() {
        return createdAt;
    }
}

