/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: przemka
	Configuration 	: glowny
	Model Element	: starcik
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/glowny/Default/starcik.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/starcik.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event starcik() 
public class starcik extends RiJEvent implements AnimatedEvent {
    
    public static final int starcik_Default_id = 18626;		//## ignore 
    
    
    // Constructors
    
    public  starcik() {
        lId = starcik_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (starcik_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.starcik");
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
          String s="starcik(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/glowny/Default/starcik.java
*********************************************************************/

