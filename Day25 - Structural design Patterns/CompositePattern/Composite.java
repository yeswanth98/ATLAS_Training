package CompositePattern;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private String groupName;
    private List<Component> components = new ArrayList<>();

    public Composite(String groupName) {
        this.groupName = groupName;
    }

    public void add(Component subComponent) {
        components.add(subComponent);
    }

    @Override
    public void brandName() {
        System.out.println("Group: " + groupName);
        for (Component comp : components) {
            comp.brandName();
        }
    }
}