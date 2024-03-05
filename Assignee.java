// For people (managers/members) that cna be assigned to things (projects/tasks)
public interface Assignee {
    void assignTo(Assignable assignable);
    void removeFrom(Assignable assignable);
}
