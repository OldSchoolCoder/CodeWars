package kuy8;

public class ReturnNegative {

    public static void main(String[] args) {

    }

    public static int run(final int x) {
        int result = 0;
        if (x > 0) {
            result = -x;
        } else if (x < 0) {
            result = x;
        }
//        switch (x){
//            case 0: result=0;
//            break;
//            case
//        }

        return result;
    }
}
