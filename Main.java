import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();

        /*ArrayList<Horse> changed = new ArrayList<Horse>();

        for (Horse horse : barn.getSpaces()) {
            if (horse != null) {
                if (horse.getName() == "Duke") {
                    changed.add(new Horse("Princess", 1445));
                } else if (horse.getName() == "Silver") {
                    changed.add(horse);
                    changed.add(new Horse("Chief", 1505));
                } else if (horse.getName() == "Buddy") {
                    changed.add(new Horse("Gypsy", 1335));
                    changed.add(horse);
                    changed.add(new Horse("Magic", 1425));
                } else {
                    changed.add(horse);
                }
            }
        }*/

        // barn.setSpaces(changed);

        // generate a list of the horses in randomized order
        ArrayList<Horse> randomizedHorses = RandomPermutation.next(barn.getSpaces());

        // if it's odd add a placeholder horse named "alone" at the end
        if ((randomizedHorses.size() & 1) != 0)
            randomizedHorses.add(new Horse("alone", 0));

        // print out each of the randomized horse pairs
        for (int i = 0; i < randomizedHorses.size(); i += 2) {
            // if the horse is named "alone" instead of printing "and" print "is"
            System.out.printf(randomizedHorses.get(i + 1).getName() == "alone" ? "%s is %s\n" : "%s and %s\n",
                    randomizedHorses.get(i).getName(), randomizedHorses.get(i + 1).getName());
        }
    }
}
