package udemy.lesson27;

public class Test13 {

    void marafon(int temperature, int speedRun) throws BrokenLegException {
        if(speedRun > 12) {
            throw new BrokenLegException("You broken leg, SpeedRun was too large: " + speedRun);
        }
        if(temperature > 30) {
            throw new CrampedMuscleException();
        }
        System.out.println("Marafon was finished!");
    }


    public static void main(String[] args) {

        Test13 test = new Test13();

        try{
            test.marafon(20, 14);
        }
        catch(BrokenLegException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("You get certificate!!!");
        }

    }
}

class BrokenLegException extends Exception{
    BrokenLegException(String msg){
        super(msg);
    }
    BrokenLegException(){}
}

class CrampedMuscleException extends RuntimeException{
    CrampedMuscleException(String msg){
        super(msg);
    }
    CrampedMuscleException(){}
}