import org.rackbox.patterns.struct.decorator.ICoffee;
import org.rackbox.patterns.struct.decorator.MilkDecorator;
import org.rackbox.patterns.struct.decorator.SimpleCoffee;
import org.rackbox.patterns.struct.decorator.WhipDecorator;
import org.rackbox.patterns.struct.proxy.Image;
import org.rackbox.patterns.struct.proxy.ProxyImage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * Test the proxy pattern with image.
     * <p>
     * The proxy pattern provides a surrogate or placeholder for another object to control access to it.
     * <p>
     * In this example, we have a real image and a proxy image. The proxy image will load the real image from disk
     * only when it is needed.
     */
    public static void testProxy() {
        Image image = new ProxyImage("test_10mb.jpg");
        //image will be loaded from disk
        image.display();
    }

    /**
     * Test the decorator pattern with coffee.
     * <p>
     * The decorator pattern allows behavior to be added to individual objects, either statically or dynamically,
     * without affecting the behavior of other objects from the same class.
     * <p>
     * In this example, we have a simple coffee and we are adding milk and whip as decorators.
     */
    public static void testDecoratar() {
        ICoffee coffee = new SimpleCoffee();
        System.out.println("coffee-decorator: " + coffee.getDescription() + " = $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println("milk-decorator: " + coffee.getDescription() + " = $" + coffee.getCost());

        coffee = new WhipDecorator(coffee);
        System.out.println("whip-decorator: " + coffee.getDescription() + " = $" + coffee.getCost());
    }

    public static void main(String[] args) {
        System.out.println("DECORATOR: ===================================");
        testDecoratar();
        System.out.println("PROXY: ===================================");
        testProxy();
    }
}