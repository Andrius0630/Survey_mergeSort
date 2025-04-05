import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ReaderFromJSON {
    private String fileName;

    public ReaderFromJSON(String fileName) {
        this.fileName = fileName;
    }


    public List<Candidate> readCandidates() throws IOException{
        Gson gson = new Gson();
        try (Reader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, new TypeToken<List<Candidate>>() {}.getType());
        }
    }

    public List<Result> readResults() throws IOException{
        Gson gson = new Gson();
        try (Reader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, new TypeToken<List<Result>>() {}.getType());
        }
    }
}
