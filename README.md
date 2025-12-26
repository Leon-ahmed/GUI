# GUI

## Overview
This project is a simple **Java Swing GUI application** that demonstrates basic concepts of **GUI development, event handling, and custom drawing**.  
The application displays a window with two buttons—**Draw Circle** and **Clear**—along with a drawing panel.

When the user clicks **Draw Circle**, a circle is drawn inside the panel.  
When the user clicks **Clear**, the panel is reset to a blank state.

The source code was decompiled from a `.class` file using the **FernFlower decompiler (IntelliJ IDEA)**.

---

## Features
- Java Swing–based graphical user interface  
- Event handling using `ActionListener`  
- Custom drawing using a separate drawing panel  
- Button-controlled interaction  
- Simple and beginner-friendly structure  

---

## How the Application Works
1. The main window (`JFrame`) is created using the `Circle` class.
2. A custom `DrawingPanel` is placed at the center of the window.
3. Two buttons are added at the bottom:
   - **Draw Circle**: Triggers drawing a circle on the panel.
   - **Clear**: Removes all drawings from the panel.
4. Button clicks are handled through the `actionPerformed()` method.

---

## Technologies Used
- Java  
- Java Swing (`JFrame`, `JPanel`, `JButton`)  
- AWT Event Handling (`ActionListener`)  

---

## How to Run
1. Ensure Java is installed on your system.
2. Compile the program:
   ```bash
   javac Circle.java
```
Run the program:
    ```bash
    java Circle
