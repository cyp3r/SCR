/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: Cezer
	Component	: przemka
	Configuration 	: jhj
	Model Element	: powrot
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/jhj/Default/powrot.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/powrot.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event powrot() 
public class powrot extends RiJEvent implements AnimatedEvent {
    
    public static final int powrot_Default_id = 18618;		//## ignore 
    
    
    // Constructors
    
    public  powrot() {
        lId = powrot_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (powrot_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.powrot");
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
          String s="powrot(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/powrot.java
*********************************************************************/

