
We will mostly be using composite design pattern while designing File System. 
For any hierarchical system, instead of doing operations on all the individual components, i can instead bind the elements together to form a new component and that will act similar to my individual component.
Let's say i have light, fan in my room then i will have multiple rooms, then i will have floor consisting of multiple rooms, then i will have multiple floors (one building)

light1, fan1 -> room1
light2, fan2 -> room2

room1, room2 -> floor1


floor1, floor2 -> building1

Now what my composite pattern says is implement everything using a single interface that acts as the binding factor 

public interface SmartComponent {
    void turnOn();
    void turnOff();
}

class AC implements SmartComponent {
    // override methods 
}

class Light implements SmartComponent {
    // override methods 
}

class Room implements SmartComponent {
    List<SmartComponent> appliances;
    // override methods using for loop, for every appliance do the thing 
}

continue in the way of building from bottom up 
