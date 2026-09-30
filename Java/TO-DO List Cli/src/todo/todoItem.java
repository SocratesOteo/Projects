package todo;

/**
 * The To-Do Item Class that represent each individual to-do.
 * @author socrates
 */
public class todoItem {
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
    public todoItem(int id, String title, String completedAt, String createdAt) {
        this.id = id;
        this.title = title;
        this.completedAt = completedAt;
        this.createdAt = createdAt;
    }








}

