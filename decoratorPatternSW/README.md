## Problem Statement
**Customizing Coffee Orders**

A popular coffee shop, "Brewtiful," wants a flexible way to calculate the cost and list the ingredients of customized coffee orders. Customers can choose a basic coffee type, and then add various toppings or flavor shots. The system must allow for any combination of additions.

Key Requirements
Core Component: A basic coffee (e.g., Espresso, Black Coffee) with a base cost.

Dynamic Enhancements: Additions like Milk, Sugar, Caramel Syrup, or Whipped Cream must be applied on top of the basic coffee.

Combinability: Customers should be able to combine multiple additions (e.g., an Espresso with Milk and Caramel).

Interface Consistency: All components (basic coffee and additions) should share a common interface so that additions can wrap other additions or the base coffee.

**Implementation Structure (Coffee Shop)**

**1. The Component Interface**

This defines the common operations for both the basic item and the decorators.
<ul>
  <li><b>Interface:</b> Coffee</li>
  <li><b>Operation:</b> getDescription() (returns the ingredients) and getCost() (returns the price).</li>
</ul>

**2. The Concrete Component**

This is the original, basic object that will be decorated.
<ul style="list-style-type: circle;">
  <li><b>Class:</b> BlackCoffee</li>
  <li><b>Implementation:</b></li>
    <ul style="list-style-type: disc;">
      <li>getDescription(): returns "Black Coffee"</li>
      <li>getCost(): returns  ₱ 100.00</li>
    </ul>
</ul>

**3. The Decorator Abstraction**

This ensures the decorator classes implement the Coffee interface and have a way to hold a reference to the Coffee object they are wrapping.
<ul>
  <li><b>Abstract Class/Interface:</b> CoffeeDecorator (implements Coffee)</li>
  <li><b>Implementation:</b> Holds a private Coffee object and has a constructor/setter to wrap it. The methods will typically call the wrapped object's method before adding its own enhancement.</li>
</ul>

**4. The Concrete Decorators**

These classes add specific features (cost and description) to the wrapped Coffee object.
<ul style="list-style-type: circle;">
  <li><b>Class:</b> Milk (implements CoffeeDecorator)</li>
    <ul style="list-style-type: disc;">
      <li><b>Implementation:</b></li>
        <ul style="list-style-type: square;">
          <li>getDescription(): returns wrappedCoffee.getDescription() + ", Milk"</li>
          <li>getCost(): returns wrappedCoffee.getCost() +   ₱ 25.00</li>
        </ul>
    </ul>
  <li><b>Class:</b> CaramelSyrup (implements CoffeeDecorator)</li>
    <ul style="list-style-type: disc;">
      <li><b>Implementation:</b></li>
        <ul style="list-style-type: square;">
          <li>getDescription(): returns wrappedCoffee.getDescription() + ", Caramel Syrup"</li>
          <li>getCost(): returns wrappedCoffee.getCost() + ₱ 40.00</li>
        </ul>
    </ul>
</ul>
