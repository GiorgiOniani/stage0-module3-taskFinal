package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean check = (number > 0) | (number < 0);
        String result = check? "true" : "false";
        System.out.println(result);

    }
}
