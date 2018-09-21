/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program generates 10 numbers from 1 and 99 and returns them to the 
 * 		user in an array. It then tells the user what the min value and max
 * 		value 
 *
 ****************************************************************************/
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.Random;

public class MaxMinArr {

	public static void main(String[] args) {
		// generates window
		JFrame maxMinFrame = new JFrame("Max Min Numbers Array");
		JButton numGenButton = new JButton("Generate Numbers"); 
		JTextArea arrayView = new JTextArea();
		
		maxMinFrame.add(numGenButton);
		maxMinFrame.add(arrayView);
		maxMinFrame.setSize(500,500);  
		maxMinFrame.setLayout(null);  
		maxMinFrame.setVisible(true);
		maxMinFrame.setLocation(0,0);
		
		arrayView.setBounds(0, 0, 400, 200);
		arrayView.setLocation(50, 200);
		arrayView.setEditable(false);
		arrayView.setWrapStyleWord(true);
		
		numGenButton.setBounds(50,100,95,30);  
		numGenButton.setLocation(200,150);
		
		numGenButton.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent buttonClicked) {
				  int array[]; 
					array = NumsGen();
					
					int numsMin;
					numsMin = MinFind(array);
					
					int numsMax;
					numsMax = MaxFind(array);
					
					String textArray = "";
				      for(int counter: array){
				    	  textArray = textArray + counter + "\n" ;
				             arrayView.setText(textArray);
				      }
				      arrayView.append("\nThe minimum value in the array is " + numsMin + " and the maximum is " + numsMax + ".");
			  }

			});
		
	}
	
	public static int[] NumsGen() { 
		//generates 10 numbers from 1 to 99
		int[] numbersArray = new int[10]; 
		int randNum;
		Random randGen = new Random();
		
		for(int counter = 0; counter < numbersArray.length; counter++) {
			randNum = randGen.nextInt(99) + 1;
			numbersArray[counter] = randNum;
			//test - System.out.println(numbersArray[counter]);
		}
	return numbersArray;
	}
	
	public static int MinFind(int minarray[]) {
		//finds min number in array
		int min;
		min = minarray[0];
		
		for (int counter = 1; counter < minarray.length; counter ++) {
			if (minarray[counter] < min) {
				min = minarray[counter];
			}
		}
		//test - System.out.println(min);
		return min;
	}
	
	public static int MaxFind(int maxarray[]) {
		//finds max number in array
		int max;
		max = maxarray[0];
		
		for (int counter = 0; counter < maxarray.length; counter ++) {
			if (maxarray[counter] > max) {
				max = maxarray[counter];
			}
		}
		//test - System.out.println(max);
		return max;
	}
}