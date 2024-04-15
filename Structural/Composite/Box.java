package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private List<Component> children = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    public void addComponent(Component component) {
        children.add(component);
    }

    @Override
    public double getPrice() {
        double total = packagingCost;
        for (Component child : children) {
            total += child.getPrice();
        }
        return total;
    }
}