// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/compiler/Scanner_Jflex.flex

package compiler;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Scanner_phase1 {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\5\u0100\1\u0200\1\u0300\1\u0100\5\u0400\1\u0500\1\u0600"+
    "\1\u0700\5\u0100\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00"+
    "\1\u0e00\3\u0100\1\u0f00\17\u0100\1\u1000\165\u0100\1\u0600\1\u0100"+
    "\1\u1100\1\u1200\1\u1300\1\u1400\54\u0100\10\u1500\37\u0100\1\u1600"+
    "\4\u0100\1\u1700\10\u0100\1\u1800\2\u0100\1\u1900\1\u1a00\1\u1400"+
    "\1\u0100\1\u0500\1\u0100\1\u1b00\1\u1800\1\u0900\3\u0100\1\u1300"+
    "\1\u1c00\114\u0100\1\u1d00\1\u1300\153\u0100\1\u1e00\11\u0100\1\u1f00"+
    "\1\u1400\6\u0100\1\u1300\u0f16\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\1\6\2\0\1\7\1\10\3\7\1\11\1\12\1\7"+
    "\1\12\1\13\1\14\1\15\11\16\1\0\1\7\1\5"+
    "\1\17\1\5\2\0\1\20\3\21\1\22\1\21\2\23"+
    "\1\24\2\23\1\25\1\23\1\26\1\23\1\27\1\23"+
    "\1\30\5\23\1\31\2\23\1\7\1\32\1\7\1\0"+
    "\1\33\1\0\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\23\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\23\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\31\1\61\1\23\1\7\1\62\1\7\7\0"+
    "\1\3\32\0\1\1\101\0\1\63\u017d\0\12\64\206\0"+
    "\12\64\306\0\12\64\234\0\12\64\166\0\12\64\140\0"+
    "\12\64\166\0\12\64\106\0\12\64\u0116\0\12\64\106\0"+
    "\12\64\346\0\1\1\u015f\0\12\64\46\0\12\64\u012c\0"+
    "\12\64\200\0\12\64\246\0\12\64\6\0\12\64\266\0"+
    "\12\64\126\0\12\64\206\0\12\64\6\0\12\64\246\0"+
    "\13\1\35\0\2\3\5\0\1\1\57\0\1\1\114\0"+
    "\1\65\123\0\1\1\u01cf\0\12\64\46\0\12\64\306\0"+
    "\12\64\26\0\12\64\126\0\12\64\u0196\0\12\64\6\0"+
    "\u0100\66\20\0\12\64\343\0\1\67\242\0\12\64\206\0"+
    "\12\64\u012c\0\12\64\200\0\12\64\74\0\12\64\220\0"+
    "\12\64\166\0\12\64\146\0\12\64\206\0\12\64\106\0"+
    "\12\64\266\0\12\64\u0164\0\62\64\100\0\12\64\266\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[8192];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\3\3\1\1\1\3\2\4\4\5"+
    "\2\1\15\5\2\1\2\0\1\2\1\6\1\0\3\5"+
    "\1\0\12\5\1\3\15\5\1\0\1\7\2\0\1\4"+
    "\3\5\2\0\23\5\2\0\1\6\2\5\2\0\10\5"+
    "\1\10\2\5\2\0\7\5\1\0\3\5\1\0\2\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\70\0\160\0\250\0\340\0\70\0\u0118"+
    "\0\u0150\0\u0188\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8"+
    "\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498"+
    "\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0658"+
    "\0\u0690\0\u06c8\0\u0700\0\u0738\0\u0770\0\u07a8\0\u07e0\0\u0818"+
    "\0\u0850\0\u0888\0\u08c0\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8"+
    "\0\u0a10\0\u0a48\0\u0a80\0\u01f8\0\u0ab8\0\u0af0\0\u0b28\0\u0b60"+
    "\0\u0b98\0\u0bd0\0\u0c08\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20"+
    "\0\u0d58\0\u0d90\0\70\0\u0dc8\0\u0e00\0\u0770\0\u0e38\0\u0e70"+
    "\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50\0\u0f88\0\u0fc0\0\u0ff8\0\u1030"+
    "\0\u1068\0\u10a0\0\u10d8\0\u1110\0\u1148\0\u1180\0\u11b8\0\u11f0"+
    "\0\u1228\0\u1260\0\u1298\0\u12d0\0\u1308\0\u1340\0\u1378\0\u13b0"+
    "\0\u13b0\0\u13e8\0\u1420\0\u1458\0\u1490\0\u14c8\0\u1500\0\u1538"+
    "\0\u1570\0\u15a8\0\u15e0\0\u1618\0\u1650\0\u01f8\0\u1688\0\u16c0"+
    "\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u17d8\0\u1810\0\u1848\0\u1880"+
    "\0\u18b8\0\u18f0\0\u1928\0\u1960\0\u1998\0\u19d0\0\u1a08\0\u1a40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\2\5"+
    "\1\7\1\11\1\12\1\13\1\5\6\14\1\15\1\16"+
    "\1\17\1\14\1\20\1\21\1\14\1\22\1\23\1\24"+
    "\1\25\1\26\2\14\1\27\3\14\1\30\1\14\1\31"+
    "\1\32\1\33\1\34\1\14\1\35\1\36\1\14\1\37"+
    "\1\40\1\13\3\2\72\0\1\3\104\0\1\7\50\0"+
    "\2\41\1\0\1\41\1\0\1\41\1\0\61\41\10\0"+
    "\1\7\70\0\1\42\2\0\1\43\2\0\1\7\63\0"+
    "\1\44\1\0\1\12\1\13\12\0\1\45\32\0\1\13"+
    "\16\0\1\44\1\0\2\13\45\0\1\13\20\0\2\14"+
    "\1\0\12\14\1\0\27\14\23\0\2\14\1\0\12\14"+
    "\1\0\5\14\1\46\21\14\23\0\2\14\1\0\12\14"+
    "\1\0\20\14\1\47\6\14\23\0\2\14\1\0\12\14"+
    "\1\0\5\14\1\50\21\14\56\0\1\7\52\0\1\51"+
    "\51\0\2\14\1\0\12\14\1\0\16\14\1\52\1\14"+
    "\1\53\1\14\1\54\4\14\23\0\2\14\1\0\12\14"+
    "\1\0\13\14\1\55\2\14\1\56\10\14\23\0\2\14"+
    "\1\0\12\14\1\0\5\14\1\57\10\14\1\60\3\14"+
    "\1\54\4\14\23\0\2\14\1\0\12\14\1\0\13\14"+
    "\1\61\13\14\23\0\2\14\1\0\12\14\1\0\1\14"+
    "\1\62\14\14\1\63\10\14\23\0\2\14\1\0\12\14"+
    "\1\0\6\14\1\64\5\14\1\65\1\66\4\14\1\67"+
    "\4\14\23\0\2\14\1\0\12\14\1\0\5\14\1\70"+
    "\15\14\1\71\3\14\23\0\2\14\1\0\12\14\1\0"+
    "\20\14\1\72\2\14\1\73\3\14\23\0\2\14\1\0"+
    "\12\14\1\0\5\14\1\74\21\14\23\0\2\14\1\0"+
    "\12\14\1\0\22\14\1\75\4\14\23\0\2\14\1\0"+
    "\12\14\1\0\10\14\1\76\7\14\1\77\6\14\23\0"+
    "\2\14\1\0\12\14\1\0\16\14\1\100\10\14\23\0"+
    "\2\14\1\0\12\14\1\0\10\14\1\101\16\14\70\0"+
    "\1\7\72\0\1\102\2\0\2\41\1\0\1\41\1\0"+
    "\1\41\1\103\61\41\11\104\1\0\56\104\2\43\3\0"+
    "\61\43\1\0\1\43\15\0\2\44\3\0\1\105\15\0"+
    "\1\105\23\0\1\44\20\0\2\106\1\0\3\106\11\0"+
    "\6\106\43\0\2\14\1\0\12\14\1\0\25\14\1\107"+
    "\1\14\23\0\2\14\1\0\12\14\1\0\11\14\1\110"+
    "\15\14\23\0\2\14\1\0\12\14\1\0\1\14\1\111"+
    "\25\14\47\0\1\112\4\0\1\113\36\0\2\14\1\0"+
    "\12\14\1\0\16\14\1\114\10\14\23\0\2\14\1\0"+
    "\12\14\1\0\5\14\1\115\21\14\23\0\2\14\1\0"+
    "\12\14\1\0\16\14\1\116\10\14\23\0\2\14\1\0"+
    "\12\14\1\0\1\14\1\117\25\14\23\0\2\14\1\0"+
    "\12\14\1\0\15\14\1\120\11\14\23\0\2\14\1\0"+
    "\12\14\1\0\6\14\1\121\20\14\23\0\2\14\1\0"+
    "\12\14\1\0\23\14\1\122\3\14\23\0\2\14\1\0"+
    "\12\14\1\0\21\14\1\123\5\14\23\0\2\14\1\0"+
    "\12\14\1\0\13\14\1\124\13\14\23\0\2\14\1\0"+
    "\12\14\1\0\20\14\1\64\6\14\23\0\2\14\1\0"+
    "\12\14\1\0\17\14\1\125\7\14\23\0\2\14\1\0"+
    "\12\14\1\0\22\14\1\64\4\14\23\0\2\14\1\0"+
    "\12\14\1\0\16\14\1\126\10\14\23\0\2\14\1\0"+
    "\12\14\1\0\25\14\1\64\1\14\23\0\2\14\1\0"+
    "\12\14\1\0\13\14\1\114\13\14\23\0\2\14\1\0"+
    "\12\14\1\0\11\14\1\127\15\14\23\0\2\14\1\0"+
    "\12\14\1\0\2\14\1\130\24\14\23\0\2\14\1\0"+
    "\12\14\1\0\22\14\1\131\4\14\23\0\2\14\1\0"+
    "\12\14\1\0\20\14\1\132\6\14\23\0\2\14\1\0"+
    "\12\14\1\0\11\14\1\133\15\14\23\0\2\14\1\0"+
    "\12\14\1\0\23\14\1\134\3\14\23\0\2\14\1\0"+
    "\12\14\1\0\11\14\1\135\15\14\23\0\2\14\1\0"+
    "\12\14\1\0\11\14\1\136\15\14\75\0\1\7\11\104"+
    "\1\137\56\104\12\0\1\140\2\0\2\141\45\0\1\141"+
    "\20\0\2\14\1\0\1\142\11\14\1\0\27\14\23\0"+
    "\2\14\1\0\12\14\1\0\15\14\1\66\11\14\23\0"+
    "\2\14\1\0\12\14\1\0\4\14\1\143\22\14\64\0"+
    "\1\144\55\0\1\145\40\0\2\14\1\0\12\14\1\0"+
    "\13\14\1\64\13\14\23\0\2\14\1\0\12\14\1\0"+
    "\1\14\1\146\25\14\23\0\2\14\1\0\12\14\1\0"+
    "\11\14\1\64\15\14\23\0\2\14\1\0\12\14\1\0"+
    "\21\14\1\133\5\14\23\0\2\14\1\0\12\14\1\0"+
    "\22\14\1\147\4\14\23\0\2\14\1\0\12\14\1\0"+
    "\11\14\1\150\15\14\23\0\2\14\1\0\12\14\1\0"+
    "\2\14\1\136\24\14\23\0\2\14\1\0\12\14\1\0"+
    "\5\14\1\64\21\14\23\0\2\14\1\0\12\14\1\0"+
    "\21\14\1\134\5\14\23\0\2\14\1\0\12\14\1\0"+
    "\16\14\1\151\10\14\23\0\2\14\1\0\12\14\1\0"+
    "\2\14\1\64\1\14\1\64\22\14\23\0\2\14\1\0"+
    "\12\14\1\0\24\14\1\152\2\14\23\0\2\14\1\0"+
    "\12\14\1\0\13\14\1\153\13\14\23\0\2\14\1\0"+
    "\12\14\1\0\23\14\1\154\3\14\23\0\2\14\1\0"+
    "\12\14\1\0\11\14\1\155\15\14\23\0\2\14\1\0"+
    "\12\14\1\0\21\14\1\64\5\14\23\0\2\14\1\0"+
    "\12\14\1\0\5\14\1\156\21\14\23\0\2\14\1\0"+
    "\12\14\1\0\4\14\1\64\22\14\23\0\2\14\1\0"+
    "\12\14\1\0\13\14\1\123\13\14\6\0\11\104\1\137"+
    "\2\104\1\3\53\104\15\0\2\141\45\0\1\141\20\0"+
    "\2\14\1\0\12\14\1\0\20\14\1\157\6\14\23\0"+
    "\2\14\1\0\4\14\1\160\1\121\4\14\1\0\27\14"+
    "\56\0\1\161\67\0\1\162\34\0\2\14\1\0\12\14"+
    "\1\0\12\14\1\64\14\14\23\0\2\14\1\0\12\14"+
    "\1\0\11\14\1\163\15\14\23\0\2\14\1\0\12\14"+
    "\1\0\15\14\1\123\11\14\23\0\2\14\1\0\12\14"+
    "\1\0\20\14\1\66\6\14\23\0\2\14\1\0\12\14"+
    "\1\0\1\14\1\164\25\14\23\0\2\14\1\0\12\14"+
    "\1\0\11\14\1\165\15\14\23\0\2\14\1\0\12\14"+
    "\1\0\20\14\1\166\6\14\23\0\2\14\1\0\12\14"+
    "\1\0\15\14\1\167\11\14\23\0\2\14\1\0\12\14"+
    "\1\0\20\14\1\170\6\14\23\0\2\14\1\0\12\14"+
    "\1\0\15\14\1\171\11\14\44\0\1\172\71\0\1\172"+
    "\44\0\2\14\1\0\12\14\1\0\15\14\1\173\11\14"+
    "\23\0\2\14\1\0\12\14\1\0\22\14\1\123\4\14"+
    "\23\0\2\14\1\0\12\14\1\0\3\14\1\64\23\14"+
    "\23\0\2\14\1\0\12\14\1\0\15\14\1\64\11\14"+
    "\23\0\2\14\1\0\12\14\1\0\7\14\1\64\17\14"+
    "\23\0\2\14\1\0\12\14\1\0\1\14\1\174\25\14"+
    "\23\0\2\14\1\0\12\14\1\0\22\14\1\175\4\14"+
    "\41\0\1\176\51\0\2\14\1\0\12\14\1\0\23\14"+
    "\1\123\3\14\23\0\2\14\1\0\12\14\1\0\26\14"+
    "\1\64\23\0\2\14\1\0\12\14\1\0\5\14\1\177"+
    "\21\14\41\0\1\7\51\0\2\14\1\0\12\14\1\0"+
    "\7\14\1\200\17\14\23\0\2\14\1\0\12\14\1\0"+
    "\5\14\1\63\21\14\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6776];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\31\1\2\0\2\1\1\0"+
    "\3\1\1\0\30\1\1\0\1\11\2\0\4\1\2\0"+
    "\23\1\2\0\3\1\2\0\13\1\2\0\7\1\1\0"+
    "\3\1\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
StringBuilder answer=new StringBuilder();
private void handle_key_words(String s){
    answer.append(s+"\n");
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner_phase1(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public String yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { answer.append(yytext()+"\n");
            }
            // fall through
          case 9: break;
          case 2:
            { 
            }
            // fall through
          case 10: break;
          case 3:
            { handle_key_words(yytext());
            }
            // fall through
          case 11: break;
          case 4:
            { answer.append("T_INTLITERAL "+yytext()+"\n");
            }
            // fall through
          case 12: break;
          case 5:
            { answer.append("T_ID "+yytext()+"\n");
            }
            // fall through
          case 13: break;
          case 6:
            { answer.append("T_DOUBLELITERAL "+yytext()+"\n");
            }
            // fall through
          case 14: break;
          case 7:
            { answer.append("T_STRINGLITERAL "+yytext()+"\n");
            }
            // fall through
          case 15: break;
          case 8:
            { answer.append("T_BOOLEANLITERAL "+yytext()+"\n");
            }
            // fall through
          case 16: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
