import models.Toon;
import parser.SimcParser;
import talentAdder.TalentAdder;

public class Main {

    public static void main(String[] args) {
        String input = ""; //Input from somewhere
        Toon toon = SimcParser.createToonFromSimcString(input);
        String talentCombinations = TalentAdder.addAllTalentCombinations(toon);
        System.out.println(talentCombinations);
    }
}
