package classes;

public enum ID {
    
    SOLO(' ',1),
    MACA('+',2),
    CARNE('$',3),
    POTION('#',4),
    COGUMELO('<',5),
    FASTFOOD('>',6),
    TREE(':',7),
    CIGARRO('-',8),
    ATOR0(9),
    ATOR1(10),
    ATOR2(11),
    ATOR3(12),
    ATOR4(13),
    ATOR5(14),
    ATOR6(15),
    ATOR7(16),
    ATOR8(17),
    ATOR9(18),
    ATOR10(19),
    ATOR11(20),
    ATOR12(21);
 
    
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