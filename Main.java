import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();

        ArrayList<Horse> changed = new ArrayList<Horse>();

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
        }

        // barn.setSpaces(changed);

        ArrayList<Horse> randomizedHorses = RandomPermutation.next(barn.getSpaces());

        if ((randomizedHorses.size() & 1) != 0)
            randomizedHorses.add(new Horse("alone", 0));

        for (int i = 0; i < randomizedHorses.size(); i += 2) {
            System.out.printf(randomizedHorses.get(i + 1).getName() == "alone" ? "%s is %s\n" : "%s and %s\n",
                    randomizedHorses.get(i).getName(), randomizedHorses.get(i + 1).getName());
        }
    }
}
