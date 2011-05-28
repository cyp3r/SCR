/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: przemka
	Configuration 	: glowny
	Model Element	: wrzutnia
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/glowny/Default/wrzutnia.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/wrzutnia.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class wrzutnia 
public class wrzutnia implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasswrzutnia = new AnimClass("Default.wrzutnia",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected String ekran = "start";		//## attribute ekran 
    
    protected String lancuch2 = "start";		//## attribute lancuch2 
    
    protected double liczba1;		//## attribute liczba1 
    
    protected double liczba10gr;		//## attribute liczba10gr 
    
    protected double liczba2;		//## attribute liczba2 
    
    protected double liczba20gr;		//## attribute liczba20gr 
    
    protected double liczba5;		//## attribute liczba5 
    
    protected double liczba50gr;		//## attribute liczba50gr 
    
    protected double liczba5gr;		//## attribute liczba5gr 
    
    double licznik = 0;		//## attribute licznik 
    
    int licznik3 = 0;		//## attribute licznik3 
    
    public double suma;		//## attribute suma 
    
    protected double wartosc;		//## attribute wartosc 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int state_3=1;
    public static final int Start=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## operation wrzutnia() 
    public  wrzutnia(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasswrzutnia.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation wrzutnia() 
                   wartosc = 0;    
                    suma =0 ;
                    
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param wartosc
    */
    //## operation dodaj_nominal(double) 
    public void dodaj_nominal(double wartosc) {
        try {
            animInstance().notifyMethodEntered("dodaj_nominal",
               new ArgData[] {
                   new ArgData(double.class, "wartosc", AnimInstance.animToString(wartosc))
               });
        
        //#[ operation dodaj_nominal(double) 
        suma=wartosc+suma;
        wartosc=0;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation wyczysc() 
    public void wyczysc() {
        try {
            animInstance().notifyMethodEntered("wyczysc",
               new ArgData[] {
               });
        
        //#[ operation wyczysc() 
        suma=0;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public String getEkran() {
        return ekran;
    }
    
    //## auto_generated 
    public void setEkran(String p_ekran) {
        ekran = p_ekran;
    }
    
    //## auto_generated 
    public String getLancuch2() {
        return lancuch2;
    }
    
    //## auto_generated 
    public void setLancuch2(String p_lancuch2) {
        lancuch2 = p_lancuch2;
    }
    
    //## auto_generated 
    public double getLiczba1() {
        return liczba1;
    }
    
    //## auto_generated 
    public void setLiczba1(double p_liczba1) {
        liczba1 = p_liczba1;
    }
    
    //## auto_generated 
    public double getLiczba10gr() {
        return liczba10gr;
    }
    
    //## auto_generated 
    public void setLiczba10gr(double p_liczba10gr) {
        liczba10gr = p_liczba10gr;
    }
    
    //## auto_generated 
    public double getLiczba2() {
        return liczba2;
    }
    
    //## auto_generated 
    public void setLiczba2(double p_liczba2) {
        liczba2 = p_liczba2;
    }
    
    //## auto_generated 
    public double getLiczba20gr() {
        return liczba20gr;
    }
    
    //## auto_generated 
    public void setLiczba20gr(double p_liczba20gr) {
        liczba20gr = p_liczba20gr;
    }
    
    //## auto_generated 
    public double getLiczba5() {
        return liczba5;
    }
    
    //## auto_generated 
    public void setLiczba5(double p_liczba5) {
        liczba5 = p_liczba5;
    }
    
    //## auto_generated 
    public double getLiczba50gr() {
        return liczba50gr;
    }
    
    //## auto_generated 
    public void setLiczba50gr(double p_liczba50gr) {
        liczba50gr = p_liczba50gr;
    }
    
    //## auto_generated 
    public double getLiczba5gr() {
        return liczba5gr;
    }
    
    //## auto_generated 
    public void setLiczba5gr(double p_liczba5gr) {
        liczba5gr = p_liczba5gr;
    }
    
    //## auto_generated 
    public double getLicznik() {
        return licznik;
    }
    
    //## auto_generated 
    public void setLicznik(double p_licznik) {
        licznik = p_licznik;
    }
    
    //## auto_generated 
    public int getLicznik3() {
        return licznik3;
    }
    
    //## auto_generated 
    public void setLicznik3(int p_licznik3) {
        licznik3 = p_licznik3;
    }
    
    //## auto_generated 
    public double getSuma() {
        return suma;
    }
    
    //## auto_generated 
    public void setSuma(double p_suma) {
        suma = p_suma;
    }
    
    //## auto_generated 
    public double getWartosc() {
        return wartosc;
    }
    
    //## auto_generated 
    public void setWartosc(double p_wartosc) {
        wartosc = p_wartosc;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case Start:
                {
                    Start_add(animStates);
                }
                break;
                case state_3:
                {
                    state_3_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Start:
                {
                    res = Start_takeEvent(id);
                }
                break;
                case state_3:
                {
                    res = state_3_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_3_add(AnimStates animStates) {
            animStates.add("ROOT.state_3");
        }
        
        //## statechart_method 
        public void Start_add(AnimStates animStates) {
            animStates.add("ROOT.Start");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_50gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Start_exit();
            //#[ transition 6 
            dodaj_nominal(0.5);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_3_entDef() {
            state_3_enter();
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_5gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Start_exit();
            //#[ transition 3 
            dodaj_nominal(0.05);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_3_exit() {
            popNullConfig();
            state_3Exit();
            animInstance().notifyStateExited("ROOT.state_3");
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_5() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Start_exit();
            //#[ transition 1 
            dodaj_nominal(5);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_3TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_20gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Start_exit();
            //#[ transition 5 
            dodaj_nominal(0.2);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Start_entDef() {
            Start_enter();
        }
        
        //## statechart_method 
        public int StartTakezwrot() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            Start_exit();
            //#[ transition 9 
            wyczysc();
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_10gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Start_exit();
            //#[ transition 4 
            dodaj_nominal(0.1);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void StartExit() {
        }
        
        //## statechart_method 
        public void Start_enter() {
            animInstance().notifyStateEntered("ROOT.Start");
            rootState_subState = Start;
            rootState_active = Start;
            StartEnter();
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_1zl() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            Start_exit();
            //#[ transition 7 
            dodaj_nominal(1);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_2zl() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Start_exit();
            //#[ transition 8 
            dodaj_nominal(2);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void StartEnter() {
            //#[ state ROOT.Start.(Entry) 
            ekran="Aktualny stan="+(double)((int)(suma*100))/100;          
            
            licznik=(double)((int)(suma*100))/100;
            if (licznik==0) {
            ekran+="\r Nie bedzie reszty";
            
            }
            else if (licznik<0) ekran+="Za malo pieniazkow";
            else ekran+= "\r   Wydawanie reszty: "+ (double)((int)(licznik*100))/100 +" zl";
            
            if (licznik!=0){
            ekran += "Reszta zostanie wydana w: ";  
            licznik3=(int)(licznik*100);
            if (licznik3 >= 0) 
            {liczba5 = licznik3/500; 
            if (liczba5>0) {
            	ekran = ekran + liczba5 + "x5 zl " ;
            	licznik3=licznik3-(int)liczba5*500;
            }
              liczba2 = licznik3/200; 
            if (liczba2>0) {
            	ekran = ekran + liczba2 + "x2 zl " ;
            	licznik3=licznik3-(int)liczba2*200;
            }
            liczba1 = licznik3/100;   
            if (liczba1>0) {
            	ekran= ekran + liczba1 + "x1 zl " ;
            	licznik3=licznik3-(int)liczba1*100;
            }  
              
            liczba50gr = licznik3/50;   
            if (liczba50gr>0) {
            	ekran = ekran + liczba50gr + "x50 gr " ;
            	licznik3=licznik3-(int)liczba50gr*50;
            }    
            liczba20gr = licznik3/20;   
            if (liczba20gr>0) {
            	ekran = ekran + liczba20gr + "x20 gr " ;
            	licznik3=licznik3-(int)liczba20gr*20;
            }
            liczba10gr = licznik3/10;   
            if (liczba10gr>0) {
            	ekran = ekran + liczba10gr + "x10 gr " ;
            	licznik3=licznik3-(int)liczba10gr*10;
            }
            liczba5gr = licznik3/5;   
            if (liczba5gr>0) {
            	ekran = ekran + liczba5gr + "x5 gr " ;
            	licznik3=licznik3-(int)liczba5gr*5;
            }        
            } 
            }
            //#]
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void state_3Exit() {
        }
        
        //## statechart_method 
        public void Start_exit() {
            StartExit();
            animInstance().notifyStateExited("ROOT.Start");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Start_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int state_3TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            state_3_exit();
            Start_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_3_enter() {
            animInstance().notifyStateEntered("ROOT.state_3");
            pushNullConfig();
            rootState_subState = state_3;
            rootState_active = state_3;
            state_3Enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(dodaj_nominal_10gr.dodaj_nominal_10gr_Default_id))
                {
                    res = StartTakedodaj_nominal_10gr();
                }
            else if(event.isTypeOf(zwrot.zwrot_Default_id))
                {
                    res = StartTakezwrot();
                }
            else if(event.isTypeOf(dodaj_nominal_5gr.dodaj_nominal_5gr_Default_id))
                {
                    res = StartTakedodaj_nominal_5gr();
                }
            else if(event.isTypeOf(dodaj_nominal_1zl.dodaj_nominal_1zl_Default_id))
                {
                    res = StartTakedodaj_nominal_1zl();
                }
            else if(event.isTypeOf(dodaj_nominal_50gr.dodaj_nominal_50gr_Default_id))
                {
                    res = StartTakedodaj_nominal_50gr();
                }
            else if(event.isTypeOf(dodaj_nominal_2zl.dodaj_nominal_2zl_Default_id))
                {
                    res = StartTakedodaj_nominal_2zl();
                }
            else if(event.isTypeOf(dodaj_nominal_5.dodaj_nominal_5_Default_id))
                {
                    res = StartTakedodaj_nominal_5();
                }
            else if(event.isTypeOf(dodaj_nominal_20gr.dodaj_nominal_20gr_Default_id))
                {
                    res = StartTakedodaj_nominal_20gr();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void state_3Enter() {
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return wrzutnia.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasswrzutnia; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("suma", suma);
        msg.add("wartosc", wartosc);
        msg.add("lancuch2", lancuch2);
        msg.add("ekran", ekran);
        msg.add("liczba1", liczba1);
        msg.add("liczba10gr", liczba10gr);
        msg.add("liczba2", liczba2);
        msg.add("liczba20gr", liczba20gr);
        msg.add("liczba5", liczba5);
        msg.add("liczba50gr", liczba50gr);
        msg.add("liczba5gr", liczba5gr);
        msg.add("licznik", licznik);
        msg.add("licznik3", licznik3);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(wrzutnia.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            wrzutnia.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            wrzutnia.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: przemka/glowny/Default/wrzutnia.java
*********************************************************************/

