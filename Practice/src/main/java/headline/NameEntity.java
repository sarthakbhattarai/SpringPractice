package headline;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.Span;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NameEntity {

    public static void main(String[] args) {
        try (InputStream modelIn = new FileInputStream("en-ner-organization.bin")) {
            TokenNameFinderModel model = new TokenNameFinderModel(modelIn);
            NameFinderME nameFinder = new NameFinderME(model);

            String sentence = "Apple Inc. reported a profit of $1 billion.";
            String[] tokens = SimpleTokenizer.INSTANCE.tokenize(sentence);
            Span[] names = nameFinder.find(tokens);

            for (Span name : names) {
                System.out.println("Entity: " + tokens[name.getStart()] + " " + name.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
