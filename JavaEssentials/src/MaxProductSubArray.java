import java.util.*;
public class MaxProductSubArray{
    static int findMaxNum(Stack<Integer> stc){
        int max_num =0 ;
        for (int i=0; i<(stc.size()); i++)
        {
            if (stc.get(i)>max_num)
            {
                max_num = stc.get(i);
            }
        }
        return max_num;

    }

    static Stack<Integer> intArrToStack(int [] int_arr)
    {

        Stack<Integer> stc_int = new Stack<>();
        for (int i=0; i<int_arr.length;i++)
        {

            stc_int.push(int_arr[i]);
        }
        return stc_int;
    }

    public static void main(String[] args)
    {

        int [] int_inp_arr= {23,7,4,6,9,11,13};
        Stack<Integer> stc_int = intArrToStack(int_inp_arr);
        int max_num1 = findMaxNum(stc_int);
        stc_int.remove(stc_int.lastIndexOf(max_num1));
        int max_num2 = findMaxNum(stc_int);
        int product = max_num1*max_num2;
        System.out.println("Product Pair : {" + max_num1 + "," + max_num2 + "} ; max_product : " + product);

    }
}
