import java.util.List;
import java.util.ArrayList;

public class Project implements Assignable {
    String name;
    String description;
    String startDate;
    String endDate;
    List<Task> tasks = new ArrayList<Task>();
    List<TeamMember> teamMembers = new ArrayList<TeamMember>();

    public Project(String name, String description, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static Project createProject(String name, String description, String startDate, String endDate) {
        return new Project(name, description, startDate, endDate);
    }

    public void addAssignee(Assignee assignee) {
        if (assignee instanceof TeamMember) {
            this.teamMembers.add((TeamMember) assignee);
        }
    }

    public void removeAssignee(Assignee assignee) {
        if (assignee instanceof TeamMember) {
            this.teamMembers.remove((TeamMember) assignee);
        }
    }
}
