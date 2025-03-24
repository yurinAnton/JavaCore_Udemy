package udemy.lesson27;

public class HomeW {
    public static void main(String[] args) {

        Tiger2 t2 = new Tiger2();
        t2.eat("myaso");

        try {
            t2.drink("voda");
            try{
                t2.drink("pivo");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class NeMyasoException extends RuntimeException{
    NeMyasoException (String food){
        super(food);
    }
}

class NeVodaException extends Exception{
    NeVodaException(String food) {
        super(food);
    }
}

class Tiger2 {

    void eat(String food){
        if(food != "myaso"){
            throw new NeMyasoException("Tiger can't eat: " + food);
        } else {
            System.out.println("Tiger eat meat!");
        }
    }

    void drink(String liquid) throws NeVodaException {
        if(liquid != "voda"){
            throw new NeVodaException("Tiger can't drink: " + liquid);
        } else {
            System.out.println("Tiger drink water!");
        }
    }

}

