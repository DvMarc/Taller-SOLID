/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import javax.swing.text.Document;

/**
 *
 * @author diegomartinez
 */
public class GoodDIP {
    
    public interface IDatabase {
        Document getDocument(int id);
    }
    public class ManageDB implements IDatabase {

        @Override
        public Document getDocument(int id){
            Document Document = null;
            // Obtiene el documento de manage db
            return Document;
        }
    }

    public interface ISignature {
        void sign(Document doc);
    }

    public class Signature implements ISignature {

        @Override
        public void sign(Document doc){
            // Codigo para implementar la firma
        }
    }

    public class ProcessDocument {
        private final IDatabase database;
        private final ISignature signature;

        public ProcessDocument(IDatabase database, ISignature signature) {
            this.database = database;
            this.signature = signature;
        }

        public void signDocument(int id) {
            Document doc = this.database.getDocument(id);
            this.signature.sign(doc);
        }
    }
    
}


