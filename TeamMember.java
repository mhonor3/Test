public class TeamMember implements Assignee {
    String name;
    String email;
    String role = "team member";

    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static TeamMember createTeamMember(String name, String email) {
        return new TeamMember(name, email);
    }

    public void assignTo(Assignable assignable) {
        assignable.addAssignee(this);
    }

    public void removeFrom(Assignable assignable) {
        assignable.removeAssignee(this);
    }
}
