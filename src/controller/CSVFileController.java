package controller;

import Repository.CSVFileRepository;
import java.util.ArrayList;

import model.CSV;
import view.Menu;

public class CSVFileController extends Menu<String> {

    static String[] mc = {"Import CSV", "Format Address", "Format Name", "Export CSV", "Exit"};
    CSVFileRepository program;
    ArrayList<CSV> lt;

    public CSVFileController() {
        super("\tFormat CSV Program", mc);
        program = new CSVFileRepository();
        lt = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.importFile(lt);
                program.print(lt);
                break;
            case 2:
                program.formatAddress(lt);
                program.print(lt);
                break;
            case 3:
                program.formatName(lt);
                program.print(lt);
                break;
            case 4:
                program.exportFile(lt);
                break;
            case 5:
                System.exit(0);
        }
    }

}
