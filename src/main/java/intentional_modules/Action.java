package intentional_modules;

public class Action {
    private final String description;
    private final String type;

    public Action(String description, String type) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
