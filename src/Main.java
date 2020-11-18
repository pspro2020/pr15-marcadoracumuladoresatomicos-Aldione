public class Main {

    public static void main(String[] args) {

        Thread[] diceThread = new Thread[3];
        Dice dice = new Dice();
        int i;

        for (i = 0; i < diceThread.length; i++) {
            diceThread[i] = new Thread(new DiceTask(dice));
        }

        for (i = 0; i < diceThread.length; i++) {
            diceThread[i].start();
        }
        for (i = 0; i < diceThread.length; i++) {
            try {
                diceThread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result(dice);
    }

    public static void result(Dice dice){
        int times = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.printf("Number %d: %d times\n", i, dice.getNumber(i));
            times += dice.getNumber(i);
        }
        System.out.printf("Total: %d + %d + %d + %d + %d + %d = %d\n", dice.getNumber(1), dice.getNumber(2), dice.getNumber(3), dice.getNumber(4), dice.getNumber(5), dice.getNumber(6), times);
    }

}
