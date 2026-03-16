package queuepack;

import java.util.PriorityQueue;

public class Task implements Comparable<Task> {

    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority comes first
        return Integer.compare(other.priority, this.priority);
    }

    public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>();

        pq.add(new Task("Submit Assignment", 2));
        pq.add(new Task("Attend Meeting", 5));
        pq.add(new Task("Check Emails", 1));
        pq.add(new Task("Prepare Presentation", 4));

        System.out.println("Tasks executed based on priority:");

        while (!pq.isEmpty()) {

            Task task = pq.poll();

            System.out.println(
                    "Task: " + task.getName() +
                    " | Priority: " + task.getPriority()
            );
        }
    }
}