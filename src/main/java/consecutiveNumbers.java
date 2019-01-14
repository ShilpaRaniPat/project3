import java.util.Arrays;

public class consecutiveNumbers {


    public String CheckConsecutive(String inputstr) {
        String[] integer = inputstr.split(",");
        Integer[] integerValues = new Integer[integer.length];
        for (int i = 0; i <= integer.length; i++) {
            integerValues[i] = Integer.parseInt(integer[i]);
        }
        //Collections.sort(Arrays.asList(integerValues));
        Arrays.sort(integerValues);
        boolean result = true;
        for (int i = 0; i <= integerValues.length; i++) {
            if (integerValues[i + 1] - integerValues[i] == 1) {
            } else {
                result = false;
            }
        }

            if (result)
                return ("Consecutive numbers are present");
            else {
                return ("Consecutive numbers are not present");
            }
        }

    }



//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < integerValues.length; i++) {
//            Integer intval = integerValues[i];
//            builder.append(intval);
//            if (i < integerValues.length - 1) {
//                builder.append(",");
//                 returnstring = builder.toString();
//            }
//        }
//        return returnstring;
//    }
//}






