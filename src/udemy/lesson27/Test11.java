package udemy.lesson27;

public class Test11 {

//    void abc(){
//        int[] array = {1, 2, 3};
//        try{
//            System.out.println(array[7]);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            String s = null;
//            System.out.println(s.length());
//        }
//        catch(NullPointerException e){
//            System.out.println("NullPointerException was thrown");
//        }
//    }
    //-------------------------------------------------

    static String abc(){
        String s1 = "";
        String s2 = null;
        try{
            try{
                s1+="1";
                s2.charAt(3);
                s1+="2";
            }
            catch(NullPointerException e){
                s1+="3";
                throw new RuntimeException();
            }
            finally {
                s1+="4";
                throw new Exception();
            }
        }
        catch(Exception e){
            s1+="5";
        }
        return s1;
    }


    public static void main(String[] args) {

        Test11 t = new Test11();
        t.abc();

    }
}
