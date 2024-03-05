import java.util.List;
import java.util.ArrayList;

public class TeamManager implements Manager{
    private String role = "team manager";
    private List<TeamMember> teamMembers = new ArrayList<TeamMember>();

    public void oversee() {
        System.out.println("Overseeing team members... ");
    }

    public TeamMember createTeamMember(String name, String email) {
        TeamMember member = TeamMember.createTeamMember(name, email);
        this.teamMembers.add(member);
        return member;
    }

    public void addAssignee(Assignee assignee) {
        this.teamMembers.add((TeamMember) assignee);
    }

    public void removeAssignee(Assignee assignee) {
        this.teamMembers.remove((TeamMember) assignee);
    }

}
