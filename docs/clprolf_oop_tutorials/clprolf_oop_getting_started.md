
# How to Use the Clprolf Framework with an OOP Mindset - Introduction

It’s possible to use the Clprolf Framework while keeping a fully object-oriented approach, even though Clprolf itself is not based on traditional OOP.

To do so, simply don’t use all the annotations, and rely instead on class/interface declensions and roles, which can support your reasoning when organizing responsibilities.
🧩 Example – Structuring Responsibilities in a Class

Let’s say you’re about to create an OrderManager class.
You start realizing that the class might mix several different responsibilities.
That’s common — and the definition of “responsibility” is often vague in OOP.

Clprolf helps by suggesting clear role-based class types, to encourage clean separation.

```java
public class OrderManager {

    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }

    public void saveOrdersToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Order order : orders) {
                writer.write(order.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double calculateTotalRevenue() {
        double total = 0.0;
        for (Order order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }
}
```

✅ Refactored Version with Clprolf Roles

Here, we choose to keep the business logic (managing orders and calculating revenue) inside an @Agent class.
The printing and persistence tasks are moved into two @Worker_agent classes, as they belong to the technical layer.

This also allows reuse and separation, such as implementing a DAO pattern for persistence.

```java
@Agent
public class OrderManager {

    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double calculateTotalRevenue() {
        double total = 0.0;
        for (Order order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

@Worker_agent
public class OrderPrinter {

    private OrderManager manager;

    public OrderPrinter(OrderManager manager) {
        this.manager = manager;
    }

    public void printOrders() {
        for (Order order : this.manager.getOrders()) {
            System.out.println(order.toString());
        }
    }
}

@Worker_agent
public class OrderPersistence {

    private OrderManager manager;

    public OrderPersistence(OrderManager manager) {
        this.manager = manager;
    }

    public void saveOrdersToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Order order : this.manager.getOrders()) {
                writer.write(order.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

💡 Summary

This is not “pure” Clprolf usage — but a way to apply it in OOP while keeping your existing mindset.

You can think of @Agent and @Worker_agent as support annotations to help clarify and separate responsibilities in your object-oriented code.

It’s up to you to use more of the framework later, but even at this level, Clprolf already provides clarity and structure.