/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: do_wyboru
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: zoinha/idarka/Default/do_wyboru.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/do_wyboru.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event do_wyboru() 
public class do_wyboru extends RiJEvent implements AnimatedEvent {
    
    public static final int do_wyboru_Default_id = 18627;		//## ignore 
    
    
    // Constructors
    
    public  do_wyboru() {
        lId = do_wyboru_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (do_wyboru_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.do_wyboru");
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
          String s="do_wyboru(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Default/do_wyboru.java
*********************************************************************/

