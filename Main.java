interface Mammal{

  public void speak();
  // public void sleep();
  public void mate(Mammal x);
  // public void eat();
}


class Feline implements Mammal{

  public void speak(){
    System.out.println("Roar");
  }

public void mate(Mammal x){

  if(x instanceof Feline)
     System.out.println(x + " is a mate of "+ this);
  else
     System.out.println(x + " is not a mate of "+ this);
}

public void eat(){
  System.out.println("Not vegitarian small meats");
}

public void sleep(){
  System.out.println("18 hrs");
}

}

class Canine implements Mammal{

    public void speak(){
    
    System.out.println("Woof");
  }

  public void mate(Mammal x){

  if(x instanceof Canine)
     System.out.println(x + " is a mate of "+ this);
  else
     System.out.println(x + " is not a mate of "+ this);
}
public void eat(){
  System.out.println("Not vegitarian meats");
}

public void sleep(){
  System.out.println("18 hrs");
}

}

class Lion extends Feline{

 public void speak(){
    System.out.println("I am a Lion");
    super.speak();
  }

public String toString(){

  return "Lion";
}
public void eat(){
  System.out.println("Not vegitarian small meats");
}

public void sleep(){
  System.out.println("18 hrs");
}

}

class Tiger extends Feline{

  public void speak(){
    System.out.println("I am a Tiger");
    super.speak();
  }

  public String toString(){

  return "Tiger";
}
public void eat(){
  System.out.println("Not vegitarian small meats");
}

public void sleep(){
  System.out.println("18 hrs");
}
}

class Wolf extends Canine{

  public String toString(){

  return "Wolf";
}

}
class Main {
  public static void main(String[] args) {
   
    Lion L1 = new Lion();
    Tiger T1 = new Tiger();
    Wolf W1 = new Wolf();

     L1.speak();
     L1.eat();
     L1().
     W1.speak();

    L1.mate(T1);
    L1.mate(W1);

  }
}