package classes;

public enum ID {
    
    SOLO(' ',1),
    MACA('+',2),
    CARNE('$',3),
    POTION('#',4),
    COGUMELO('<',5),
    FASTFOOD('>',6),
    TREE(':',7),
    ATOR0(8),
    ATOR1(9),
    ATOR2(10),
    ATOR3(11),
    ATOR4(12),
    ATOR5(13),
    ATOR6(14),
    ATOR7(15),
    ATOR8(16),
    ATOR9(17),
    ATOR10(18),
    ATOR11(19),
    ATOR12(20);
 
    
    private final char charID;
    private final int id;
    
    private ID(char charID, int id) {
    	this.charID = charID;
    	this.id = id;
    }

    private ID(int id) {
        this.charID = '\0';
        this.id = id;
    }
    
    public int getIntID() {
    	return this.id;
    }
    
    public char getCharID() {
    	return this.charID;
    }

}