/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: key_1
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: przemka/jhj/Default/key_1.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/key_1.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event key_1() 
public class key_1 extends RiJEvent implements AnimatedEvent {
    
    public static final int key_1_Default_id = 18634;		//## ignore 
    
    
    // Constructors
    
    public  key_1() {
        lId = key_1_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (key_1_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.key_1");
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
          String s="key_1(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/key_1.java
*********************************************************************/

