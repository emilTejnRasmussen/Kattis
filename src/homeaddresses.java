import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homeaddresses
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TuppleList tuppleList = new TuppleList();

        while (!input.equals("q")){
            String[] splitAddress = input.split(" ");
            Address address = new Address(splitAddress[0], splitAddress[1]);
            tuppleList.addAddress(address);

            input = sc.nextLine();
        }

        System.out.println(tuppleList.printListForm());
        System.out.println(tuppleList);
    }

    public static class Address {
        private String address;
        private String number;

        public Address(String address, String number)
        {
            this.address = address;
            this.number = number;
        }

        public String getFullAddress() {
            return String.format("'%s %s'", address, number);
        }

        @Override
        public String toString()
        {
            return String.format("('%s', '%s')", this.address, this.number);
        }
    }

    public static class TuppleList {

        private List<Address> addresses;

        public TuppleList()
        {
            this.addresses = new ArrayList<>();
        }

        public void addAddress(Address address) {
            addresses.add(address);
        }

        public String printListForm() {
            if (addresses.isEmpty()) return "[]";

            StringBuilder sb = new StringBuilder("[");

            for (Address address : addresses) {
                sb.append(address.getFullAddress()).append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
            return sb.toString();

        }

        @Override
        public String toString()
        {
            if (addresses.isEmpty()) return "[]";

            StringBuilder sb = new StringBuilder("[");

            for (Address address : addresses) {
                sb.append(address).append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
            return sb.toString();
        }
    }
}
