## Problem Statement
**Integrating Different School Systems into a Unified School Management Application**

You are developing a school management application that helps administrators manage various school systems such as attendance, grading, and library management. Each system has different interfaces and methods. To ensure compatibility and seamless integration, you need to create adapters for different systems to allow them to connect to the unified school management application.

<ul style="list-style-type: circle;">
  <li>Adaptee Objects:
    <ul style="list-style-type: disc;">
      <li>AttendanceSystem - Represents an attendance tracking system that needs to be integrated. It has the markAttendance() method.</li>
      <li>GradingSystem - Represents a grading system that requires integration. It has the recordGrades() method.</li>
      <li>LibrarySystem - Represents a library management system that needs to be integrated. It has the manageBooks() method.</li>
    </ul>
  </li>
  
  <li>Target Object:
    <ul style="list-style-type: disc;">
      <li>SchoolManagementApp - Represents a unified school management application with a common interface for integrating systems. It defines the integrateSystem() method as the target method.</li>
    </ul>
  </li>
  
  <li>Adapter Objects:
    <ul style="list-style-type: disc;">
      <li>AttendanceSystemAdapter - An adapter for integrating the attendance system into the school management application. It adapts the AttendanceSystem to the SchoolManagementApp interface, translating integrateSystem() to markAttendance().</li>
      <li>GradingSystemAdapter - An adapter for integrating the grading system into the school management application. It adapts the GradingSystem to the SchoolManagementApp interface, translating integrateSystem() to recordGrades().</li>
      <li>LibrarySystemAdapter - An adapter for integrating the library management system into the school management application. It adapts the LibrarySystem to the SchoolManagementApp interface, translating integrateSystem() to manageBooks().</li>
    </ul>
  </li>
</ul>

## UML Class Diagram
![alt text](https://github.com/angelxlyn/adapterPatternSW/blob/main/UML%20Class%20Diagram.png?raw=true)
