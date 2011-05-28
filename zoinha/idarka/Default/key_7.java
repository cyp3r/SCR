/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: key_7
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: zoinha/idarka/Default/key_7.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/key_7.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event key_7() 
public class key_7 extends RiJEvent implements AnimatedEvent {
    
    public static final int key_7_Default_id = 18640;		//## ignore 
    
    
    // Constructors
    
    public  key_7() {
        lId = key_7_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (key_7_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.key_7");
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
          String s="key_7(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Default/key_7.java
*********************************************************************/

