/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: Cezer
	Component	: przemka
	Configuration 	: jhj
	Model Element	: zwrot
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/jhj/Default/zwrot.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/zwrot.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event zwrot() 
public class zwrot extends RiJEvent implements AnimatedEvent {
    
    public static final int zwrot_Default_id = 18625;		//## ignore 
    
    
    // Constructors
    
    public  zwrot() {
        lId = zwrot_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (zwrot_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.zwrot");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="zwrot(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/zwrot.java
*********************************************************************/

