import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class drmmessages
{
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Map<String, Integer> values = new HashMap<>();
    public static void main(String[] args)
    {
        setupHashMap();
        Scanner sc = new Scanner(System.in);
        String decryptedMessage = sc.nextLine();
        System.out.println(DRM(decryptedMessage));
    }

    private static void setupHashMap()
    {
        String[] letters = alphabet.split("");
        for (int i = 0; i < letters.length; i++)
        {
            values.put(letters[i], i);
        }
    }

    private static String DRM(String decryptedMessage)
    {
        String leftHalf = decryptedMessage.substring(0, decryptedMessage.length()/2);
        String rightHalf = decryptedMessage.substring(decryptedMessage.length()/2);

        String leftRotated = rotate(leftHalf);
        String rightRotated = rotate(rightHalf);

        return merge(leftRotated, rightRotated);
    }

    private static String merge(String leftRotated, String rightRotated)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < leftRotated.length(); i++)
        {
            String leftLetter = leftRotated.charAt(i) + "";
            String rightLetter = rightRotated.charAt(i) + "";

            if (i < leftRotated.length()/2) sb.append(rotateLetterByAmount(leftLetter, values.get(rightLetter)));
            else sb.append(rotateLetterByAmount(rightLetter, values.get(leftLetter)));
        }
        return sb.toString();
    }

    private static String rotate(String stringTORotate)
    {
        int rotateAmount = getRotateAmount(stringTORotate);
        StringBuilder sb = new StringBuilder();

        for (String letter : stringTORotate.split("")){
            sb.append(rotateLetterByAmount(letter, rotateAmount));
        }

        return sb.toString();
    }

    private static String rotateLetterByAmount(String letter, int rotateAmount)
    {
        int val = (values.get(letter) + rotateAmount) % 26;
        return alphabet.split("")[val];
    }

    public static int getRotateAmount(String halfMessage){
        int rotateAmount = 0;
        for (String letter : halfMessage.split("")){
            rotateAmount += values.get(letter);
        }
        return rotateAmount;
    }
}
