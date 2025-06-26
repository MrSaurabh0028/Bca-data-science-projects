import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class VoiceCommand {
    public static void main(String[] args) throws Exception {
        // Create a configuration object
        Configuration configuration = new Configuration();

        // Set path to acoustic model
        configuration.setAcousticModelPath("file:/C:/Users/91620/OneDrive/Desktop/cmusphinx-en-us-8khz-5.2");

        // Set path to dictionary
        configuration.setDictionaryPath("file:/C:/Users/91620/OneDrive/Desktop/cmudict-en-us.dict");

        // Optional: Set path to the language model if needed
        // configuration.setLanguageModelPath("file:/C:/Users/91620/OneDrive/Desktop/cmusphinx-en-us.lm.bin");

        // Initialize the recognizer with the given configuration
        LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);

        // Start recognition process (listening)
        recognizer.startRecognition(true);
        System.out.println("Say something...");

        // Infinite loop to listen for user speech
        while (true) {
            String result = recognizer.getResult().getHypothesis();
            System.out.println("You said: " + result);
        }
    }
}
