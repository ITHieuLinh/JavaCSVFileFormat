package Repository;

import DataAccess.CSVFileDAO;
import java.util.ArrayList;
import model.CSV;

public class CSVFileRepository implements ICSVFileRepository {

    @Override
    public void importFile(ArrayList<CSV> ls) {
        CSVFileDAO.Instance().importFile(ls);
    }

    @Override
    public void formatAddress(ArrayList<CSV> ls) {
        CSVFileDAO.Instance().formatAddress(ls);
    }

    @Override
    public void formatName(ArrayList<CSV> ls) {
        CSVFileDAO.Instance().formatName(ls);
    }

    @Override
    public void exportFile(ArrayList<CSV> ls) {
        CSVFileDAO.Instance().exportFile(ls);
    }

    @Override
    public void print(ArrayList<CSV> ls) {
        CSVFileDAO.Instance().print(ls);
    }

}
