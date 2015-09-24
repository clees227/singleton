package headfirst.factory.pizzas;

public class PizzaStore {
  SimplePizzaFactory factory;

  public PizzaStore() {
    factory = SimplePizzaFactory.getInstance();
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
