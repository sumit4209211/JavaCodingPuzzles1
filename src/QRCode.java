public class QRCode {
    static boolean QrcodeCheck(String input) {

        String value=input.replace(" ","").toUpperCase();
        System.out.println(value.substring(0, 2));
        System.out.println(value);
        if (value.split(" ").length == 1 && value.length() == 21 && value.charAt(4) == '3'
                && checkNumber(value.substring(4)) && checkCharacter(value.substring(0, 2)))
            return true;
        return false;
    }

    static boolean checkPaymentDetails(String original) {
        String value[]=original.split("\n");
        String splitString = value[0].substring(0,32);
        String numberValue=splitString.substring(splitString.lastIndexOf('/')+1);
        System.out.println(splitString);
        if (splitString.split(" ").length == 1 && checkNumber(numberValue) && numberValue.length() == 27) {
            return true;
        }
        else {
            return false;
        }

    }

    static boolean checkNumber(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i)))
                return false;

        }
        return true;
    }

    static boolean checkCharacter(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isAlphabetic(value.charAt(i)))
                return false;

        }

        return true;
    }
    public static void main(String[] args) {

        String QR_IBAN = "ch 123 0001 0000 12751216";
        String Payments_details = "/QRR/123456789123456789123456789\nTHIS IS !@#$%^&*()DESCRIP/>?//09/876";

        System.out.println(QrcodeCheck(QR_IBAN));
        System.out.println(checkPaymentDetails(Payments_details));

    }
}