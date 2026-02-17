## Problem Statement
**Plugging Devices into Power Outlets**

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

<ul style="list-style-type: circle;">
  <li>Adaptee Objects:
    <ul style="list-style-type: disc;">
      <li>Laptop – Represents a laptop device that needs to be plugged into a power source. It has the charge() method.</li>
      <li>Refrigerator – Represents a refrigerator device that requires a power source. It has the startCooling() method.</li>
      <li>SmartphoneCharger – Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.</li>
    </ul>
  </li>
  
  <li>Target Object:
    <ul style="list-style-type: disc;">
      <li>PowerOutlet – Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.</li>
    </ul>
  </li>
  
  <li>Adapter Objects:
    <ul style="list-style-type: disc;">
      <li>LaptopAdapter – An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().</li>
      <li>RefrigeratorAdapter – An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().</li>
      <li>SmartphoneAdapter – An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().</li>
    </ul>
  </li>
</ul>

## UML Class Diagram
![alt text](https://github.com/angelxlyn/adapterPattern/blob/main/UML%20Class%20Diagram.png?raw=true)
