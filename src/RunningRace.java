public class RunningRace {
public static void main(String[] args) {
	Athlete.raceLocation="San Diego";
	Athlete tom= new Athlete("tom", 10);
	Athlete fast = new Athlete("fast", 15);
	System.out.println(tom.name+" "+tom.bibNumber+" "+ Athlete.raceLocation);
	System.out.println(fast.name+" "+fast.bibNumber+" "+ Athlete.raceLocation);
     //create two athletes      //print their names, bibNumbers, and the location of their race. }
}
}
