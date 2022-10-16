package object_oriented;

public class Main_object {
    public static void run() {
        Input input = new Input();
        input.input("input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("output.txt");

    }
}

