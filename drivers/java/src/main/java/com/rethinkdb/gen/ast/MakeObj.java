// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/ast/MakeObj.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class MakeObj extends ReqlExpr {

    public MakeObj(Object arg) {
        this(new Arguments(arg), null);
    }
    public MakeObj(OptArgs opts){
        this(new Arguments(), opts);
    }
    public MakeObj(Arguments args){
        this(args, null);
    }
    public MakeObj(Arguments args, OptArgs optargs) {
        this(TermType.MAKE_OBJ, args, optargs);
    }
    protected MakeObj(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }

    public static MakeObj fromMap(java.util.Map<String, ReqlAst> map){
        return new MakeObj(OptArgs.fromMap(map));
    }
}