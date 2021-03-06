package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */
public class Address {
    private int num;
    private TypeAddress type;
    private VarType varType;

    public Address(int num, VarType varType, TypeAddress type) {
        this.num = num;
        this.type = type;
        this.varType = varType;
    }

    public Address(int num, VarType varType) {
        this.num = num;
        this.type = TypeAddress.Direct;
        this.varType = varType;
    }
    public String toString(){
        switch (type){
            case Direct:
                return num+"";
            case Indirect:
                return "@"+num;
            case Imidiate:
                return "#"+num;
        }
        return num+"";
    }

    public int getNum() {
        return num;
    }

    public TypeAddress getType() {
        return type;
    }

    public VarType getVarType() {
        return varType;
    }
}
