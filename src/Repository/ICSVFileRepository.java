package Repository;

import java.util.ArrayList;
import model.CSV;



public interface ICSVFileRepository {

    void importFile(ArrayList<CSV> ls);

    void formatAddress(ArrayList<CSV> ls);

    void formatName(ArrayList<CSV> ls);

    void exportFile(ArrayList<CSV> ls);

    void print(ArrayList<CSV> ls);
}
