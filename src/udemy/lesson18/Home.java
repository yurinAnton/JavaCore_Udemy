package udemy.lesson18;

public class Home {

    public static void main(String[] args) {

        int[] array1 = {4, 8, 5, -3, 0, 8, 2, -2};
        Sort st = new Sort();
        st.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        //---------task 2

        System.out.println();
        String array2[][] = {{"apple", "orange"}, {"hello", "bye", "ok"}, {"car"}};
        st.showArray(array2);


    }
}

class Sort{

    public int[] sort(int[] array){
        int a;
        for(int i=0;i<array.length-1;i++){
            int min = array[i];
            int index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            if( i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public void showArray(String[][] array){
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array[i].length; j++) {
                if(j != array[i].length-1){
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if(i != array.length-1){
                System.out.print(" }, ");
            } else {
                System.out.print(" }");
            }
        }
        System.out.println(" }");
    }
}
