package day43_Inheritance.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static boolean hasKitchen;
    public static boolean hasCashier;

    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner) {
        this.owner = owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();

    }

    static {
        hasKitchen = true;
        hasCashier = true;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        //  this.servers.addAll(Arrays.asList(servers));

        for (Server each : servers) {
            hireServer(each); // hiring each server one by one
        }
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateEmployee(String ID) {  // if only the ID is unique of each Employee
        servers.removeIf(p -> p.ID.equals(ID));
        chefs.removeIf(p -> p.ID.equals(ID));
    }


    public String toString() {
        return "Owner: " + owner + "\n Total number of Employees: " + (servers.size() + chefs.size())+
                "\nServers: "+servers.size()+"\nChefs: "+chefs.size();
    }
}
/*
Create a class called Restaurant

            Attributes:
                OwnerName, Location, numberOfStars
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
                Add A constructor that can set the owner, location, and number of stars
            Actions: (all void methods)
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs.
                Print the number of Servers and Chefs along side the other information

        - Extra optional tasks
                terminateServer(int employeeID): removes the server with the matching ID  from the arraylist
                terminateChef(int employeeID): removes the chef with the matching ID  from the arraylist

 */