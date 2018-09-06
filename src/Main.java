public class Main {
    public static void main(String[] args) {
        Input input = new FileInput("input.txt");
        Output output = new FileOutput("output.txt");
        Characters characters = new KWICCharacters(input.read());
        Shifter shifter = new CircularShifter(characters.getCharacters());
        shifter.shift();
        Sorter sorter = new AlphabeticSorter();
        sorter.sort(shifter.getLines());
        output.write(sorter.getLines());
    }
}
