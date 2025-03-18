package tasks;

import tasks.Task;
import tasks.DBConnection;


public class Main {
    private static void add_task(String message) {
        System.out.println("Add task to Board");
        System.out.println("Need to get last id");
    }

    private static void parse_command(String command, String ... args) {
        if (command.equals("add")) {
            
        } else if (command.equals("update")) {
             System.out.println("update");
        } else if (command.equals("delete")) {
             System.out.println("delete");
        } else if (command.equals("mark-in-progress")) {
            System.out.println("mark-in-progress");
        } else if (command.equals("mark-done")) {
            System.out.println("mark-done");
        } else if (command.equals("list")) {
            if (args.length == 1) {
                System.out.println("List All tasks");
            } else {
                System.out.println("print by status");
            }
        } else {
            print_help();
        }
    }

    private static void print_help() {
        System.out.println("""
---------------------------------------------------------------
Help Menu
---------------------------------------------------------------
task add <desc>                Add a Task
task update <id> <desc>        Update a Task
task delete <id>               Delete a Task
task mark-in-progress <id>     Mark a Task In Progress
task mark-done <id>            Mark a Task as Done
task list                      Show All Tasks
task list <status>             Show All Tasks in Status

---------------------------------------------------------------
Status List
---------------------------------------------------------------
todo
in-progess
done
---------------------------------------------------------------
        """);
    }

    public static void main(String[] args) {
        DBConnection.connect();

        try {
            parse_command(args[0], args);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please do something");
        }
    }


}
