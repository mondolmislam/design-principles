You are working on an e-commerce application that manages the stock of products
available in the warehouse. The stock is maintained in a singleton class StockManager.
The class has a private instance of itself and a public static method getInstance to return the instance.

The stock manager class should be thread-safe , meaning that multiple threads can access
the class simultaneously without any issues. How would you implement the StockManager class?