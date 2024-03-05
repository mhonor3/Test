import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Manager {

    private String role = "project manager";
    private List<Project> projects = new ArrayList<Project>();

    public void oversee() {
        System.out.println("Overseeing projects...");
    }

    public Project createProject(String name, String description, String startDate, String endDate) {
        Project project = Project.createProject(name, description, startDate, endDate);
        this.projects.add(project);
        return project;
    }

    public void deleteProject(Project project) {
        this.projects.remove(project);
    }

    public void addAssignee(Assignee assignee) {
        this.projects.add((Project) assignee);
    }

    public void removeAssignee(Assignee assignee) {
        this.projects.remove((Project) assignee);
    }
}
