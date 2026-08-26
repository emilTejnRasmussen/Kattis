import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stockprices
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            StockMarket stockMarket = new StockMarket();
            int numOfOrders = sc.nextInt();

            for (int j = 0; j < numOfOrders; j++)
            {
                String action = sc.next();
                int amount = sc.nextInt(); sc.next(); sc.next();
                int price = sc.nextInt();
                stockMarket.addOrder(new Order(action, amount, price));

                System.out.println(stockMarket);
            }

        }

    }

    static class StockMarket
    {
        private final List<Order> orders;
        private Integer stockPrice;

        public StockMarket()
        {
            this.orders = new ArrayList<>();
        }

        public void addOrder(Order order)
        {
            orders.add(order);
            matchOrders();
        }

        private void matchOrders()
        {
            while (true)
            {
                Order bestBuy = getBestBuyOrder();
                Order bestSell = getBestSellOrder();

                if (bestBuy == null || bestSell == null)
                    return;

                if (bestBuy.getPrice() < bestSell.getPrice())
                    return;

                int amountTraded = Math.min(
                        bestBuy.getRemainingAmount(),
                        bestSell.getRemainingAmount()
                );

                bestBuy.reduceAmount(amountTraded);
                bestSell.reduceAmount(amountTraded);

                stockPrice = bestSell.getPrice();
            }
        }

        private Order getBestBuyOrder()
        {
            Order best = null;

            for (Order order : orders)
            {
                if (!order.getAction().equals("buy"))
                    continue;

                if (order.getRemainingAmount() == 0)
                    continue;

                if (best == null || order.getPrice() > best.getPrice())
                {
                    best = order;
                }
            }

            return best;
        }

        private Order getBestSellOrder()
        {
            Order best = null;

            for (Order order : orders)
            {
                if (!order.getAction().equals("sell"))
                    continue;

                if (order.getRemainingAmount() == 0)
                    continue;

                if (best == null || order.getPrice() < best.getPrice())
                {
                    best = order;
                }
            }

            return best;
        }

        private Integer getAsk()
        {
            Order sell = getBestSellOrder();

            if (sell == null)
                return null;

            return sell.getPrice();
        }

        private Integer getBid()
        {
            Order buy = getBestBuyOrder();

            if (buy == null)
                return null;

            return buy.getPrice();
        }

        @Override
        public String toString()
        {
            Integer ask = getAsk();
            Integer bid = getBid();

            return (ask == null ? "-" : ask) + " " +
                    (bid == null ? "-" : bid) + " " +
                    (stockPrice == null ? "-" : stockPrice);
        }
    }

    static class Order{
        private final String action;
        private int remainingAmount;
        private final int price;

        public Order(String action, int amount, int price)
        {
            this.action = action;
            this.remainingAmount = amount;
            this.price = price;
        }

        public void reduceAmount(int amount) {
            remainingAmount -= amount;
        }

        public String getAction()
        {
            return action;
        }

        public int getRemainingAmount()
        {
            return remainingAmount;
        }

        public int getPrice()
        {
            return price;
        }
    }
}
