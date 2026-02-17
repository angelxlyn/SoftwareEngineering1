## Problem Statement
**Real-Time News Subscription Service**

**Background:** You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.

**Scenario Description:** The system comprises two main components: NewsAgency and Subscriber.
<ul>
  <li><b>NewsAgency:</b> Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.</li>
  <li><b>Subscriber:</b> Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.</li>
</ul>

**Requirements:**

**1. Subscription Management:**
<ul>
  <li>Users should be able to subscribe to the news service.</li>
  <li>Subscribers should be notified promptly when new news is published.</li>
</ul>

**2. Dynamic Subscription Updates:**
<ul>
  <li>The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.</li>
</ul>

**3. Decoupled Communication:**
<ul>
  <li>Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.</li>
</ul>

**Expected Behavior:**
<ul>
  <li>When the news agency publishes breaking news, all subscribed users should receive immediate updates.</li>
  <li>Subscribers can join or leave the service without affecting the delivery of news to other subscribers.</li>
  <li>The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.</li>
</ul>

**Constraints:**
<ul>
  <li>The system should be scalable to handle a growing number of subscribers without compromising performance.</li>
  <li>Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.</li>
</ul>

## UML Class Diagram
![alt text](https://github.com/angelxlyn/observerPattern/blob/main/UML%20Class%20Diagram.png?raw=true)
