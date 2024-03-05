/* 
For things that can be assigned (Project, Task, etc.)
*/

public interface Assignable {
    void addAssignee(Assignee assignee);
    void removeAssignee(Assignee assignee);
}
