                                   /*STUDENT CLUB AND EVENT*/ 

//Organizable Interface
interface Organizable {
    void organizeEvent();
    void manageBudget();
}

// Participable Interface
interface Participable {
    void joinClub(String clubName);
    void leaveClub(String clubName);
}

//Base class
class Student {
    private String name;
    private String studentId;
    private String major;

    public Student(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

/* --------------------------- ClubMember subclass------------------------------ */ 
class ClubMember extends Student implements Participable {
    private String clubName;
    private String membershipLevel;

    public ClubMember(String name, String studentId, String major, String clubName, String membershipLevel) {
        super(name, studentId, major);
        this.clubName = clubName;
        this.membershipLevel = membershipLevel;
    }

    public void joinClub(String clubName) {
        this.clubName = clubName;
        System.out.println(getName() + " has joined the club " + clubName + ".");
    }

    public void leaveClub(String clubName) {
        if (this.clubName != null && this.clubName.equals(clubName)) {
            this.clubName = null;
            System.out.println(getName() + " has left the club " + clubName + ".");
        } else {
            System.out.println(getName() + " is not a member of " + clubName + ".");
        }
    }

    // Getters and setters
    public String getClubName() {
        return clubName;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}

/* --------------------------- EventOrganizer subclass------------------------------ */ 
class EventOrganizer extends Student implements Organizable {
    private String eventName;
    private double budget;

    public EventOrganizer(String name, String studentId, String major, String eventName, double budget) {
        super(name, studentId, major);
        this.eventName = eventName;
        this.budget = budget;
    }

    public void organizeEvent() {
        System.out.println(getName() + " is organizing the event " + eventName + ".");
    }

    public void manageBudget() {
        System.out.println("Managing budget of $" + budget + " for the event " + eventName + ".");
    }

    // Getters and setters
    public String getEventName() {
        return eventName;
    }

    public double getBudget() {
        return budget;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create instances of students
        ClubMember student1 = new ClubMember("Dharmik", "S001", "Undergraduate", "Science Club", "Executive");
        EventOrganizer student2 = new EventOrganizer("Krish", "S002", "Postgraduate", "Tech Symposium", 5000.00);

        // Manage club memberships
        student1.joinClub("Math Club");
        student1.leaveClub("Science Club");

        // Manage events and budget
        student2.organizeEvent();
        student2.manageBudget();

        System.out.println();
        System.out.println("This code is prepared by Dharmik Khunt_23CE058");
    }
}