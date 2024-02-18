/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
* Namespace
* We can have another file called LessonOne
* com is a top-level domain that indicates that this is a commercial project
* mycompany - name of the comapny
* lessonone is the specific project, module, etc.
*/
package com.mycompany.lessonone;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author amith
 */
public class LessonOne {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Hello, World App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        frame.setSize(400, 200); // Set the window size
        
         // Create a JLabel (text label)
        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(JLabel.CENTER); // Center-align the text
        
        // Add the label to the frame
        frame.add(label);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}

