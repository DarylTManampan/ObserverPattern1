public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

@Override
    public void update(String news, String date, String categorization) {
                System.out.println("\nHey, " + subscriberName + "! You have new updates!" + "\n\t[News] " + news + "\n\t[Date Published] " + date + " \n\t[Category] " + categorization);

        }
    }
