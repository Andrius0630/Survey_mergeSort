import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public class ReaderFromJSON {
    public HashMap<Integer, Candidate> readCandidates(String fileName) throws IOException{
        Gson gson = new Gson();
        try (Reader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, new TypeToken<HashMap<Integer, Candidate>>() {}.getType());
        }
    }

    public ArrayList<Result> readResults(String fileName) throws IOException{
        Gson gson = new Gson();
        try (Reader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, new TypeToken<ArrayList<Result>>() {}.getType());
        }
    }
}
