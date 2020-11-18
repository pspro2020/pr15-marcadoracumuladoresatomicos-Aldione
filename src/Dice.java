import java.util.concurrent.atomic.LongAdder;

public class Dice {

    private LongAdder longAdder1 = new LongAdder();
    private LongAdder longAdder2 = new LongAdder();
    private LongAdder longAdder3 = new LongAdder();
    private LongAdder longAdder4 = new LongAdder();
    private LongAdder longAdder5 = new LongAdder();
    private LongAdder longAdder6 = new LongAdder();

    public Dice (){
        longAdder1.add(0);
        longAdder2.add(0);
        longAdder3.add(0);
        longAdder4.add(0);
        longAdder5.add(0);
        longAdder6.add(0);
    }

    public int getNumber(int i) {
        return switch (i) {
            case 1 -> longAdder1.intValue();
            case 2 -> longAdder2.intValue();
            case 3 -> longAdder3.intValue();
            case 4 -> longAdder4.intValue();
            case 5 -> longAdder5.intValue();
            case 6 -> longAdder6.intValue();
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };
    }

    public void increasedRoll(int i){
        switch (i) {
            case 1 -> longAdder1.increment();
            case 2 -> longAdder2.increment();
            case 3 -> longAdder3.increment();
            case 4 -> longAdder4.increment();
            case 5 -> longAdder5.increment();
            case 6 -> longAdder6.increment();
        }
    }

}
