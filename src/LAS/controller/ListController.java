package LAS.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import LAS.model.Kahoot;
import LAS.view.PopupDisplay;

public class ListController
{
private List<Kahoot> myKahoots;
private PopupDisplay popup;

public ListController()
{
	myKahoots = new ArrayList<Kahoot>();	
}

public void start()
{
	Kahoot myFirstKahoot = new Kahoot();
	myKahoots.add(myFirstKahoot);
	fillTheList();
	showTheList();
}

private void showTheList()
{
	String currentCreator = "";
	for (int index = 0; index < myKahoots.size(); index += 1)
	{
		currentCreator = myKahoots.get(index).getCreator();
		
		Kahoot currentKahoot = myKahoots.get(index);
		String creator = currentKahoot.getCreator();
		
		
		popup.displayText(myKahoots.get(index).toString());
		
		if (currentCreator.equals("nobody"))
		{
			for (int loop = 0; loop < 5; loop += 1)
			{
				popup.displayText("wow nobody does a lot");
			}
			
		}
		
		for (int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex +=1)
		{
			popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
		}
		String topic = currentKahoot.getTopic();
		
		for (int letter = currentKahoot.getTopic().length()-1; letter>= 0; letter -=1)
		{
			popup.displayText(topic.substring(letter, letter + 1));
		}
	}
}


private void fillTheList()
{
	Kahoot fiftyStates = new Kahoot ("Kashish", 50, "The fifty United States");
	Kahoot mySecondKahoot = new Kahoot ("Ethan", 2, "The Double data type");
	Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything - literally");
	Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of all the animals");
	Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
	myKahoots.add(fiftyStates);
	myKahoots.add(mySecondKahoot);
	myKahoots.add(bigQuiz);
	myKahoots.add(animalColor);
	myKahoots.add(presidents);
}

private void changeTheList()
	{
	popup.displayText("The current list size is: " + myKahoots.size());
	Kahoot removed = myKahoots.remove(3);
	popup.displayText("I removed the Kahoot by " + removed.getCreator());
	popup.displayText("The list now has: " + myKahoots .size() + " items inside.");
	myKahoots.add(0, removed);
	
	popup.displayText("The list is still:" + myKahoots.size() + " items big.");
	removed = myKahoots.set(2, new Kahoot());
	popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with one by: " + myKahoots.get(2).getCreator());
	
	}
}
