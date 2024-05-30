package DsaProject1;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        Task task1 = new Task("Finish homework", "Complete the dsa assignment");
        Task task2 = new Task("Eat Food", "break fast,lunch,dinner");
        Task task3 = new Task("relax and unwind", "read book,watch tv,visit park");

        toDoList.addToDo(task1);
        toDoList.addToDo(task2);
        toDoList.addToDo(task3);

        toDoList.markToDoAsCompleted("Eat Food");
        toDoList.markToDoAsCompleted("relax and unwind");

        toDoList.viewToDoList();
    }
}

