import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Traductor {

    BinaryTree<Association<String, LangDic>> English = new BinaryTree<>();
    BinaryTree<Association<String, LangDic>> Spanish = new BinaryTree<>();
    BinaryTree<Association<String, LangDic>> French = new BinaryTree<>();
    
    public String FillDictionary (int lang, ArrayList<String[]> txtDic) {
        for (String[] string : txtDic) {
            LangDic dic = new LangDic(string[0], string[1], string[2]);
            Association<String,LangDic> aso = new Association<>(string[lang], dic);
            AssignDic(lang, aso);
        }
    }

    private void AssignDic (int lang, Association<String,LangDic> dic) {
        switch (lang) {
            case 0:
                English.add(dic);
                break;
            case 1:
                Spanish.add(dic);
                break;
            case 2:
                French.add(dic);
                break;
            default:
                break;
        }
    }

    
}