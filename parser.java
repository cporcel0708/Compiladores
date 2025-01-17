
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Oct 15 16:33:10 ART 2024
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Oct 15 16:33:10 ART 2024
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\005\011\000\002\002\004\000\002\006" +
    "\003\000\002\006\003\000\002\006\003\000\002\002\004" +
    "\000\002\002\003\000\002\003\005\000\002\003\006\000" +
    "\002\003\005\000\002\003\004\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\005\000\002\004" +
    "\005\000\002\004\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\010\020\010\021\006\022\007\001\002\000" +
    "\004\002\053\001\002\000\004\017\011\001\002\000\006" +
    "\017\ufffe\026\ufffe\001\002\000\006\017\ufffd\026\ufffd\001" +
    "\002\000\006\017\uffff\026\uffff\001\002\000\004\011\012" +
    "\001\002\000\004\012\013\001\002\000\004\023\014\001" +
    "\002\000\014\016\016\020\010\021\006\022\007\026\015" +
    "\001\002\000\004\013\050\001\002\000\016\004\031\011" +
    "\033\014\027\015\032\025\030\026\026\001\002\000\016" +
    "\016\ufffb\020\ufffb\021\ufffb\022\ufffb\024\ufffb\026\ufffb\001" +
    "\002\000\016\016\016\020\010\021\006\022\007\024\025" +
    "\026\015\001\002\000\004\026\022\001\002\000\004\004" +
    "\023\001\002\000\016\016\ufffa\020\ufffa\021\ufffa\022\ufffa" +
    "\024\ufffa\026\ufffa\001\002\000\016\016\ufffc\020\ufffc\021" +
    "\ufffc\022\ufffc\024\ufffc\026\ufffc\001\002\000\004\002\001" +
    "\001\002\000\016\004\uffee\005\uffee\006\uffee\007\uffee\010" +
    "\uffee\012\uffee\001\002\000\016\004\ufff1\005\ufff1\006\ufff1" +
    "\007\ufff1\010\ufff1\012\ufff1\001\002\000\016\004\uffef\005" +
    "\uffef\006\uffef\007\uffef\010\uffef\012\uffef\001\002\000\016" +
    "\016\ufff7\020\ufff7\021\ufff7\022\ufff7\024\ufff7\026\ufff7\001" +
    "\002\000\016\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0" +
    "\012\ufff0\001\002\000\014\011\033\014\027\015\032\025" +
    "\030\026\026\001\002\000\014\004\037\005\036\006\035" +
    "\007\040\010\041\001\002\000\014\011\033\014\027\015" +
    "\032\025\030\026\026\001\002\000\014\011\033\014\027" +
    "\015\032\025\030\026\026\001\002\000\016\016\ufff8\020" +
    "\ufff8\021\ufff8\022\ufff8\024\ufff8\026\ufff8\001\002\000\014" +
    "\011\033\014\027\015\032\025\030\026\026\001\002\000" +
    "\014\011\033\014\027\015\032\025\030\026\026\001\002" +
    "\000\016\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\012" +
    "\ufff5\001\002\000\016\004\ufff3\005\036\006\035\007\ufff3" +
    "\010\041\012\ufff3\001\002\000\016\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\041\012\ufff6\001\002\000\016\004\ufff4" +
    "\005\036\006\ufff4\007\ufff4\010\041\012\ufff4\001\002\000" +
    "\014\005\036\006\035\007\040\010\041\012\047\001\002" +
    "\000\016\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\012" +
    "\ufff2\001\002\000\014\011\033\014\027\015\032\025\030" +
    "\026\026\001\002\000\014\004\052\005\036\006\035\007" +
    "\040\010\041\001\002\000\016\016\ufff9\020\ufff9\021\ufff9" +
    "\022\ufff9\024\ufff9\026\ufff9\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\006\005\003\006\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\002\017\003\016\006\020\001\001" +
    "\000\002\001\001\000\004\004\033\001\001\000\002\001" +
    "\001\000\006\003\023\006\020\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\045\001\001\000\002\001\001\000\004\004\044\001\001" +
    "\000\004\004\043\001\001\000\002\001\001\000\004\004" +
    "\042\001\001\000\004\004\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\050\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static TablaSimbolo tabla = new TablaSimbolo();
    public static ArrayList<Codigo3D> lista3d = new ArrayList<Codigo3D>();
    // Método para reportar errores
    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = (java_cup.runtime.Symbol) info;
            if (s.left >= 0) m.append(" in line " + (s.left + 1));
            if (s.right >= 0) m.append(", column " + (s.right + 1));
        }
        m.append(" : " + message);
        System.err.println(m);
    }

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);  // Terminar la ejecución
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= ID 
            {
              Arbol RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                Simbolo simbolo = parser.tabla.buscar(id); 
                if (simbolo==null){
                        parser.report_fatal_error("Variable no declarada: " + id + " (Linea " + idleft + ").\n", null);
                }
                else{
		                RESULT = new Arbol(simbolo);
                }
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= NUMBER 
            {
              Arbol RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.VALORENTERO,"",Tipos.INT,num,numleft));     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= FALSE 
            {
              Arbol RESULT =null;
		int falsoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int falsoright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object falso = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.VALORBOOLEANO,"",Tipos.BOOL,0,falsoleft));  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= TRUE 
            {
              Arbol RESULT =null;
		int verdadleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int verdadright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object verdad = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.VALORBOOLEANO,"",Tipos.BOOL,1,verdadleft)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= LPAREN expr RPAREN 
            {
              Arbol RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr OR expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        if (e1.getInfo().getTipo() != Tipos.BOOL || e2.getInfo().getTipo() != Tipos.BOOL) {
              parser.report_fatal_error("Tipos incompatibles en OR (se esperaba BOOLEAN): " + e1.getInfo().getTipo() + " y " + e2.getInfo().getTipo() + ".\n", null);
        }

        //Crear c3d y almacenarlo para mostrarlo en orden
        Simbolo temp = new Simbolo(Etiqueta.OR,"||",Tipos.BOOL,(e1.getInfo().getValor() + e2.getInfo().getValor() >=1 ? 1 : 0 ),oleft);
        parser.lista3d.add(new Codigo3D(Etiqueta.OR,e1.getInfo(),e2.getInfo(),temp));
        RESULT = new Arbol(temp, e1, e2);
 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr AND expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        if (e1.getInfo().getTipo() != Tipos.BOOL || e2.getInfo().getTipo() != Tipos.BOOL) {
            parser.report_fatal_error("Tipos incompatibles en AND (se esperaba BOOLEAN): " + e1.getInfo().getTipo() + " y " + e2.getInfo().getTipo() + ".\n", null);
        }

        Simbolo temp = new Simbolo(Etiqueta.AND,"&&",Tipos.BOOL,e1.getInfo().getValor() * e2.getInfo().getValor() ==1 ? 1 : 0 ,aleft);
        parser.lista3d.add(new Codigo3D(Etiqueta.AND,e1.getInfo(),e2.getInfo(),temp));
        RESULT = new Arbol(temp, e1, e2);
 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr TIMES expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if (e1.getInfo().getTipo() != Tipos.INT || e2.getInfo().getTipo() != Tipos.INT) {
            parser.report_fatal_error("Tipos incompatibles en multiplicación (se esperaba INT): " + e1.getInfo().getTipo() + " y " + e2.getInfo().getTipo() + ".\n", null);
        }
        Simbolo temp = new Simbolo(Etiqueta.MULT,"*",Tipos.INT,e1.getInfo().getValor()*e2.getInfo().getValor(),tleft);
        parser.lista3d.add(new Codigo3D(Etiqueta.MULT,e1.getInfo(),e2.getInfo(),temp));
        RESULT = new Arbol(temp, e1, e2);

        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr PLUS expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
         if (e1.getInfo().getTipo() != Tipos.INT || e2.getInfo().getTipo() != Tipos.INT) {
             parser.report_fatal_error("Tipos incompatibles en suma (se esperaba INT): " + e1.getInfo().getTipo() + " y " + e2.getInfo().getTipo() + ".\n", null);
         }
         Simbolo temp = new Simbolo(Etiqueta.SUMA,"+",Tipos.INT,e1.getInfo().getValor()+e2.getInfo().getValor(),pleft);
         parser.lista3d.add(new Codigo3D(Etiqueta.SUMA,e1.getInfo(),e2.getInfo(),temp));
         RESULT = new Arbol(temp, e1, e2);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr_part ::= RETURN SEMI 
            {
              Arbol RESULT =null;
		 
                  Simbolo temp = new Simbolo(Etiqueta.RETURN);
                  parser.lista3d.add(new Codigo3D(Etiqueta.RETURN,null,null,temp));
                  RESULT = new Arbol(temp,null,null);
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr_part ::= RETURN expr SEMI 
            {
              Arbol RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.println("resultado:"+e.getInfo().getValor());
                  Simbolo temp = new Simbolo(Etiqueta.RETURN);
                  parser.lista3d.add(new Codigo3D(Etiqueta.RETURN,null,e.getInfo(),temp));
                  RESULT = new Arbol(temp,null,e);
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr_part ::= ID ASSIGN expr SEMI 
            {
              Arbol RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 Simbolo simbolo = parser.tabla.buscar(id); 
                 if (simbolo==null){ 
                  parser.report_fatal_error("Variable no declarada: " + id + " (Línea " + idleft + ").\n", null);                                                
                 } 
                 else {
        
                    Tipos tipoExpresion = e.getInfo().getTipo();
                    if (simbolo.getTipo() == Tipos.NOTTYPE) {
                        parser.tabla.actualizarTipo(id, tipoExpresion);
                        simbolo.setTipo(tipoExpresion);
                    }
                    else if (simbolo.getTipo() != tipoExpresion) {
                        parser.report_fatal_error("Tipos incompatibles en la asignación: variable " + id + " es de tipo " + simbolo.getTipo() + " pero se le asigna un valor de tipo " + tipoExpresion + ".\n", null);
                    }
                    simbolo.setValor(e.getInfo().getValor());
                    Simbolo temp = new Simbolo(Etiqueta.ASIGNACION);
                    parser.lista3d.add(new Codigo3D(Etiqueta.ASIGNACION,new Arbol(simbolo).getInfo(),e.getInfo(),temp));
                    RESULT = new Arbol(temp, new Arbol(simbolo), e);
                }
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr_part ::= TIPO ID SEMI 
            {
              Arbol RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tipos t = (Tipos)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 Simbolo simbolo = new Simbolo(Etiqueta.VARIABLE, id, t, 0, idleft);
                 Simbolo resultado = parser.tabla.insertar(simbolo);
                 if (resultado == null) {
                  parser.report_fatal_error("Variable ya declarada: " + id + " (Línea " + idleft + ").\n", null);
                 }
                  Simbolo temp = new Simbolo(Etiqueta.DECLARACION);
                  parser.lista3d.add(new Codigo3D(Etiqueta.DECLARACION,new Arbol(simbolo).getInfo(),null,temp));
                  RESULT = new Arbol(temp, new Arbol(simbolo), null);
                 
			  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr_list ::= expr_part 
            {
              Arbol RESULT =null;
		int epleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int epright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Arbol ep = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = ep;
   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr_list ::= expr_list expr_part 
            {
              Arbol RESULT =null;
		int elleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int elright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Arbol el = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int epleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int epright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Arbol ep = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                  RESULT = new Arbol(new Simbolo(Etiqueta.DECLS), el, ep); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // TIPO ::= VOID 
            {
              Tipos RESULT =null;
		 RESULT = Tipos.NOTTYPE; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // TIPO ::= BOOLEAN 
            {
              Tipos RESULT =null;
		 RESULT = Tipos.BOOL; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // TIPO ::= INT 
            {
              Tipos RESULT =null;
		 RESULT = Tipos.INT; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Arbol start_val = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // prog ::= TIPO MAIN LPAREN RPAREN LBRACE expr_list RBRACE 
            {
              Arbol RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
          System.out.println("Tabla de Simbolos\n"+parser.tabla);
          System.out.println("PseudoAssembler");
          for(Codigo3D secuencia: parser.lista3d){
            System.out.println(secuencia);
          }

          /*
             generar el asambler desde aca. Se recorre y muestra por consola al igual que el C3D de forma iterativa.
             Estas instrucciones solo se ejecutan una vez, definiendo el offset:

             Al Simbolo hay que agregar una etiqueta llamada 'offSet'

             Implementacion:
          */
/*
        String Assembler;
        for(){Codigo3D secuencia: parser.lista3d)
            System.out.println("pushq   %rbp        ;");
            System.out.println("movq    %rsp, %rbp  ;");
            System.out.println(secuencia);

            if(Secuencia.)


            System.out.println("popq    %rbp            ;");
            System.out.println("ret                     ; );
        }
*/

    Simbolo temp = new Simbolo(Etiqueta.PROGRAMA);
    parser.lista3d.add(new Codigo3D(Etiqueta.PROGRAMA,e.getInfo(),null,temp));
		RESULT = new Arbol(temp,e, null); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

