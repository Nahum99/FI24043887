import java.io.*;

public class Revert {

    public static void main(String[] args) {

        MyStackCharacter stack = new MyStackCharacter();

        String inputFile = "input.txt";
        String outputFile = "output.txt";


        try (FileReader fr = new FileReader(inputFile)) {
            int data;
            System.out.println("\nLeyendo archivo y apilando caracteres...");

            while ((data = fr.read()) != -1) {
                char ch = (char) data;
                stack.push(ch);
            }

            System.out.println("\nLectura finalizada. Total de caracteres apilados: " + stack.size());

        } catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
            return;
        }

     
        try (FileWriter fw = new FileWriter(outputFile)) {
            System.out.println("\nDesapilando e invirtiendo contenido...");

            while (!stack.empty()) {
                fw.write(stack.pop());
            }

            System.out.println("\nArchivo invertido correctamente en: " + outputFile);

        } catch (IOException e) {
            System.out.println("\nError al escribir el archivo: " + e.getMessage());
        }
      }
  
}
