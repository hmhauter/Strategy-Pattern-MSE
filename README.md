# Strategy-Pattern
Implementierung des Strategy-Patterns im Rahmen des Informatik II Kurses für MSE

# Aufgabe
Imagine you are working in the automotive industry and are tasked with writing
the code for an engine controller. The controller is supposed to read the values
from an NOx sensor and provide them to the Main class.
During testing you realize the engine sometimes produces too much NOx and
exceeds the allows limits. As a quick fix you decide to implement two different
strategies for your controller to use.
While on the road, the controller simply provides the values read by the senser.
When a test kit is connected, the controller also reads the values but reduces
values that are over the limit.
Let the limit for NOx be 300. You can use the random number generate to
simulate the NOx sensor. Let the sensor generate values between 200 and 400.
Create Classes for the engine controller, NOx sensor, and the strategies
including interface. Draw the UML diagram J ( This is free exam practice)
The controller has a public method getNOx() that uses the strategy to read from
the sensor. This means the strategy needs to have a reference to the NOx
sensor.
The controller also has a method to connect the test kit connectTestKit(). When
a test kit gets connected the controller should change its strategy to only report
“correct” values.