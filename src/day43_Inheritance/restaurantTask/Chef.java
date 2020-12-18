package day43_Inheritance.restaurantTask;

import day43_Inheritance.PersonTask.Employee;

public class Chef extends Employee { // Chef is An Employee, Chef IS A Person

    /*
    inherited:
        variables: name, age, gender, hourlyRate, jobTitle, ID
        methods: work, setInfo, toString, eat, sleep
     */

    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void makeOrder() {
        System.out.println(jobTitle + name + " is making order");
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
                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information

        - Extra optional tasks
                terminateServer(int employeeID): removes the server with the matching ID  from the arraylist
                terminateChef(int employeeID): removes the chef with the matching ID  from the arraylist

 */