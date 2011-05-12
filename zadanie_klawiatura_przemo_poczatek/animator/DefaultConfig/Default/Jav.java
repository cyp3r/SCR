/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: animator
	Configuration 	: DefaultConfig
	Model Element	: Jav
//!	Generated Date	: Thu, 12, May 2011 
	File Path	: animator/DefaultConfig/Default/Jav.java
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
// Default/Jav.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Jav 
public class Jav implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassJav = new AnimClass("Default.Jav",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int id_product;		//## attribute id_product 
    
    protected String lancuch;		//## attribute lancuch 
    
    protected int licznik = 0;		//## attribute licznik 
    
    protected java.util.Vector lista;		//## attribute lista 
    
    protected java.util.Hashtable lista_asocjacyjna;		//## attribute lista_asocjacyjna 
    
    protected int poziom;		//## attribute poziom 
    
    protected boolean wybrano_produkt;		//## attribute wybrano_produkt 
    
    protected Komponent komponent1;		//## classInstance komponent1 
    
    protected Komponent komponent2;		//## classInstance komponent2 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int znaleziono=1;
    public static final int wybor_produktu=2;
    public static final int Ustalanie=3;
    public static final int start_maszyny=4;
    public static final int nie_znaleziono=5;
    public static final int napisy_poczatkowe=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Jav_Timeout_wybor_produktu_id = 1;		//## ignore 
    
    public static final int Jav_Timeout_nie_znaleziono_id = 2;		//## ignore 
    
    
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
    
    //## operation Jav() 
    public  Jav(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassJav.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Jav() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getId_product() {
        return id_product;
    }
    
    //## auto_generated 
    public void setId_product(int p_id_product) {
        try {
        id_product = p_id_product;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public String getLancuch() {
        return lancuch;
    }
    
    //## auto_generated 
    public void setLancuch(String p_lancuch) {
        lancuch = p_lancuch;
    }
    
    //## auto_generated 
    public int getLicznik() {
        return licznik;
    }
    
    //## auto_generated 
    public void setLicznik(int p_licznik) {
        licznik = p_licznik;
    }
    
    //## auto_generated 
    public java.util.Vector getLista() {
        return lista;
    }
    
    //## auto_generated 
    public void setLista(java.util.Vector p_lista) {
        lista = p_lista;
    }
    
    //## auto_generated 
    public java.util.Hashtable getLista_asocjacyjna() {
        return lista_asocjacyjna;
    }
    
    //## auto_generated 
    public void setLista_asocjacyjna(java.util.Hashtable p_lista_asocjacyjna) {
        lista_asocjacyjna = p_lista_asocjacyjna;
    }
    
    //## auto_generated 
    public int getPoziom() {
        return poziom;
    }
    
    //## auto_generated 
    public void setPoziom(int p_poziom) {
        try {
        poziom = p_poziom;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public boolean getWybrano_produkt() {
        return wybrano_produkt;
    }
    
    //## auto_generated 
    public void setWybrano_produkt(boolean p_wybrano_produkt) {
        wybrano_produkt = p_wybrano_produkt;
    }
    
    //## auto_generated 
    public Komponent getKomponent1() {
        return komponent1;
    }
    
    //## auto_generated 
    public Komponent newKomponent1(RiJThread p_thread) {
        komponent1 = new Komponent(p_thread);
        animInstance().notifyRelationAdded("komponent1", komponent1);
        return komponent1;
    }
    
    //## auto_generated 
    public void deleteKomponent1() {
        animInstance().notifyRelationRemoved("komponent1", komponent1);
        komponent1=null;
    }
    
    //## auto_generated 
    public Komponent getKomponent2() {
        return komponent2;
    }
    
    //## auto_generated 
    public Komponent newKomponent2(RiJThread p_thread) {
        komponent2 = new Komponent(p_thread);
        animInstance().notifyRelationAdded("komponent2", komponent2);
        return komponent2;
    }
    
    //## auto_generated 
    public void deleteKomponent2() {
        animInstance().notifyRelationRemoved("komponent2", komponent2);
        komponent2=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        komponent1 = newKomponent1(p_thread);
        komponent2 = newKomponent2(p_thread);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= komponent1.startBehavior();
        done &= komponent2.startBehavior();
        done &= reactive.startBehavior();
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
                case start_maszyny:
                {
                    start_maszyny_add(animStates);
                }
                break;
                case Ustalanie:
                {
                    Ustalanie_add(animStates);
                }
                break;
                case wybor_produktu:
                {
                    wybor_produktu_add(animStates);
                }
                break;
                case znaleziono:
                {
                    znaleziono_add(animStates);
                }
                break;
                case nie_znaleziono:
                {
                    nie_znaleziono_add(animStates);
                }
                break;
                case napisy_poczatkowe:
                {
                    napisy_poczatkowe_add(animStates);
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
                case start_maszyny:
                {
                    res = start_maszyny_takeEvent(id);
                }
                break;
                case Ustalanie:
                {
                    res = Ustalanie_takeEvent(id);
                }
                break;
                case wybor_produktu:
                {
                    res = wybor_produktu_takeEvent(id);
                }
                break;
                case znaleziono:
                {
                    res = znaleziono_takeEvent(id);
                }
                break;
                case nie_znaleziono:
                {
                    res = nie_znaleziono_takeEvent(id);
                }
                break;
                case napisy_poczatkowe:
                {
                    res = napisy_poczatkowe_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_add(AnimStates animStates) {
            animStates.add("ROOT.znaleziono");
        }
        
        //## statechart_method 
        public void wybor_produktu_add(AnimStates animStates) {
            animStates.add("ROOT.wybor_produktu");
        }
        
        //## statechart_method 
        public void Ustalanie_add(AnimStates animStates) {
            animStates.add("ROOT.Ustalanie");
        }
        
        //## statechart_method 
        public void start_maszyny_add(AnimStates animStates) {
            animStates.add("ROOT.start_maszyny");
        }
        
        //## statechart_method 
        public void nie_znaleziono_add(AnimStates animStates) {
            animStates.add("ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_add(AnimStates animStates) {
            animStates.add("ROOT.napisy_poczatkowe");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void nie_znaleziono_exit() {
            nie_znalezionoExit();
            animInstance().notifyStateExited("ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public int napisy_poczatkoweTakeakcja_gui1() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            napisy_poczatkowe_exit();
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void nie_znaleziono_entDef() {
            nie_znaleziono_enter();
        }
        
        //## statechart_method 
        public void start_maszyny_entDef() {
            start_maszyny_enter();
        }
        
        //## statechart_method 
        public void wybor_produktu_entDef() {
            wybor_produktu_enter();
        }
        
        //## statechart_method 
        public int wybor_produktu_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = wybor_produktuTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = wybor_produktuTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int znaleziono_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void znalezionoExit() {
        }
        
        //## statechart_method 
        public void start_maszynyExit() {
        }
        
        //## statechart_method 
        public int UstalanieTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Ustalanie_exit();
            napisy_poczatkowe_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void UstalanieExit() {
        }
        
        //## statechart_method 
        public int wybor_produktuTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_wybor_produktu_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    wybor_produktu_exit();
                    start_maszyny_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void napisy_poczatkoweExit() {
        }
        
        //## statechart_method 
        public int nie_znaleziono_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = nie_znalezionoTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int nie_znalezionoTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_nie_znaleziono_id)
                {
                    animInstance().notifyTransitionStarted("7");
                    nie_znaleziono_exit();
                    napisy_poczatkowe_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Ustalanie_enter() {
            animInstance().notifyStateEntered("ROOT.Ustalanie");
            pushNullConfig();
            rootState_subState = Ustalanie;
            rootState_active = Ustalanie;
            UstalanieEnter();
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_entDef() {
            napisy_poczatkowe_enter();
        }
        
        //## statechart_method 
        public void start_maszynyEnter() {
            //#[ state ROOT.start_maszyny.(Entry) 
            if(id_product == 0)
            	id_product = poziom;
            else if(id_product < 10)
                id_product = id_product*10 + poziom;
            else 
                id_product = 0;
            
            lancuch = "Wybrano numer: " + id_product;
            //#]
        }
        
        //## statechart_method 
        public void UstalanieEnter() {
            //#[ state ROOT.Ustalanie.(Entry) 
            lista_asocjacyjna = new java.util.Hashtable();
            lista_asocjacyjna.put("sok Kubus", new Integer(1));
            lista_asocjacyjna.put("sok Mateuszek", new Integer(2));
            lista_asocjacyjna.put("sok £ukaszek", new Integer(3));
            lista_asocjacyjna.put("sok Wojtus", new Integer(4));
            lista_asocjacyjna.put("sok Dariuszek", new Integer(5));
            lista_asocjacyjna.put("sok Madzia", new Integer(6));
            lista_asocjacyjna.put("sok Jaromiœ", new Integer(7));
            lista_asocjacyjna.put("sok Przemka", new Integer(8));
            
            lista_asocjacyjna.put("baton Uberweiss", new Integer(11));
            lista_asocjacyjna.put("baton Lange Schlange", new Integer(12)); 
            lista_asocjacyjna.put("baton Auf Wiedersehen", new Integer(13));
            lista_asocjacyjna.put("baton Verboten", new Integer(14));
            lista_asocjacyjna.put("baton Klar", new Integer(15));
            lista_asocjacyjna.put("baton Balaton", new Integer(16));
            //#]
        }
        
        //## statechart_method 
        public void wybor_produktu_enter() {
            animInstance().notifyStateEntered("ROOT.wybor_produktu");
            pushNullConfig();
            rootState_subState = wybor_produktu;
            rootState_active = wybor_produktu;
            wybor_produktuEnter();
        }
        
        //## statechart_method 
        public void znalezionoEnter() {
            //#[ state ROOT.znaleziono.(Entry) 
            lancuch = "znaleziono produkt " + id_product;
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
        public int start_maszyny_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(akcja_gui1.akcja_gui1_Default_id))
                {
                    res = start_maszynyTakeakcja_gui1();
                }
            else if(event.isTypeOf(akcja_gui2.akcja_gui2_Default_id))
                {
                    res = start_maszynyTakeakcja_gui2();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_enter() {
            animInstance().notifyStateEntered("ROOT.znaleziono");
            rootState_subState = znaleziono;
            rootState_active = znaleziono;
            znalezionoEnter();
        }
        
        //## statechart_method 
        public void wybor_produktuEnter() {
            //#[ state ROOT.wybor_produktu.(Entry) 
            if (lista_asocjacyjna.containsValue(id_product)){
            	wybrano_produkt = true;
            }
            else{
                    wybrano_produkt = false;
            }
                                           
                
            
            //#]
            itsRiJThread.schedTimeout(100, Jav_Timeout_wybor_produktu_id, this, "ROOT.wybor_produktu");
        }
        
        //## statechart_method 
        public void napisy_poczatkoweEnter() {
            //#[ state ROOT.napisy_poczatkowe.(Entry) 
            lancuch = "Wybierz cyfre i zatwierdz ja klawiszem \"OK\".";
            //#]
        }
        
        //## statechart_method 
        public void start_maszyny_exit() {
            start_maszynyExit();
            animInstance().notifyStateExited("ROOT.start_maszyny");
        }
        
        //## statechart_method 
        public void Ustalanie_exit() {
            popNullConfig();
            UstalanieExit();
            animInstance().notifyStateExited("ROOT.Ustalanie");
        }
        
        //## statechart_method 
        public void znaleziono_exit() {
            znalezionoExit();
            animInstance().notifyStateExited("ROOT.znaleziono");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("1");
            Ustalanie_entDef();
            animInstance().notifyTransitionEnded("1");
        }
        
        //## statechart_method 
        public void Ustalanie_entDef() {
            Ustalanie_enter();
        }
        
        //## statechart_method 
        public int wybor_produktuTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 5 
            if(wybrano_produkt==true)
                {
                    animInstance().notifyTransitionStarted("5");
                    wybor_produktu_exit();
                    znaleziono_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 6 
                    if(wybrano_produkt==false)
                        {
                            animInstance().notifyTransitionStarted("6");
                            wybor_produktu_exit();
                            nie_znaleziono_entDef();
                            animInstance().notifyTransitionEnded("6");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void wybor_produktu_exit() {
            popNullConfig();
            wybor_produktuExit();
            animInstance().notifyStateExited("ROOT.wybor_produktu");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_exit() {
            napisy_poczatkoweExit();
            animInstance().notifyStateExited("ROOT.napisy_poczatkowe");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_enter() {
            animInstance().notifyStateEntered("ROOT.napisy_poczatkowe");
            rootState_subState = napisy_poczatkowe;
            rootState_active = napisy_poczatkowe;
            napisy_poczatkoweEnter();
        }
        
        //## statechart_method 
        public void nie_znaleziono_enter() {
            animInstance().notifyStateEntered("ROOT.nie_znaleziono");
            rootState_subState = nie_znaleziono;
            rootState_active = nie_znaleziono;
            nie_znalezionoEnter();
        }
        
        //## statechart_method 
        public void start_maszyny_enter() {
            animInstance().notifyStateEntered("ROOT.start_maszyny");
            rootState_subState = start_maszyny;
            rootState_active = start_maszyny;
            start_maszynyEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int napisy_poczatkowe_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(akcja_gui1.akcja_gui1_Default_id))
                {
                    res = napisy_poczatkoweTakeakcja_gui1();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakeakcja_gui1() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            start_maszyny_exit();
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Ustalanie_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = UstalanieTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_entDef() {
            znaleziono_enter();
        }
        
        //## statechart_method 
        public void nie_znalezionoExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_nie_znaleziono_id, this);
        }
        
        //## statechart_method 
        public void nie_znalezionoEnter() {
            //#[ state ROOT.nie_znaleziono.(Entry) 
            lancuch = "Produktu " + id_product + " nie znaleziono. Czekaj...";
            //#]
            itsRiJThread.schedTimeout(2000, Jav_Timeout_nie_znaleziono_id, this, "ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public int start_maszynyTakeakcja_gui2() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            start_maszyny_exit();
            wybor_produktu_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void wybor_produktuExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_wybor_produktu_id, this);
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
            return Jav.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassJav; 
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
        
        msg.add("lancuch", lancuch);
        msg.add("poziom", poziom);
        msg.add("id_product", id_product);
        msg.add("licznik", licznik);
        msg.add("lista", lista);
        msg.add("lista_asocjacyjna", lista_asocjacyjna);
        msg.add("wybrano_produkt", wybrano_produkt);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("komponent1", true, true, komponent1);
        msg.add("komponent2", true, true, komponent2);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Jav.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Jav.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Jav.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: animator/DefaultConfig/Default/Jav.java
*********************************************************************/

