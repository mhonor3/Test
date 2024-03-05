import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Task implements Assignable{
    private String title;
    private String description;
    private Date dueDate;
    private String status;
    private int Priority;
    private List<TeamMember> assignees = new ArrayList<TeamMember>();

    public void addAssignee(TeamMember assignee) {
        this.assignees.add(assignee);
    }

    public void removeAssignee(TeamMember assignee) {
        this.assignees.remove(assignee);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public List<TeamMember> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<TeamMember> assignees) {
        this.assignees = assignees;
    }

    
}
