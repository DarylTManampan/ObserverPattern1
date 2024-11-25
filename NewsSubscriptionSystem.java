package Obs;

public class NewsSubscriptionSystem {
    public static void main(String[] args) {


        NewsAgency newsAgency = new NewsAgency();

        //subscribers
        Subscriber uno = new Subscriber();
        uno.setSubscriberName("Uno");

        Subscriber dos = new Subscriber();
        dos.setSubscriberName("Dos");

        Subscriber tres = new Subscriber();
        tres.setSubscriberName("Tres");

        Subscriber fourth = new Subscriber();
        fourth.setSubscriberName("Fourth");

        newsAgency.subscribe(uno);
        newsAgency.subscribe(dos);
        newsAgency.subscribe(tres);
        newsAgency.subscribe(fourth);

        System.out.println("\nSubscriber Breaking News Sports Update!\n");
        newsAgency.notifySubscribers("PVL: Alyssa Valdez returns with renewed passion for volleyball ", "November 16 2024", "Sports");


        //unsubscribe, remove Uno and Dos
        newsAgency.unsubscribe(uno);
        newsAgency.unsubscribe(tres);

        //notify subscribers
        System.out.println("\nSubscriber Breaking News Calamity Update!\n");
        newsAgency.notifySubscribers("Metro Manila malls to offer free overnight parking for those affected by Pepito", "November 17 2024", "Calamity");

        Subscriber fifth = new Subscriber();
        fifth.setSubscriberName("Fifth");

        newsAgency.subscribe(fifth);

        //notify Subscribers
        System.out.println("\nSubscriber Breaking News Entertainment Update!\n");
        newsAgency.notifySubscribers("STRAY KIDS are coming to set the Philippine stage on fire! " +
                "\n\t\t\tStray Kids World Tour Concert <dominATE BULACAN> on November 23, 2024 at Philippine Arena", "August 14 2024", "Entertainment");

    }
}