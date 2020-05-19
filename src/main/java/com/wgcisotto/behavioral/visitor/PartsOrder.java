package com.wgcisotto.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder {

    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder(){

    }

    public void addPart(AtvPart part){
        parts.add(part);
    }

    public List<AtvPart> getParts(){
        return Collections.unmodifiableList(parts);
    }

//    public double calculateShipping(){
//        return parts.stream().mapToDouble(AtvPart::calculateShipping).sum();
//    }

  //  @Override
    public void accept(AtvPartVisitor visitor){
        parts.forEach(part -> part.accept(visitor));
        visitor.visit(this);

    }


}
