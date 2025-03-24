package udemy_advance.less4_NestedClass.Local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }


}

class Math{
    private int a = 10;

    public void getResult(){
        int dividend = 21;

        class Divide{
//            private int dividend;
            private int divisor;

//            public int getDividend() {
//                return dividend;
//            }
//
//            public void setDividend(int dividend) {
//                this.dividend = dividend;
//            }

            public int getDivisor() {
                return divisor;
            }

            public void setDivisor(int divisor) {
                this.divisor = divisor;
            }
            public int getQuotient(){
                return dividend/divisor;
            }
            public int getRest(){
                System.out.println(a);
                return dividend % divisor;
            }
        }

        Divide de = new Divide();
//        de.setDividend(21);
        de.setDivisor(4);
        System.out.println("Divident = " + dividend);
        System.out.println("Divisor = " + de.getDivisor());
        System.out.println("Quotient = " + de.getQuotient());
        System.out.println("Rest = " + de.getRest());

    }
}
