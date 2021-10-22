package day17.inter;

import com.sun.corba.se.impl.ior.StubIORImpl;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

public abstract class Animal {

    String name;
    int age;
    String kind;

    public abstract void play();
}
