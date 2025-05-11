import org.rackbox.patterns.struct.decorator.ICoffee;
import org.rackbox.patterns.struct.decorator.MilkDecorator;
import org.rackbox.patterns.struct.decorator.SimpleCoffee;
import org.rackbox.patterns.struct.decorator.WhipDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void testDecoratar() {
        ICoffee coffee = new SimpleCoffee();
        System.out.println("coffee-decorator: " + coffee.getDescription() + " = $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println("milk-decorator: " + coffee.getDescription() + " = $" + coffee.getCost());

        coffee = new WhipDecorator(coffee);
        System.out.println("whip-decorator: " + coffee.getDescription() + " = $" + coffee.getCost());
    }


    public static void main(String[] args) {
        testDecoratar();
    }
}