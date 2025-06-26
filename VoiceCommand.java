import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class VoiceCommand {
    public static void main(String[] args) {
        try {
            // Configuration set karna
            Configuration configuration = new Configuration();
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
            configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

            // Live Speech Recognizer ka instance banana
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
            recognizer.startRecognition(true);

            System.out.println("Aapka command sun rahe hain...");

            // Speech result ko process karna
            SpeechResult result;
            while ((result = recognizer.getResult()) != null) {
                String command = result.getHypothesis();
                System.out.println("Aapne kaha: " + command);

                // Command ke according action lena
                if (command.equalsIgnoreCase("open browser")) {
                    Runtime.getRuntime().exec("cmd /c start chrome");
                } else if (command.equalsIgnoreCase("open notepad")) {
                    Runtime.getRuntime().exec("cmd /c start notepad");
                } else if (command.equalsIgnoreCase("exit")) {
                    System.out.println("Program band ho raha hai...");
                    break;
                } else {
                    System.out.println("Ye command samajh nahi aaya.");
                }
            }

            recognizer.stopRecognition();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
