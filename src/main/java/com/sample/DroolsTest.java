package com.sample;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.*;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
       
             /*Client cl2 = new Client();
             cl2.setNom("ahmed");
             cl2.setAge(75);
             
             Diagnostic diag2 = new Diagnostic(cl2);
             
             // Symptome s11 = new Symptome("confusion");
              Symptome s22 = new Sy78mptome("chute");
           
              diag2.ajouter_symptome(s22);
                          
              cl2.ajouter_diagnostic(diag2);
        
             */
        	
        	/********************************************/
            Client cl = new Client();
            
            
            Diagnostic diag = new Diagnostic(cl);
            
            Etatpandemie etat = new Etatpandemie("faible");
            Region r = new Region("casablanca-settat",etat);
            Ville v = new Ville("casa",r);
             cl.setVille(v);
             
             Symptome s1 = new Symptome();
             s1.setDescription("fievre");
             Mesure m = new Temperature(40);
             s1.setMesure(m);
             Symptome s2 = new Symptome();
             s2.setDescription("congestion nasal");
             Symptome s3 = new Symptome();
             s3.setDescription("toux sèche");
             Symptome s4 = new Symptome();
             s4.setDescription("douleurs musculaires");
             Symptome s5 = new Symptome();
             s5.setDescription("perte de goût");
             
             
             diag.ajouter_symptome(s1);
             diag.ajouter_symptome(s2);
             diag.ajouter_symptome(s3);
             diag.ajouter_symptome(s4);
             diag.ajouter_symptome(s5); 
             
             
             cl.ajouter_diagnostic(diag);
             	
             /********************************************/
             DroolsTest drl = new DroolsTest();
             drl.Traitement(diag);
    }
   
    public void Traitement(Diagnostic diag) {
    	try {
    	    
   	        KieServices ks = KieServices.Factory.get();
       	    KieContainer kContainer = ks.getKieClasspathContainer();
           	KieSession kSession = kContainer.newKieSession("ksession-rules");
            
           	System.out.println(diag.getDegreCont_C19());

            kSession.insert(diag);
            kSession.fireAllRules();
           
            System.out.println(diag.getDegreCont_C19());
         } catch (Throwable t) {
             t.printStackTrace();
         }
         
         
    	}
    

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
