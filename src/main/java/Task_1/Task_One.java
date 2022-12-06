package Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Task_One {

    public static void main(String[] args){
        String path = "./src/Lab_2/Task_One/txt";
        Stack<String> fileLines = ReadFile(path);
        writeReverseInFile(fileLines,path);
    }
    public static Stack<String> ReadFile(String path){
        File file = new File(path);
        try(Scanner scanner =new Scanner(file)) {
            Stack<String> stack = new Stack<>();
            while (scanner.hasNextLine()){
                stack.push(scanner.nextLine());
            }
            return stack;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeReverseInFile(Stack<String> stack,String file){
        try(PrintWriter pw = new PrintWriter(file)) {
            while (!stack.empty()){
                pw.println(stack.pop());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
