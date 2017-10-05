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
	for (int index = 0; index < List < myKahoots.size(); index += 1)
	{
		popup.displayText(myKahoots.get(index));
	}
}


private void fillTheList()
{
	Kahoot fiftyStates = new Kahoot ("Kashish", 50);
	Kahoot mySecondKahoot = new Kahoot ("Ethan", 2);
	Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
	Kahoot animalColor = new Kahoot("Branton", 10);
	Kahoot presidents = new Kahoot("Obama", 44);
	myKahoots.add(fiftyStates);
	myKahoots.add(mySecondKahoot);
	myKahoots.add(bigQuiz);
	myKahoots.add(animalColor);
	myKahoots.add(presidents);
}
}
