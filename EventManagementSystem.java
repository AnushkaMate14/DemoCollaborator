package eventmanagement;

import java.util.Scanner;

class Eventdetails {

    public String eventName;
    public String eventDate;
    public String eventLocation;
    public String eventType;
    public String eventTime;

    public Participant participant1 = null;
    public Participant participant2 = null;
    public Participant participant3 = null;
    public Participant participant4 = null;
    public Participant participant5 = null;
    public Participant participant6 = null;
    public Participant participant7 = null;
    public Participant participant8 = null;
    public Participant participant9 = null;
    public Participant participant10 = null;

    public int ticketsAvailable = 10;
    public int participantCount = 0;

    public Eventdetails(String eventName, String eventDate, String eventLocation, String eventType, String eventTime) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.eventType = eventType;
        this.eventTime = eventTime;
    }

    public void displayEventDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Location: " + eventLocation);
        System.out.println("Type: " + eventType);
        System.out.println("Time: "+ eventTime);
    }

    public boolean isParticipantAlreadyRegistered(String name) {
        if (participant1 != null && participant1.name.equals(name)) {
            return true;
        }
        if (participant2 != null && participant2.name.equals(name)) {
            return true;
        }
        if (participant3 != null && participant3.name.equals(name)) {
            return true;
        }
        if (participant4 != null && participant4.name.equals(name)) {
            return true;
        }
        if (participant5 != null && participant5.name.equals(name)) {
            return true;
        }
        if (participant6 != null && participant6.name.equals(name)) {
            return true;
        }
        if (participant7 != null && participant7.name.equals(name)) {
            return true;
        }
        if (participant8 != null && participant8.name.equals(name)) {
            return true;
        }
        if (participant9 != null && participant9.name.equals(name)) {
            return true;
        }
        if (participant10 != null && participant10.name.equals(name)) {
            return true;
        }
        return false;
    }

    public void registerParticipant(Participant participant) {
        if (ticketsAvailable == 0) {
            System.out.println("No tickets available. Cannot register more participants.");
            return;
        }

        if (isParticipantAlreadyRegistered(participant.name)) {
            System.out.println("Participant with name " + participant.name + " is already registered for this event.");
            return;
        }

        if (participantCount == 0) {
            participant1 = participant;
        } else if (participantCount == 1) {
            participant2 = participant;
        } else if (participantCount == 2) {
            participant3 = participant;
        } else if (participantCount == 3) {
            participant4 = participant;
        } else if (participantCount == 4) {
            participant5 = participant;
        } else if (participantCount == 5) {
            participant6 = participant;
        } else if (participantCount == 6) {
            participant7 = participant;
        } else if (participantCount == 7) {
            participant8 = participant;
        } else if (participantCount == 8) {
            participant9 = participant;
        } else if (participantCount == 9) {
            participant10 = participant;
        }

        participantCount++;
        ticketsAvailable--;
        System.out.println("Participant " + participant.name + " registered successfully.");
    }

    public void displayEventSchedule() {
        System.out.println("Event: " + eventName + " - Participants:");

        if (participant1 != null) {
            System.out.println("1. " + participant1.name);
        }
        if (participant2 != null) {
            System.out.println("2. " + participant2.name);
        }
        if (participant3 != null) {
            System.out.println("3. " + participant3.name);
        }
        if (participant4 != null) {
            System.out.println("4. " + participant4.name);
        }
        if (participant5 != null) {
            System.out.println("5. " + participant5.name);
        }
        if (participant6 != null) {
            System.out.println("6. " + participant6.name);
        }
        if (participant7 != null) {
            System.out.println("7. " + participant7.name);
        }
        if (participant8 != null) {
            System.out.println("8. " + participant8.name);
        }
        if (participant9 != null) {
            System.out.println("9. " + participant9.name);
        }
        if (participant10 != null) {
            System.out.println("10. " + participant10.name);
        }

        if (participantCount == 0) {
            System.out.println("No participants registered for " + eventName);
        }
    }

    public void generateAttendanceReport() {
        System.out.println("Attendance Report for Event: " + eventName);

        if (participant1 != null) {
            printParticipantDetails(participant1);
        }
        if (participant2 != null) {
            printParticipantDetails(participant2);
        }
        if (participant3 != null) {
            printParticipantDetails(participant3);
        }
        if (participant4 != null) {
            printParticipantDetails(participant4);
        }
        if (participant5 != null) {
            printParticipantDetails(participant5);
        }
        if (participant6 != null) {
            printParticipantDetails(participant6);
        }
        if (participant7 != null) {
            printParticipantDetails(participant7);
        }
        if (participant8 != null) {
            printParticipantDetails(participant8);
        }
        if (participant9 != null) {
            printParticipantDetails(participant9);
        }
        if (participant10 != null) {
            printParticipantDetails(participant10);
        }

        if (participantCount == 0) {
            System.out.println("No participants attended " + eventName);
        }
    }

    private void printParticipantDetails(Participant participant) {
        System.out.println("Participant Name: " + participant.name);
        System.out.println("Participant Email: " + participant.email);
        System.out.println("Participant ID: " + participant.participantId);
        System.out.println("Participant Address: " + participant.address);
        System.out.println("_________________________________________");
    }
}

class Participant {

    public String name;
    public String email;
    public int participantId;
    public String address;

    public Participant(String name, String email, int participantId, String address) {
        this.name = name;
        this.email = email;
        this.participantId = participantId;
        this.address = address;
    }
}

public class EventManagementSystem {

    private Eventdetails event1;
    private Eventdetails event2;
    private Eventdetails event3;
    private Eventdetails event4;
    private Eventdetails event5;
    private int participantCounter;

    public EventManagementSystem() {
        this.event1 = new Eventdetails("Java Workshop", "2025-02-15", "New York", "Workshop","12PM");
        this.event2 = new Eventdetails("Technology seminar", "2025-03-20", "Nepal", "Conference","10AM");
        this.event3 = new Eventdetails("AI Workshop", "2025-04-05", "India", "Workshop", "1PM");
        this.event4 = new Eventdetails("Cybersecurity Seminar", "2025-05-10", "Chicago", "Seminar", "7PM");
        this.event5 = new Eventdetails("Cloud Computing Workshop", "2025-06-25", "U.S", "Workshop","4PM");
        this.participantCounter = 1001;
    }

    public void displayAllEvents() {
        System.out.println("\nUpcoming Events:");
        System.out.println("____________________________");
        System.out.println("1. " + event1.eventName);
        System.out.println("____________________________");
        System.out.println("2. " + event2.eventName);
        System.out.println("____________________________");
        System.out.println("3. " + event3.eventName);
        System.out.println("____________________________");
        System.out.println("4. " + event4.eventName);
        System.out.println("____________________________");
        System.out.println("5. " + event5.eventName);
        System.out.println("____________________________");
    }

    public void registerParticipant(int eventNumber) {
        Scanner sc = new Scanner(System.in);

        if (eventNumber < 1 || eventNumber > 5) {
            System.out.println("Invalid event number!");
            return;
        }

        System.out.print("Enter the number of tickets you need: ");
        int numberOfTickets = sc.nextInt();
        sc.nextLine();

        Eventdetails selectedEvent = null;
        if (eventNumber == 1) {
            selectedEvent = event1;
        } else if (eventNumber == 2) {
            selectedEvent = event2;
        } else if (eventNumber == 3) {
            selectedEvent = event3;
        } else if (eventNumber == 4) {
            selectedEvent = event4;
        } else if (eventNumber == 5) {
            selectedEvent = event5;
        }

        if (numberOfTickets <= 0 || numberOfTickets > selectedEvent.ticketsAvailable) {
            System.out.println("Invalid number of tickets or not enough tickets available.");
            return;
        }

        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println("Enter details for participant " + (i + 1) + ":");

            System.out.print("Enter participant name: ");
            String participantName = sc.nextLine();

            System.out.print("Enter participant email: ");
            String participantEmail = sc.nextLine();

            System.out.print("Enter participant address: ");
            String participantAddress = sc.nextLine();

            Participant newParticipant = new Participant(participantName, participantEmail, participantCounter++, participantAddress);
            selectedEvent.registerParticipant(newParticipant);
        }
    }

    public void displayEventSchedule(int eventNumber) {
        if (eventNumber == 1) {
            event1.displayEventSchedule();
        } else if (eventNumber == 2) {
            event2.displayEventSchedule();
        } else if (eventNumber == 3) {
            event3.displayEventSchedule();
        } else if (eventNumber == 4) {
            event4.displayEventSchedule();
        } else if (eventNumber == 5) {
            event5.displayEventSchedule();
        } else {
            System.out.println("Invalid event selection.");
        }
    }

    public void generateAttendanceReport(int eventNumber) {
        if (eventNumber == 1) {
            event1.generateAttendanceReport();
        } else if (eventNumber == 2) {
            event2.generateAttendanceReport();
        } else if (eventNumber == 3) {
            event3.generateAttendanceReport();
        } else if (eventNumber == 4) {
            event4.generateAttendanceReport();
        } else if (eventNumber == 5) {
            event5.generateAttendanceReport();
        } else {
            System.out.println("Invalid event selection.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventManagementSystem ems = new EventManagementSystem();

        while (true) {
            System.out.println("\nEvent Management System");
            System.out.println("1. Display All Events");
            System.out.println("2. Register Participant for Event");
            System.out.println("3. Display Event Details");
            System.out.println("4. Display Event Schedule");
            System.out.println("5. Generate Attendance Report");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ems.displayAllEvents();
                    break;
                case 2:
                    System.out.print("Enter event number to register for: ");
                    int eventNumber = sc.nextInt();
                    ems.registerParticipant(eventNumber);
                    break;
                case 3:
                    System.out.print("Enter event number to view details: ");
                    eventNumber = sc.nextInt();
                    sc.nextLine();
                    if (eventNumber == 1) {
                        ems.event1.displayEventDetails();
                    } else if (eventNumber == 2) {
                        ems.event2.displayEventDetails();
                    } else if (eventNumber == 3) {
                        ems.event3.displayEventDetails();
                    } else if (eventNumber == 4) {
                        ems.event4.displayEventDetails();
                    } else if (eventNumber == 5) {
                        ems.event5.displayEventDetails();
                    } else {
                        System.out.println("Invalid event selection.");
                    }
                    break;
                case 4:
                    System.out.print("Enter event number to view schedule: ");
                    eventNumber = sc.nextInt();
                    ems.displayEventSchedule(eventNumber);
                    break;
                case 5:
                    System.out.print("Enter event number to generate attendance report: ");
                    eventNumber = sc.nextInt();
                    ems.generateAttendanceReport(eventNumber);
                    break;
                case 6:
                    System.out.println("Thank You For Registering in the Events");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
