/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: przemka
	Configuration 	: glowny
	Model Element	: dodaj_nominal_1zl
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/glowny/Default/dodaj_nominal_1zl.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/dodaj_nominal_1zl.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event dodaj_nominal_1zl() 
public class dodaj_nominal_1zl extends RiJEvent implements AnimatedEvent {
    
    public static final int dodaj_nominal_1zl_Default_id = 18623;		//## ignore 
    
    
    // Constructors
    
    public  dodaj_nominal_1zl() {
        lId = dodaj_nominal_1zl_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (dodaj_nominal_1zl_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.dodaj_nominal_1zl");
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
          String s="dodaj_nominal_1zl(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/glowny/Default/dodaj_nominal_1zl.java
*********************************************************************/

