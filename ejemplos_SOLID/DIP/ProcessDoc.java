
package ejemplos;

import javax.swing.text.Document;


public class ProcessDoc {
    public void signDocument(int id) {
         
        ManageDB manageDB = new ManageDB();
        Document doc = manageDB.getDocument(id);
 
        Signature sg = new Signature();
        sg.signWithRSA(doc);
    }
}
