public class Module {
    private String name;
    private String id;

    public Module(String name, String id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            if (name.length() >= 1)
                this.name = name;
            else
                this.name = "UNDEFINED";
        }
        else
            this.name = "UNDEFINED";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            if (id.length() >= 1)
                this.id = id;
            else
                this.id = "UNDEFINED";
        }
        else
            this.id = "UNDEFINED";
    }
}
