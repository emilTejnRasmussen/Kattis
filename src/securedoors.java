import java.util.*;

public class securedoors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> employees = new ArrayList<>();
        int logCount = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < logCount; i++)
        {
            String logMessage = sc.nextLine();
            String name = "";

            if (logMessage.startsWith("entry")){
                name = logMessage.substring(6);
                handleEntry(name, employees);
            } else {
                name = logMessage.substring(5);
                handleExit(name, employees);
            }

        }
    }

    private static void handleEntry(String name, List<String> employees)
    {
        if (employees.contains(name)){
            System.out.println(name + " entered (ANOMALY)");
        } else
        {
            employees.add(name);
            System.out.println(name + " entered ");
        }
    }

    private static void handleExit(String name, List<String> employees)
    {
        if (!employees.contains(name)){
            System.out.println(name + " exited (ANOMALY)");
        } else
        {
            employees.remove(name);
            System.out.println(name + " exited ");
        }
    }
}
