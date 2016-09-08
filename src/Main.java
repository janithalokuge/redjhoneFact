import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.math.BigInteger;
import java.util.regex.*;
import com.google.common.math.BigIntegerMath;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        int n;
        int fourBlocks;
        int total;
        BigInteger tempTotal;

        for (int i = 0 ; i < t; i++) {
            n = scn.nextInt();
            total  = 0;
            fourBlocks = 0;


            if (n > 0) {
                total+=1;
                fourBlocks = n / 4;
            }

            for (int j = 0 ; j < fourBlocks; j++ ) {
                int tmpFourBlocks = j + 1;
                int tempSingleBlocks = n - tmpFourBlocks*4;
                int elements = tmpFourBlocks + tempSingleBlocks;

//                BigInteger totVal = getVal(elements);
//                BigInteger fourVal = getVal(tmpFourBlocks);
//                BigInteger singleVal = getVal(tempSingleBlocks);

//                tempTotal = new BigInteger(totVal.toString());
//                tempTotal = tempTotal.divide(fourVal).divide(singleVal);

                int result = 1;
                int p;
                int q;

                if(tmpFourBlocks >= tempSingleBlocks){
                    p = tmpFourBlocks;
                    q = tempSingleBlocks;
                } else {
                    p = tempSingleBlocks;
                    q = tmpFourBlocks;
                }




                if (elements>p && p>0) {
                    int l = p+1;
                    while (l<=elements) {
                        result *=l;
                        l++;
                    }
                    //System.out.println("n!/k!=" + result );
                }

                int fist = BigIntegerMath.factorial(q).intValue();

                int tTotal = result/fist;


//                int firstVal =



                total = total + tTotal;
//                total = total + tempTotal.intValue();
            }

//            System.out.println(total+" "+getNumOfPrimes(total));
            System.out.println(getNumOfPrimes(total));

        }


    }

//    public static int getVal (int val) {
//        int n, c;
//        BigInteger inc = new BigInteger("1");
//        BigInteger fact = new BigInteger("1");
//
//        n = val;
//
//        for (c = 1; c <= n; c++) {
//            fact = fact.multiply(inc);
//            inc = inc.add(BigInteger.ONE);
//        }
//
////        System.out.println(n + "! = " + fact);
//        return  fact.intValue();
//    }

    public static int getVal(int uptoValue) {
        // TODO Auto-generated method stub
        BigInteger answer=new BigInteger("1");
        for(int i=1;i<=uptoValue;i++){
            answer=answer.multiply(new BigInteger(String.valueOf(i)));
        }
//        System.out.println(answer);
        return answer.intValue();
    }

//    public static int getVal (int val) {
//        int n, c;
//        int inc = 1;
//        int fact = 1;
//
//        n = val;
//
//        for (c = 1; c <= n; c++) {
//            fact = fact*inc;
//            inc = inc + 1;
//        }
//
////        System.out.println(n + "! = " + fact);
//        return  fact;
//    }

    public static int getNumOfPrimes (int val) {
        int n = val;
        int p;
        int count = 0;

        for(int i=2;i<=n;i++)
        {
            p=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    p=1;
            }

            if(p==0){
//                System.out.println(i);
                count++;
            }
        }

        return  count;
    }
}
